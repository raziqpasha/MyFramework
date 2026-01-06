package org.example.Utils;

import org.example.driver.DriverManger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.driver.DriverManger.getDriver;

public class MouseActionsUtil {

    private static Actions actions() {
        return new Actions(getDriver());
    }

    private static WebElement element(By by) {
        return getDriver().findElement(by);
    }

    // ✅ Hover
    public static void hover(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
       WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        actions().moveToElement(element(by)).perform();
    }

    // ✅ Click
    public static void click(By by) {
        actions().click(element(by)).perform();
    }

    // ✅ Double Click
    public static void doubleClick(By by) {
        actions().doubleClick(element(by)).perform();
    }

    // ✅ Right Click
    public static void rightClick(By by) {
        actions().contextClick(element(by)).perform();
    }

    // ✅ Click & Hold
    public static void clickAndHold(By by) {
        actions().clickAndHold(element(by)).perform();
    }

    // ✅ Drag and Drop
    public static void dragAndDrop(By source, By target) {
        actions()
                .dragAndDrop(element(source), element(target))
                .perform();
    }

    // ✅ Drag and Drop by Offset
    public static void dragAndDropByOffset(By by, int x, int y) {
        actions()
                .dragAndDropBy(element(by), x, y)
                .perform();
    }
}
