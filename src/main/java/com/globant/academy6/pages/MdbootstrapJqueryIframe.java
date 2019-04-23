package com.globant.academy6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MdbootstrapJqueryIframe extends BasePage {

    public MdbootstrapJqueryIframe(WebDriver pDriver) {
        super(pDriver);
        pDriver.get("https://mdbootstrap.com/plugins/jquery/iframe/");
    }

    @FindBy(xpath = "//*[@id=\"youtube\"]/section[1]")
    private WebElement youtubeIframe;

    @FindBy(className = "ytp-time-current")
    private WebElement time;

    Actions hover = new Actions(getWebDriver());

    public void play() {

        getWebDriver().manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("window.scrollBy(0,1000)");
        getWebDriver().switchTo().frame(0);
        getWebDriver().findElement(By.className("ytp-large-play-button")).click();
        getWebDriver().switchTo().defaultContent();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        youtubeIframe.click();
        getWebDriver().switchTo().frame(0);
        System.out.println(time.getText());
    }
}
