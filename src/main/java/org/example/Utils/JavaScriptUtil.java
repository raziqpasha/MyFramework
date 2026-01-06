package org.example.Utils;

import org.example.driver.DriverManger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.example.driver.DriverManger.getDriver;

public class JavaScriptUtil {

    // Private JS instance (reusable)
    private static JavascriptExecutor js(){
        return (JavascriptExecutor) getDriver();
    }

    // ✅ JS Click
    public static void jsClick(By by){
        WebElement element = getDriver().findElement(by);
        js().executeScript("arguments[0].click();",element);
    }

    // ✅ Scroll element into view
    public static void scrollIntoView(By by) {
        WebElement element = DriverManger.getDriver().findElement(by);
        js().executeScript("argument[0].scrollIntoView(true);",element);
    }

    // ✅ Scroll down by pixels
    public static void scrollByPixel(int x, int y){
        js().executeScript("window.scrollBy(arguments[0],arguments[1]);,x,y");
    }

    // ✅ Scroll till bottom
    public static void scrollToBottom(){
        js().executeScript("window.scrollTo(0,document.body.scrollHeight);");
}

//This method first clears the field and then sets the value directly using JavaScript.
public static void setValue(By by,String value){
        WebElement element = getDriver().findElement(by);
        js().executeScript("arguments[0].value=' ',arguments[1].value=arguments[1]",element,value);
}

// ✅ Highlight element (debugging)
public static void highlight(By by){
    WebElement element = DriverManger.getDriver().findElement(by);
        js().executeScript("arguments[0].style.broder='3px solid red'",element);
}

    // ✅ Get page title
    public static String getTitle() {
        return (String) js().executeScript("return document.title;");
    }
    // ✅ Refresh page
    public static void refreshPage() {
        js().executeScript("history.go(0);");
    }


}
