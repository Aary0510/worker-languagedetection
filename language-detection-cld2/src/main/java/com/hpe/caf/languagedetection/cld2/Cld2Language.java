/*
 * Copyright 2015-2017 EntIT Software LLC, a Micro Focus company.
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
package com.hpe.caf.languagedetection.cld2;

/**
 * Interface mapped to the CLD2 C++ Language Enum containing each language and its associated ordinal, which is used to get the language
 * codes and names.
 */
public interface Cld2Language
{
    int ENGLISH = 0;
    int DANISH = 1;
    int DUTCH = 2;
    int FINNISH = 3;
    int FRENCH = 4;
    int GERMAN = 5;
    int HEBREW = 6;
    int ITALIAN = 7;
    int JAPANESE = 8;
    int KOREAN = 9;
    int NORWEGIAN = 10;
    int POLISH = 11;
    int PORTUGUESE = 12;
    int RUSSIAN = 13;
    int SPANISH = 14;
    int SWEDISH = 15;
    int CHINESE = 16;
    int CZECH = 17;
    int GREEK = 18;
    int ICELANDIC = 19;
    int LATVIAN = 20;
    int LITHUANIAN = 21;
    int ROMANIAN = 22;
    int HUNGARIAN = 23;
    int ESTONIAN = 24;
    int TG_UNKNOWN_LANGUAGE = 25;
    int UNKNOWN_LANGUAGE = 26;
    int BULGARIAN = 27;
    int CROATIAN = 28;
    int SERBIAN = 29;
    int IRISH = 30;
    int GALICIAN = 31;
    int TAGALOG = 32;
    int TURKISH = 33;
    int UKRAINIAN = 34;
    int HINDI = 35;
    int MACEDONIAN = 36;
    int BENGALI = 37;
    int INDONESIAN = 38;
    int LATIN = 39;
    int MALAY = 40;
    int MALAYALAM = 41;
    int WELSH = 42;
    int NEPALI = 43;
    int TELUGU = 44;
    int ALBANIAN = 45;
    int TAMIL = 46;
    int BELARUSIAN = 47;
    int JAVANESE = 48;
    int OCCITAN = 49;
    int URDU = 50;
    int BIHARI = 51;
    int GUJARATI = 52;
    int THAI = 53;
    int ARABIC = 54;
    int CATALAN = 55;
    int ESPERANTO = 56;
    int BASQUE = 57;
    int INTERLINGUA = 58;
    int KANNADA = 59;
    int PUNJABI = 60;
    int SCOTS_GAELIC = 61;
    int SWAHILI = 62;
    int SLOVENIAN = 63;
    int MARATHI = 64;
    int MALTESE = 65;
    int VIETNAMESE = 66;
    int FRISIAN = 67;
    int SLOVAK = 68;
    int CHINESE_T = 69;
    int FAROESE = 70;
    int SUNDANESE = 71;
    int UZBEK = 72;
    int AMHARIC = 73;
    int AZERBAIJANI = 74;
    int GEORGIAN = 75;
    int TIGRINYA = 76;
    int PERSIAN = 77;
    int BOSNIAN = 78;
    int SINHALESE = 79;
    int NORWEGIAN_N = 80;
    int X_81 = 81;
    int X_82 = 82;
    int XHOSA = 83;
    int ZULU = 84;
    int GUARANI = 85;
    int SESOTHO = 86;
    int TURKMEN = 87;
    int KYRGYZ = 88;
    int BRETON = 89;
    int TWI = 90;
    int YIDDISH = 91;
    int X_92 = 92;
    int SOMALI = 93;
    int UIGHUR = 94;
    int KURDISH = 95;
    int MONGOLIAN = 96;
    int ARMENIAN = 97;
    int LAOTHIAN = 98;
    int SINDHI = 99;
    int RHAETO_ROMANCE = 100;
    int AFRIKAANS = 101;
    int LUXEMBOURGISH = 102;
    int BURMESE = 103;
    int KHMER = 104;
    int TIBETAN = 105;
    int DHIVEHI = 106;
    int CHEROKEE = 107;
    int SYRIAC = 108;
    int LIMBU = 109;
    int ORIYA = 110;
    int ASSAMESE = 111;
    int CORSICAN = 112;
    int INTERLINGUE = 113;
    int KAZAKH = 114;
    int LINGALA = 115;
    int X_116 = 116;
    int PASHTO = 117;
    int QUECHUA = 118;
    int SHONA = 119;
    int TAJIK = 120;
    int TATAR = 121;
    int TONGA = 122;
    int YORUBA = 123;
    int X_124 = 124;
    int X_125 = 125;
    int X_126 = 126;
    int X_127 = 127;
    int MAORI = 128;
    int WOLOF = 129;
    int ABKHAZIAN = 130;
    int AFAR = 131;
    int AYMARA = 132;
    int BASHKIR = 133;
    int BISLAMA = 134;
    int DZONGKHA = 135;
    int FIJIAN = 136;
    int GREENLANDIC = 137;
    int HAUSA = 138;
    int HAITIAN_CREOLE = 139;
    int INUPIAK = 140;
    int INUKTITUT = 141;
    int KASHMIRI = 142;
    int KINYARWANDA = 143;
    int MALAGASY = 144;
    int NAURU = 145;
    int OROMO = 146;
    int RUNDI = 147;
    int SAMOAN = 148;
    int SANGO = 149;
    int SANSKRIT = 150;
    int SISWANT = 151;
    int TSONGA = 152;
    int TSWANA = 153;
    int VOLAPUK = 154;
    int ZHUANG = 155;
    int KHASI = 156;
    int SCOTS = 157;
    int GANDA = 158;
    int MANX = 159;
    int MONTENEGRIN = 160;
    int AKAN = 161;
    int IGBO = 162;
    int MAURITIAN_CREOLE = 163;
    int HAWAIIAN = 164;
    int CEBUANO = 165;
    int EWE = 166;
    int GA = 167;
    int HMONG = 168;
    int KRIO = 169;
    int LOZI = 170;
    int LUBA_LULUA = 171;
    int LUO_KENYA_AND_TANZANIA = 172;
    int NEWARI = 173;
    int NYANJA = 174;
    int OSSETIAN = 175;
    int PAMPANGA = 176;
    int PEDI = 177;
    int RAJASTHANI = 178;
    int SESELWA = 179;
    int TUMBUKA = 180;
    int VENDA = 181;
    int WARAY_PHILIPPINES = 182;
    int X_183 = 183;
    int X_184 = 184;
    int X_185 = 185;
    int X_186 = 186;
    int X_187 = 187;
    int X_188 = 188;
    int X_189 = 189;
    int X_190 = 190;
    int X_191 = 191;
    int X_192 = 192;
    int X_193 = 193;
    int X_194 = 194;
    int X_195 = 195;
    int X_196 = 196;
    int X_197 = 197;
    int X_198 = 198;
    int X_199 = 199;
    int X_200 = 200;
    int X_201 = 201;
    int X_202 = 202;
    int X_203 = 203;
    int X_204 = 204;
    int X_205 = 205;
    int X_206 = 206;
    int X_207 = 207;
    int X_208 = 208;
    int X_209 = 209;
    int X_210 = 210;
    int X_211 = 211;
    int X_212 = 212;
    int X_213 = 213;
    int X_214 = 214;
    int X_215 = 215;
    int X_216 = 216;
    int X_217 = 217;
    int X_218 = 218;
    int X_219 = 219;
    int X_220 = 220;
    int X_221 = 221;
    int X_222 = 222;
    int X_223 = 223;
    int X_224 = 224;
    int X_225 = 225;
    int X_226 = 226;
    int X_227 = 227;
    int X_228 = 228;
    int X_229 = 229;
    int X_230 = 230;
    int X_231 = 231;
    int X_232 = 232;
    int X_233 = 233;
    int X_234 = 234;
    int X_235 = 235;
    int X_236 = 236;
    int X_237 = 237;
    int X_238 = 238;
    int X_239 = 239;
    int X_240 = 240;
    int X_241 = 241;
    int X_242 = 242;
    int X_243 = 243;
    int X_244 = 244;
    int X_245 = 245;
    int X_246 = 246;
    int X_247 = 247;
    int X_248 = 248;
    int X_249 = 249;
    int X_250 = 250;
    int X_251 = 251;
    int X_252 = 252;
    int X_253 = 253;
    int X_254 = 254;
    int X_255 = 255;
    int X_256 = 256;
    int X_257 = 257;
    int X_258 = 258;
    int X_259 = 259;
    int X_260 = 260;
    int X_261 = 261;
    int X_262 = 262;
    int X_263 = 263;
    int X_264 = 264;
    int X_265 = 265;
    int X_266 = 266;
    int X_267 = 267;
    int X_268 = 268;
    int X_269 = 269;
    int X_270 = 270;
    int X_271 = 271;
    int X_272 = 272;
    int X_273 = 273;
    int X_274 = 274;
    int X_275 = 275;
    int X_276 = 276;
    int X_277 = 277;
    int X_278 = 278;
    int X_279 = 279;
    int X_280 = 280;
    int X_281 = 281;
    int X_282 = 282;
    int X_283 = 283;
    int X_284 = 284;
    int X_285 = 285;
    int X_286 = 286;
    int X_287 = 287;
    int X_288 = 288;
    int X_289 = 289;
    int X_290 = 290;
    int X_291 = 291;
    int X_292 = 292;
    int X_293 = 293;
    int X_294 = 294;
    int X_295 = 295;
    int X_296 = 296;
    int X_297 = 297;
    int X_298 = 298;
    int X_299 = 299;
    int X_300 = 300;
    int X_301 = 301;
    int X_302 = 302;
    int X_303 = 303;
    int X_304 = 304;
    int X_305 = 305;
    int X_306 = 306;
    int X_307 = 307;
    int X_308 = 308;
    int X_309 = 309;
    int X_310 = 310;
    int X_311 = 311;
    int X_312 = 312;
    int X_313 = 313;
    int X_314 = 314;
    int X_315 = 315;
    int X_316 = 316;
    int X_317 = 317;
    int X_318 = 318;
    int X_319 = 319;
    int X_320 = 320;
    int X_321 = 321;
    int X_322 = 322;
    int X_323 = 323;
    int X_324 = 324;
    int X_325 = 325;
    int X_326 = 326;
    int X_327 = 327;
    int X_328 = 328;
    int X_329 = 329;
    int X_330 = 330;
    int X_331 = 331;
    int X_332 = 332;
    int X_333 = 333;
    int X_334 = 334;
    int X_335 = 335;
    int X_336 = 336;
    int X_337 = 337;
    int X_338 = 338;
    int X_339 = 339;
    int X_340 = 340;
    int X_341 = 341;
    int X_342 = 342;
    int X_343 = 343;
    int X_344 = 344;
    int X_345 = 345;
    int X_346 = 346;
    int X_347 = 347;
    int X_348 = 348;
    int X_349 = 349;
    int X_350 = 350;
    int X_351 = 351;
    int X_352 = 352;
    int X_353 = 353;
    int X_354 = 354;
    int X_355 = 355;
    int X_356 = 356;
    int X_357 = 357;
    int X_358 = 358;
    int X_359 = 359;
    int X_360 = 360;
    int X_361 = 361;
    int X_362 = 362;
    int X_363 = 363;
    int X_364 = 364;
    int X_365 = 365;
    int X_366 = 366;
    int X_367 = 367;
    int X_368 = 368;
    int X_369 = 369;
    int X_370 = 370;
    int X_371 = 371;
    int X_372 = 372;
    int X_373 = 373;
    int X_374 = 374;
    int X_375 = 375;
    int X_376 = 376;
    int X_377 = 377;
    int X_378 = 378;
    int X_379 = 379;
    int X_380 = 380;
    int X_381 = 381;
    int X_382 = 382;
    int X_383 = 383;
    int X_384 = 384;
    int X_385 = 385;
    int X_386 = 386;
    int X_387 = 387;
    int X_388 = 388;
    int X_389 = 389;
    int X_390 = 390;
    int X_391 = 391;
    int X_392 = 392;
    int X_393 = 393;
    int X_394 = 394;
    int X_395 = 395;
    int X_396 = 396;
    int X_397 = 397;
    int X_398 = 398;
    int X_399 = 399;
    int X_400 = 400;
    int X_401 = 401;
    int X_402 = 402;
    int X_403 = 403;
    int X_404 = 404;
    int X_405 = 405;
    int X_406 = 406;
    int X_407 = 407;
    int X_408 = 408;
    int X_409 = 409;
    int X_410 = 410;
    int X_411 = 411;
    int X_412 = 412;
    int X_413 = 413;
    int X_414 = 414;
    int X_415 = 415;
    int X_416 = 416;
    int X_417 = 417;
    int X_418 = 418;
    int X_419 = 419;
    int X_420 = 420;
    int X_421 = 421;
    int X_422 = 422;
    int X_423 = 423;
    int X_424 = 424;
    int X_425 = 425;
    int X_426 = 426;
    int X_427 = 427;
    int X_428 = 428;
    int X_429 = 429;
    int X_430 = 430;
    int X_431 = 431;
    int X_432 = 432;
    int X_433 = 433;
    int X_434 = 434;
    int X_435 = 435;
    int X_436 = 436;
    int X_437 = 437;
    int X_438 = 438;
    int X_439 = 439;
    int X_440 = 440;
    int X_441 = 441;
    int X_442 = 442;
    int X_443 = 443;
    int X_444 = 444;
    int X_445 = 445;
    int X_446 = 446;
    int X_447 = 447;
    int X_448 = 448;
    int X_449 = 449;
    int X_450 = 450;
    int X_451 = 451;
    int X_452 = 452;
    int X_453 = 453;
    int X_454 = 454;
    int X_455 = 455;
    int X_456 = 456;
    int X_457 = 457;
    int X_458 = 458;
    int X_459 = 459;
    int X_460 = 460;
    int X_461 = 461;
    int X_462 = 462;
    int X_463 = 463;
    int X_464 = 464;
    int X_465 = 465;
    int X_466 = 466;
    int X_467 = 467;
    int X_468 = 468;
    int X_469 = 469;
    int X_470 = 470;
    int X_471 = 471;
    int X_472 = 472;
    int X_473 = 473;
    int X_474 = 474;
    int X_475 = 475;
    int X_476 = 476;
    int X_477 = 477;
    int X_478 = 478;
    int X_479 = 479;
    int X_480 = 480;
    int X_481 = 481;
    int X_482 = 482;
    int X_483 = 483;
    int X_484 = 484;
    int X_485 = 485;
    int X_486 = 486;
    int X_487 = 487;
    int X_488 = 488;
    int X_489 = 489;
    int X_490 = 490;
    int X_491 = 491;
    int X_492 = 492;
    int X_493 = 493;
    int X_494 = 494;
    int X_495 = 495;
    int X_496 = 496;
    int X_497 = 497;
    int X_498 = 498;
    int X_499 = 499;
    int X_500 = 500;
    int X_501 = 501;
    int X_502 = 502;
    int X_503 = 503;
    int X_504 = 504;
    int X_505 = 505;
    int NDEBELE = 506;
    int X_BORK_BORK_BORK = 507;
    int X_PIG_LATIN = 508;
    int X_HACKER = 509;
    int X_KLINGON = 510;
    int X_ELMER_FUDD = 511;
    int X_COMMON = 512;
    int X_LATIN = 513;
    int X_GREEK = 514;
    int X_CYRILLIC = 515;
    int X_ARMENIAN = 516;
    int X_HEBREW = 517;
    int X_ARABIC = 518;
    int X_SYRIAC = 519;
    int X_THAANA = 520;
    int X_DEVANAGARI = 521;
    int X_BENGALI = 522;
    int X_GURMUKHI = 523;
    int X_GUJARATI = 524;
    int X_ORIYA = 525;
    int X_TAMIL = 526;
    int X_TELUGU = 527;
    int X_KANNADA = 528;
    int X_MALAYALAM = 529;
    int X_SINHALA = 530;
    int X_THAI = 531;
    int X_LAO = 532;
    int X_TIBETAN = 533;
    int X_MYANMAR = 534;
    int X_GEORGIAN = 535;
    int X_HANGUL = 536;
    int X_ETHIOPIC = 537;
    int X_CHEROKEE = 538;
    int X_CANADIAN_ABORIGINAL = 539;
    int X_OGHAM = 540;
    int X_RUNIC = 541;
    int X_KHMER = 542;
    int X_MONGOLIAN = 543;
    int X_HIRAGANA = 544;
    int X_KATAKANA = 545;
    int X_BOPOMOFO = 546;
    int X_HAN = 547;
    int X_YI = 548;
    int X_OLD_ITALIC = 549;
    int X_GOTHIC = 550;
    int X_DESERET = 551;
    int X_INHERITED = 552;
    int X_TAGALOG = 553;
    int X_HANUNOO = 554;
    int X_BUHID = 555;
    int X_TAGBANWA = 556;
    int X_LIMBU = 557;
    int X_TAI_LE = 558;
    int X_LINEAR_B = 559;
    int X_UGARITIC = 560;
    int X_SHAVIAN = 561;
    int X_OSMANYA = 562;
    int X_CYPRIOT = 563;
    int X_BRAILLE = 564;
    int X_BUGINESE = 565;
    int X_COPTIC = 566;
    int X_NEW_TAI_LUE = 567;
    int X_GLAGOLITIC = 568;
    int X_TIFINAGH = 569;
    int X_SYLOTI_NAGRI = 570;
    int X_OLD_PERSIAN = 571;
    int X_KHAROSHTHI = 572;
    int X_BALINESE = 573;
    int X_CUNEIFORM = 574;
    int X_PHOENICIAN = 575;
    int X_PHAGS_PA = 576;
    int X_NKO = 577;
    int X_SUNDANESE = 578;
    int X_LEPCHA = 579;
    int X_OL_CHIKI = 580;
    int X_VAI = 581;
    int X_SAURASHTRA = 582;
    int X_KAYAH_LI = 583;
    int X_REJANG = 584;
    int X_LYCIAN = 585;
    int X_CARIAN = 586;
    int X_LYDIAN = 587;
    int X_CHAM = 588;
    int X_TAI_THAM = 589;
    int X_TAI_VIET = 590;
    int X_AVESTAN = 591;
    int X_EGYPTIAN_HIEROGLYPHS = 592;
    int X_SAMARITAN = 593;
    int X_LISU = 594;
    int X_BAMUM = 595;
    int X_JAVANESE = 596;
    int X_MEETEI_MAYEK = 597;
    int X_IMPERIAL_ARAMAIC = 598;
    int X_OLD_SOUTH_ARABIAN = 599;
    int X_INSCRIPTIONAL_PARTHIAN = 600;
    int X_INSCRIPTIONAL_PAHLAVI = 601;
    int X_OLD_TURKIC = 602;
    int X_KAITHI = 603;
    int X_BATAK = 604;
    int X_BRAHMI = 605;
    int X_MANDAIC = 606;
    int X_CHAKMA = 607;
    int X_MEROITIC_CURSIVE = 608;
    int X_MEROITIC_HIEROGLYPHS = 609;
    int X_MIAO = 610;
    int X_SHARADA = 611;
    int X_SORA_SOMPENG = 612;
    int X_TAKRI = 613;
    int NUM_LANGUAGES = 614;
}
