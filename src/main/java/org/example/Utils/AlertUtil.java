package org.example.Utils;

import org.openqa.selenium.Alert;

import static org.example.Utils.WaitHelpers.webdriverwait_for_Alert;
import static org.example.driver.DriverManger.getDriver;

public class AlertUtil {

    public static void acceptAlert() {
  //getDriver().switchTo().alert().accept();
        webdriverwait_for_Alert().accept();
    }

    public static String getAlertText() {
       // return getDriver().switchTo().alert().getText();
        return webdriverwait_for_Alert().getText();
    }

    public static void dismissAlert() {
   //getDriver().switchTo().alert().dismiss();
        webdriverwait_for_Alert().dismiss();

    }
}

