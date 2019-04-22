package com.globant.academy6.tests;

import com.globant.academy6.drivers.MyDriver;
import com.globant.academy6.pages.MdbootstrapJqueryIframe;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {
    MyDriver webDriver;
    private MdbootstrapJqueryIframe iframePage;

    @BeforeSuite(alwaysRun = true)
    @Parameters("browser")
    public void beforeSuite(String browser) {
        webDriver = new MyDriver(browser);
        iframePage = new MdbootstrapJqueryIframe(webDriver.getWebDriver());
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        iframePage.dispose();
    }

    public MdbootstrapJqueryIframe getIframePage() {
        return iframePage;
    }
}
