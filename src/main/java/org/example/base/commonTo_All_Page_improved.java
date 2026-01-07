package org.example.base;

import org.example.Utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.driver.DriverManger.getDriver;

public class commonTo_All_Page_improved {

    public void openurl(){
        getDriver().get(PropertiesReader.getURL());
    }

    public void clickelemet(By by){
        getDriver().findElement(by).click();
    }

    public void enterInput(By by, String key) {
        getDriver().findElement(by).sendKeys(key);
    }

    public String getText(By by){
        return getDriver().findElement(by).getText();
    }

}
