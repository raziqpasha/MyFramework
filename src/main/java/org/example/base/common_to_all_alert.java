package org.example.base;

import org.openqa.selenium.By;

import static org.example.driver.DriverManger.getDriver;

public class common_to_all_alert {

    public static void openUrl(){
        getDriver().get("https://omayo.blogspot.com/");

    }

//    public static void clickforalertButton(By by){
//        getDriver().findElement(by).click();
//    }
}
