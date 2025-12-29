package org.example.pages.pageObjectModel.vwo_improved_pages;

import org.example.Utils.WaitHelpers;
import org.example.base.commonTo_All_Page_improved;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_improved extends commonTo_All_Page_improved {
    // Page Class
    // Page Locators
    WebDriver driver;

    public LoginPage_improved(WebDriver driver){
        this.driver = driver;
    }

    // // Step 1 - Page Locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    public String loginwithinvaliscred_improved(String un, String ps) {

        openurl();
        enterInput(username, un);
        enterInput(password, ps);
        clickelemet(signButton);
      return WaitHelpers.checkVisibilityofelement(driver,error_message,10);

    }


}
