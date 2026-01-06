package org.example.test.pageobjectmodelTest.myntra;

import org.example.base.commonToAll;
import org.example.driver.DriverManger;
import org.example.listeners.RetryAnalyzer;
import org.example.listeners.ScreenshotListener;
import org.example.pages.page_om_myntra.myntra_improved_pages;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.sql.Driver;


@Listeners(ScreenshotListener.class)
public class myntra_improved_testcase extends commonToAll {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testscript(){
        WebDriver driver=DriverManger.getDriver();
        myntra_improved_pages myntraImprovedPages = new myntra_improved_pages(driver);
        myntraImprovedPages.myntra_productsearch();
    }

}
