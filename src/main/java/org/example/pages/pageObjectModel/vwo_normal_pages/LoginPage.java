package org.example.pages.pageObjectModel.vwo_normal_pages;

import org.example.Utils.PropertiesReader;
import org.example.Utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //define driver
    WebDriver driver;

    //define the contructor
   public LoginPage( WebDriver driver){
        this.driver=driver;
    }

    //define locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    // If you are not using it , don't keep.
    //private By signBySSO = By.xpath("//button[normalize-space()='Sign in using SSO']");

    //define action class -> valid
    public void login_vwo_valid_cred(String user,String pass){

        driver.get(PropertiesReader.readKey("url"));
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(signButton).click();

//        WaitHelpers.checkVisibilityofelement(driver,error_message,10);
//
//        String err_message = driver.findElement(error_message).getText();
//        return err_message;
    }


    //define action class -> invalid

    public String login_vwo_invalid_cred(String user,String pass){

        driver.get(PropertiesReader.readKey("url"));
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(signButton).click();

        WaitHelpers.checkVisibilityofelement(driver,error_message,10);

        String err_message = driver.findElement(error_message).getText();
        return err_message;
    }
}
