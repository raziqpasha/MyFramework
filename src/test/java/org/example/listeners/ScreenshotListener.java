package org.example.listeners;

import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.example.driver.DriverManger.getDriver;
//ITestListener is a TestNG listener interface
//It listens to test events like:test failure ✅

public class ScreenshotListener implements ITestListener {
//This method is automatically called by TestNG
//ITestResult result contains:
//test name
//status (PASS / FAIL)
//test class object
//error details
    @Override
    public void onTestFailure(ITestResult result) {
//Gets the current running test class
        Object testClass = result.getInstance();
        WebDriver driver = getDriver();

        //Gets the failed test method name
        String methodName = result.getName();
//Adds date + time
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

        if (driver != null) {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                String screenshotPath = "failure_screenshots/" + methodName + "_" +
                        formatter.format(calendar.getTime()) + ".png";
                FileUtils.copyFile(scrFile, new File(screenshotPath));

                // Add screenshot link to TestNG report
                org.testng.Reporter.log("<a href='" + screenshotPath + "'> Screenshot</a>");
                //Attaches screenshot to Allure report
                //Shows image directly inside Allure UI
                Allure.addAttachment("Screenshot", "image/png", screenshotPath, "png");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
