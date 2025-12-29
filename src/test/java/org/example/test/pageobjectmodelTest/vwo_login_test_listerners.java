package org.example.test.pageobjectmodelTest;

import io.qameta.allure.Owner;
import org.example.Utils.PropertiesReader;
import org.example.base.commonToAll;
import org.example.listeners.RetryAnalyzer;
import org.example.listeners.ScreenshotListener;
import org.example.pages.pageObjectModel.vwo_improved_pages.LoginPage_improved;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.example.driver.DriverManger.getDriver;

@Listeners(ScreenshotListener.class)
public class vwo_login_test_listerners extends commonToAll {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void logintest_listerns_pass(){

        LoginPage_improved loginPageImproved = new LoginPage_improved(getDriver());
        String error =loginPageImproved.loginwithinvaliscred_improved(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        Assert.assertEquals(error,PropertiesReader.readKey("error-message"));
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Owner("raziq")
    public void logintest_listerns_fail(){

        LoginPage_improved loginPageImproved = new LoginPage_improved(getDriver());
        String error =loginPageImproved.loginwithinvaliscred_improved(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        Assert.assertEquals(error,PropertiesReader.readKey("invalid_error_message"));
    }
}
