package org.example.Utils;

import org.openqa.selenium.WebDriver;

/**
 * WindowHandleUtil
 * Reusable window handling utility
 */
public class WindowHandleUtil {

    /**
     * Switch to child window from parent
     * Assumes exactly one child window is opened
     */
    public static void switchToChildWindow(WebDriver driver) {
        String parent = driver.getWindowHandle();           // Store current window
        for (String window : driver.getWindowHandles()) {   // Loop through all windows
            if (!window.equals(parent)) {
                driver.switchTo().window(window);           // Switch to child
                break;
            }
        }
    }

    /**


    /**
     * Get current window handle (parent window)
     */
    public static String getCurrentWindowHandle(WebDriver driver) {
        return driver.getWindowHandle();
    }
}

