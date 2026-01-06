package org.example.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

/**
 * FrameUtil
 * Reusable utility for switching between frames in Selenium
 */
public class FrameUtil {

    /**
     * Switch to frame using WebElement
     */
    public static void switchToFrame(WebDriver driver, WebElement frameElement) {
        driver.switchTo().frame(frameElement);
    }

    /**
     * Switch to frame using By locator
     */
    public static void switchToFrame(WebDriver driver, By by) {
        WebElement frame = driver.findElement(by);
        driver.switchTo().frame(frame);
    }

    /**
     * Switch to frame using index
     * index = 0 → first frame, 1 → second frame, etc.
     */
    public static void switchToFrame(WebDriver driver, int index) {
        driver.switchTo().frame(index);
    }

    /**
     * Switch back to main page (default content)
     */
    public static void switchToDefault(WebDriver driver) {
        driver.switchTo().defaultContent();
    }

    /**
     * Switch to parent frame (one level up)
     */
    public static void switchToParentFrame(WebDriver driver) {
        driver.switchTo().parentFrame();
    }
}
