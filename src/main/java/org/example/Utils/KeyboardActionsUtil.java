package org.example.Utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.example.driver.DriverManger.getDriver;

/**
 * KeyboardActionsUtil
 * All keyboard actions are performed on a WebElement
 * Fully reusable, commented, framework-ready
 */
public class KeyboardActionsUtil {

    // Create Actions instance for current driver
    private static Actions actions() {
        return new Actions(getDriver());
    }

    // ================= BASIC KEYS =================

    /** Press ENTER key on the element (e.g., submit form or search) */
    public static void pressEnter(WebElement element) {
        actions().sendKeys(element, Keys.ENTER).perform();
    }

    /** Press TAB key on the element to move focus to next field */
    public static void pressTab(WebElement element) {
        actions().sendKeys(element, Keys.TAB).perform();
    }

    /** Press ESCAPE key on the element to close popups or modals */
    public static void pressEscape(WebElement element) {
        actions().sendKeys(element, Keys.ESCAPE).perform();
    }

    /** Press BACKSPACE key on the element to delete previous character */
    public static void pressBackspace(WebElement element) {
        actions().sendKeys(element, Keys.BACK_SPACE).perform();
    }

    /** Press DELETE key on the element to delete next character */
    public static void pressDelete(WebElement element) {
        actions().sendKeys(element, Keys.DELETE).perform();
    }

    /** Press SPACE key on the element (e.g., select checkbox or space input) */
    public static void pressSpace(WebElement element) {
        actions().sendKeys(element, Keys.SPACE).perform();
    }

    // ================= ARROW KEYS =================

    /** Press ARROW DOWN key on the element (navigate dropdowns or lists) */
    public static void pressArrowDown(WebElement element) {
        actions().sendKeys(Keys.ARROW_DOWN).perform();
    }

    /** Press ARROW UP key on the element */
    public static void pressArrowUp(WebElement element) {
        actions().sendKeys(element, Keys.ARROW_UP).perform();
    }

    /** Press ARROW LEFT key on the element (move cursor left) */
    public static void pressArrowLeft(WebElement element) {
        actions().sendKeys(element, Keys.ARROW_LEFT).perform();
    }

    /** Press ARROW RIGHT key on the element (move cursor right) */
    public static void pressArrowRight(WebElement element) {
        actions().sendKeys(element, Keys.ARROW_RIGHT).perform();
    }

    // ================= SHORTCUT KEYS =================

    /** CTRL + A: Select all text in the element */
    public static void selectAll(WebElement element) {
        actions().click(element)
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .perform();
    }

    /** CTRL + C: Copy text from the element */
    public static void copy(WebElement element) {
        actions().click(element)
                .keyDown(Keys.CONTROL)
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .perform();
    }

    /** CTRL + V: Paste text into the element */
    public static void paste(WebElement element) {
        actions().click(element)
                .keyDown(Keys.CONTROL)
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .perform();
    }

    /** CTRL + X: Cut selected text from the element */
    public static void cut(WebElement element) {
        actions().click(element)
                .keyDown(Keys.CONTROL)
                .sendKeys("x")
                .keyUp(Keys.CONTROL)
                .perform();
    }

    /** CTRL + Z: Undo action inside the element */
    public static void undo(WebElement element) {
        actions().click(element)
                .keyDown(Keys.CONTROL)
                .sendKeys("z")
                .keyUp(Keys.CONTROL)
                .perform();
    }

    /** CTRL + Y: Redo action inside the element */
    public static void redo(WebElement element) {
        actions().click(element)
                .keyDown(Keys.CONTROL)
                .sendKeys("y")
                .keyUp(Keys.CONTROL)
                .perform();
    }

    // ================= CUSTOM METHODS =================

    /**
     * Send keys to element and copy all typed text
     * Example: search field typing → copy typed text
     */
    public static void sendKeysAndCopy(WebElement element, String text) {
        actions().click(element)          // Focus on element
                .sendKeys(text)         // Type your text
                .keyDown(Keys.CONTROL)  // Hold CTRL
                .sendKeys("a")          // CTRL + A → select all
                .sendKeys("c")          // CTRL + C → copy
                .keyUp(Keys.CONTROL)    // Release CTRL
                .perform();
    }

    /**
     * Send keys to element and paste clipboard content
     */
    public static void sendKeysAndPaste(WebElement element, String text) {
        actions().click(element)
                .sendKeys(text)
                .keyDown(Keys.CONTROL)
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .perform();
    }
}
