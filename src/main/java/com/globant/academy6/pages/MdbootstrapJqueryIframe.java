package com.globant.academy6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MdbootstrapJqueryIframe extends BasePage {

    public MdbootstrapJqueryIframe(WebDriver pDriver) {
        super(pDriver);
        pDriver.get("https://mdbootstrap.com/plugins/jquery/iframe/");
    }

    public void play() {
        getWebDriver().manage().window().maximize();
        getWebDriver().switchTo().frame(0);
        getWebDriver().findElement(By.className("ytp-large-play-button")).click();
        getWait().pollingEvery(Duration.ofSeconds(20));
        //getWait().withTimeout(Duration.ofMillis(1000));
    }
}
