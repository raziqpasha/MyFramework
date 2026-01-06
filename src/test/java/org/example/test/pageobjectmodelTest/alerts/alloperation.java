package org.example.test.pageobjectmodelTest.alerts;

import org.example.base.commonToAll;
import org.example.listeners.RetryAnalyzer;
import org.example.listeners.ScreenshotListener;
import org.example.pages.Alert_page.alertOperation;
import org.example.pages.keyboard_page.keyboardOperations;
import org.example.pages.mouse_page.mouseOperation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.example.Utils.KeyboardActionsUtil.pressEnter;
import static org.example.driver.DriverManger.getDriver;

@Listeners(ScreenshotListener.class)
public class alloperation extends commonToAll {

   private static final Logger logger = LogManager.getLogger(alloperation.class);
//    alertOperation alertOperation = new alertOperation(getDriver());
//
//    @Test(retryAnalyzer = RetryAnalyzer.class)
//    public  void operations1() {
//        logger.info("these is alert accept popup");
//        alertOperation.getacceptAlert();
//    }
//
//    @Test(retryAnalyzer = RetryAnalyzer.class)
//    public  void operations2() {
//
//        alertOperation.gettextAlert();
//    }
//
//    @Test(retryAnalyzer = RetryAnalyzer.class)
//    public  void operations3() {
//
//        alertOperation.getdismisAlert();
//    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void all_keyboardoperation(){
        logger.info("logger.info(\"TC: Keyboard operation started\");\n");
        keyboardOperations keyboardOperations = new keyboardOperations(getDriver());
        keyboardOperations.keyboardoperations();
    }

//    @Test(retryAnalyzer =RetryAnalyzer.class)
//    public void all_mouseOperation(){
//        mouseOperation mouseOperation = new mouseOperation(getDriver());
//        mouseOperation.mouseaction();
//    }
}
