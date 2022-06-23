package com.saucedemo.solution.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Page Object for Login page.
 */
public class LoginPage extends AbstractBasePage {

    private final By usernameFieldLocator = By.id("user-name");
    private final By passwordFieldLocator = By.id("password");
    private final By submitButtonLocator = By.id("login-button");

    public LoginPage(RemoteWebDriver driver) {
        super(driver);
    }

    @Override
    public String getPagePart() {
        return "";
    }

    /**
     * Log in on page.
     *
     * @param username the name of the user to log in
     */
    public void login(String username) {
        // Create an instance of a Selenium explicit wait to dynamically wait for an element
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // wait for the user name field to be visible and store that element into a variable
        wait.until((driver) -> driver.findElement(usernameFieldLocator).isDisplayed());

        WebElement userNameField = driver.findElement(usernameFieldLocator);
        WebElement passwordField = driver.findElement(passwordFieldLocator);
        WebElement submitButton = driver.findElement(submitButtonLocator);

        userNameField.sendKeys(username);
        passwordField.sendKeys("secret_sauce");
        submitButton.click();
    }

    public boolean isDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(usernameFieldLocator))
                .isDisplayed();
    }

    public void visit() {
        getDriver().navigate().to("https://www.saucedemo.com");
    }
}
