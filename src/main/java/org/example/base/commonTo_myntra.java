package org.example.base;

import org.example.Utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

import static org.example.driver.DriverManger.getDriver;

public class commonTo_myntra {

    public static void openurl(){

        getDriver().get(PropertiesReader.readKey("Myntra_url"));
    }

    public static void clickelemet(By by,int index){

        getDriver().findElements(by).get(index).click();
    }

    public static void clickelement(By by){
        getDriver().findElement(by).click();
    }

    public static void enterInput(By by, String key) {
        //   return getDriver().findElement(by).sendKeys(key).click();
        WebElement element = getDriver().findElement(by);
        element.clear();
        element.sendKeys(key);
        element.sendKeys(Keys.ENTER);
    }

    public static void windowhandle(){
        // 4. Switch to new tab
        String parentWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                getDriver().switchTo().window(window);
                break;
            }
        }
    }

}
