/*
 * Copyright 2015-2019 Micro Focus or one of its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hpe.caf.languagedetection.cld2.testing;

import com.google.common.io.ByteStreams;
import com.hpe.caf.languagedetection.*;
import com.hpe.caf.languagedetection.cld2.Cld2DetectorProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * CLD2 Language detection integration test
 */
public class LanguageDetectionCld2IT
{
    private String filename = "contacts.txt";
//    private String filename = "extractEnEsDe.txt";
//    private String filename = "EnErGe.txt";
    
    private LanguageDetectorProvider provider;
    private LanguageDetector detector;
    private LanguageDetectorResult result;
    private LanguageDetectorSettings settings;
    private boolean multiLang;

    public LanguageDetectionCld2IT()
    {
    }

    /**
     * Set up the provider and detector
     *
     * @throws LanguageDetectorException
     */
    @Before
    public void setup() throws LanguageDetectorException
    {
        provider = new Cld2DetectorProvider();
        detector = provider.getLanguageDetector();
    }
    
    @Test
    public void test() throws LanguageDetectorException, IOException
    {
        byte[] bytes = getAllData(filename);
        settings = new LanguageDetectorSettings(true);
        result = detector.detectLanguage(bytes, settings);

        System.out.println("\nCurrent implementation:");
        System.out.println("Status: " + result.getLanguageDetectorStatus());
        for (DetectedLanguage ld : result.getLanguages()) {
            System.out.println(ld.getLanguageCode() + ": " + ld.getConfidencePercentage());
        }
    }
    
    @Test
    public void testLineByLIne() throws LanguageDetectorException, IOException, URISyntaxException
    {
        System.out.println("\nLine by Line:");
        List<String> allLines = Files.readAllLines(Paths.get(this.getClass().getClassLoader().getResource(filename).toURI()));
        runDetection(allLines);
    }
    
    @Test
    public void testWordByWord() throws LanguageDetectorException, IOException, URISyntaxException
    {
        System.out.println("\nWord by word:");
        List<String> allLines = Files.readAllLines(Paths.get(this.getClass().getClassLoader().getResource(filename).toURI()));
        
        List<String> texts = new ArrayList<>();
        for (String line : allLines) {
            texts.addAll(Arrays.asList(line.split(" ")));
        }
        runDetection(texts);
    }

    private void runDetection(final List<String> texts) throws LanguageDetectorException, URISyntaxException, IOException
    {
        settings = new LanguageDetectorSettings(true);
        
        final Map<String, Integer> results = new HashMap<>();
        int totalLength = 0;
        for (final String text : texts) {
            result = detector.detectLanguage(text.getBytes(), settings);

            DetectedLanguage bestMatch = ((ArrayList<DetectedLanguage>)result.getLanguages()).get(0);

            Integer textLength = results.get(bestMatch.getLanguageCode()) != null ? results.get(bestMatch.getLanguageCode()) : 0;
            results.put(bestMatch.getLanguageCode(), textLength + text.length());
            // System.out.println(">>> " + text);
            totalLength += text.length();
        }

        final Map<String, Integer> sorted =
            results.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        
        for (Map.Entry entry : sorted.entrySet()) {            
            System.out.println(entry.getKey() + ": " + ((float)(Integer)entry.getValue()/totalLength));
        }
    }
    
    /**
     * Test text with single language detection. Assert expected results
     *
     * @throws LanguageDetectorException
     * @throws IOException
     */
//    @Test
    public void testSingleLanguage() throws LanguageDetectorException, IOException
    {
        multiLang = false;

        filename = "emailGerman.txt";

        byte[] bytes = getAllData(filename);

        settings = new LanguageDetectorSettings("utf-8", multiLang, "de");

        result = detector.detectLanguage(bytes, settings);

        DetectedLanguage[] arr = result.getLanguages().toArray(new DetectedLanguage[1]);

        Assert.assertEquals(LanguageDetectorStatus.COMPLETED, result.getLanguageDetectorStatus());
        Assert.assertTrue(result.isReliable());//German is the main language here with a much higher percentage therefore result should be reliable
        Assert.assertEquals(1, result.getLanguages().size());

        Assert.assertEquals("de", arr[0].getLanguageCode());
        Assert.assertEquals("GERMAN", arr[0].getLanguageName());
    }

    /**
     * Test text file with multiple languages (3) and assert expected values
     *
     * @throws LanguageDetectorException
     * @throws IOException
     */
//    @Test
    public void testMultiLanguage() throws LanguageDetectorException, IOException
    {
        multiLang = true;
        String[] testCodes = {"de", "es", "en"};
        String[] testNames = {"GERMAN", "SPANISH", "ENGLISH"};

        filename = "extractEnEsDe.txt";

        byte[] bytes = getAllData(filename);

        settings = new LanguageDetectorSettings(multiLang);

        result = detector.detectLanguage(bytes, settings);

        DetectedLanguage[] arr = result.getLanguages().toArray(new DetectedLanguage[3]);

        Assert.assertEquals(LanguageDetectorStatus.COMPLETED, result.getLanguageDetectorStatus());
        Assert.assertTrue(!result.isReliable());//spanish and german have similar language percentages therefore the result is not reliable
        Assert.assertEquals(3, result.getLanguages().size());

        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(testCodes[i], arr[i].getLanguageCode());
            Assert.assertEquals(testNames[i], arr[i].getLanguageName());
        }
    }

    /**
     * Test result obtained from short text with one language. Assert expected values.
     *
     * @throws LanguageDetectorException
     * @throws IOException
     */
//    @Test
    public void testSingleLanguageShortText() throws LanguageDetectorException, IOException
    {
        multiLang = false;

        filename = "extractNLShort.txt";

        byte[] bytes = getAllData(filename);

        settings = new LanguageDetectorSettings(multiLang, "nl");

        result = detector.detectLanguage(bytes, settings);

        DetectedLanguage[] arr = result.getLanguages().toArray(new DetectedLanguage[1]);

        Assert.assertEquals(LanguageDetectorStatus.COMPLETED, result.getLanguageDetectorStatus());
//        Assert.assertFalse(result.isReliable());//spanish and german have similar language percentages therefore the result is not reliable
        Assert.assertEquals(1, result.getLanguages().size());

        Assert.assertEquals("nl", arr[0].getLanguageCode());
        Assert.assertEquals("DUTCH", arr[0].getLanguageName());
    }

    /**
     * Fail test on gibberish text of no language. Assert the results indicate unknown language
     *
     * @throws LanguageDetectorException
     * @throws IOException
     */
//    @Test
    public void testMultipleLanguageGibberish() throws LanguageDetectorException, IOException
    {
        multiLang = true;

        filename = "extractGibberish.txt";

        byte[] bytes = getAllData(filename);

        settings = new LanguageDetectorSettings(multiLang);

        result = detector.detectLanguage(bytes, settings);

        DetectedLanguage[] arr = result.getLanguages().toArray(new DetectedLanguage[3]);

        Assert.assertEquals(LanguageDetectorStatus.FAILED, result.getLanguageDetectorStatus());
        Assert.assertFalse(result.isReliable());//spanish and german have similar language percentages therefore the result is not reliable
        Assert.assertEquals(3, result.getLanguages().size());

        for (int i = 0; i < 3; i++) {
            Assert.assertEquals("un", arr[i].getLanguageCode());
            Assert.assertEquals("Unknown", arr[i].getLanguageName());
        }
    }

    /**
     * test a text file with UCS-2 LE BOM encoded text which is not supported. According to CLD2 all text should be utf-8
     *
     * @throws LanguageDetectorException
     * @throws IOException
     */
//    @Test
    public void testLanguageUCS2() throws LanguageDetectorException, IOException
    {
        multiLang = false;

        filename = "greekUCS2.txt";

        byte[] bytes = getAllData(filename);

        settings = new LanguageDetectorSettings(multiLang);

        result = detector.detectLanguage(bytes, settings);

        DetectedLanguage[] arr = result.getLanguages().toArray(new DetectedLanguage[1]);

        Assert.assertEquals(LanguageDetectorStatus.FAILED, result.getLanguageDetectorStatus());
    }

    /**
     * Read in an entire file into a byte array
     *
     * @param name
     * @return
     * @throws IOException
     */
    private byte[] getAllData(final String name) throws IOException, LanguageDetectorException
    {
        try (InputStream stream = this.getClass().getClassLoader().getResourceAsStream(name)) {
            return ByteStreams.toByteArray(stream);
        } catch (IOException | NullPointerException e) {
            throw new LanguageDetectorException("File could not be converted to byte array. Invalid filename: " + name);
        }
    }
}
