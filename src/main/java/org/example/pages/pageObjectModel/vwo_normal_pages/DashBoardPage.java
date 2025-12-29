package org.example.pages.pageObjectModel.vwo_normal_pages;

import org.openqa.selenium.WebDriver;

public class DashBoardPage {

    WebDriver driver;

    public DashBoardPage(WebDriver driver){
        this.driver = driver;
    }

    public String dashboardpage_validations(){
       return driver.getCurrentUrl();
    }
}
