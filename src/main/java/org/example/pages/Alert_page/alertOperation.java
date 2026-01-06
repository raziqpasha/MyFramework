package org.example.pages.Alert_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.Utils.AlertUtil.*;
import static org.example.Utils.JavaScriptUtil.jsClick;
import static org.example.Utils.WaitHelpers.waitForElementToBeClickable;
import static org.example.Utils.WaitHelpers.waitJVM;
import static org.example.base.common_to_all_alert.openUrl;
import static org.example.driver.DriverManger.getDriver;

public class alertOperation {
    WebDriver driver;
    public alertOperation(WebDriver driver){
        this.driver=driver;
    }
    private By clickToGenAlert = By.xpath("//input[@id=\"alert1\"]");

    public void getacceptAlert() {
        openUrl();
        // clickforalertButton(clickToGenAlert);
        //  waitForElementToBeClickable(getDriver(),clickToGenAlert,10);
        jsClick(clickToGenAlert);
        acceptAlert();
    }

        public void gettextAlert() {
            openUrl();
            jsClick(clickToGenAlert);
            getAlertText();
        }

            public void getdismisAlert(){
                openUrl();
        jsClick(clickToGenAlert);
        dismissAlert();
    }


}
