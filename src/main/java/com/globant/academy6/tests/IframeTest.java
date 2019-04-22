package com.globant.academy6.tests;

import org.testng.annotations.Test;

public class IframeTest extends BaseTest {

    @Test(testName = "001")
    public void youtubeTest() {
    getIframePage().play();
    }

   /* @Test(testName = "002")
    public void vimeoTest() {

    }*/
}
