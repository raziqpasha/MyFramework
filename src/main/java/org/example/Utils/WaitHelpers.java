package org.example.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

import static org.example.driver.DriverManger.getDriver;

public class WaitHelpers {

    public static void waitJVM(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void implicitWait(WebDriver driver, int time){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public static void checkVisibilityofelement(WebDriver driver, By locator, int time,String wng_email){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(wng_email);
    }

    public static String checkVisibilityofelement(WebDriver driver, By locator, int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return null;
    }

    public static WebElement waitForElementToBeClickable(WebDriver driver, By locator, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public static void checkVisibilityOfElement_And_TextToBePresentInElement(WebDriver driver, By locator,WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        //apply for login butn ex:click-.you see error message
        wait.until(ExpectedConditions.textToBePresentInElement(element, "Your email, password, IP address or location did not match"));

    }

    //check for the visible of element if hidden and text to be present if login don eeroro comes then u shud match that error
    public static void checkVisibilityOf_And_TextToBePresentInElement(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.textToBePresentInElement(element, "Your email, password, IP address or location did not match"));
    }

    public static WebElement fluentWait(WebDriver driver,By locator){
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class);

        WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return error_message;
    }

    public static WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20))
                .until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public static WebElement presenceOfElement(WebDriver driver,By elementLocation) {
        return new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public static WebElement visibilityOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }
    public static WebElement visibilityOfElement(WebElement elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOf(elementLocation));
    }

    public WebElement getElement(By key) {
        return getDriver().findElement(key);
    }


}
