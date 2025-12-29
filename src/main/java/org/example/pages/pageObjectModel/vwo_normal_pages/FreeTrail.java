package org.example.pages.pageObjectModel.vwo_normal_pages;

import org.example.Utils.PropertiesReader;
import org.example.Utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreeTrail {

     WebDriver driver;

   public FreeTrail(WebDriver driver){
        this.driver=driver;
    }

    //locators
    By click_freeTrail = By.xpath("//a[contains(text(),'Start a free trial')]");

    By business_email = By.xpath("//div[@class=\"Mb(5px)\"]//input[@id=\"page-v1-step1-email\"]");

    By agree_checkbox = By.xpath("//div[@class=\"D(f) Ai(b) \"]//input[@id=\"page-free-trial-step1-cu-gdpr-consent-checkbox\"]");

    By submit_createfreeTrail = By.xpath("//button[text()='Create a Free Trial Account']");

    //actions
    public void start_with_free_trail(String wrn_email){
        driver.get(PropertiesReader.readKey("url"));


        WaitHelpers.waitForElementToBeClickable(driver,click_freeTrail,10).click();

        WaitHelpers.visibilityOfElement(business_email).sendKeys(wrn_email);

        WaitHelpers.waitForElementToBeClickable(driver,agree_checkbox,10).click();

        WaitHelpers.waitJVM(5);
        WaitHelpers.waitForElementToBeClickable(driver,submit_createfreeTrail,10).click();
        WaitHelpers.waitJVM(5);

    }
}
