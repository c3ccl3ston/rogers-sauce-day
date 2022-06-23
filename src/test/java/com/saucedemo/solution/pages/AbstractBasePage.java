package com.saucedemo.solution.pages;

import java.time.Duration;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * All page objects inherit from the base page.
 */
public abstract class AbstractBasePage {
    protected final RemoteWebDriver driver;

    public RemoteWebDriver getDriver() {
        return this.driver;
    }

    public WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(5));
    }

    public AbstractBasePage(RemoteWebDriver driver) {
        this.driver = driver;
    }

    public void visit() {
        driver.get("https://www.saucedemo.com/" + getPagePart());
    }

    public abstract String getPagePart();
}
