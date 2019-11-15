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
package com.hpe.caf.languagedetection.fasttext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rado
 */
public class FastTextWrapperTest
{

//    @Test
    public void testDetect()
    {
        try {
            FastTextWrapper.detect(new FileInputStream("C:\\Users\\strakar\\src\\caf\\worker-languagedetection\\language-detection-fasttext\\chinese_manx.yaml.testcase"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FastTextWrapperTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
