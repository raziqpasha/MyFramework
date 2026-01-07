package org.example.test.pageobjectmodelTest;

import io.qameta.allure.Description;
import org.example.Utils.PropertiesReader;
import org.example.base.commonToAll;
import org.example.driver.DriverManger;
import org.example.pages.pageObjectModel.vwo_normal_pages.DashBoardPage;
import org.example.pages.pageObjectModel.vwo_normal_pages.FreeTrail;
import org.example.pages.pageObjectModel.vwo_normal_pages.LoginPage;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class vwo_login_Test extends commonToAll {

    @Description("Verify with invalid emial,password")
    @Test
    public void testcase_login_negative() {
        //drivermanager -1
        WebDriver driver = DriverManger.getDriver();

        //pageclass (pom)-2
        LoginPage loginPage = new LoginPage(driver);
         String errr_msg=loginPage.login_vwo_invalid_cred(
                 PropertiesReader.readKey("username"),
                 PropertiesReader.readKey("password"));

         assertThat(errr_msg).isNotBlank().isNotEmpty().isNotNull();

    }

    @Test
    public  void testcase_with_freeTrail(){
        WebDriver driver = DriverManger.getDriver();

        System.out.println("ENV = " + System.getProperty("env"));
        System.out.println("URL = " + PropertiesReader.getURL());


        FreeTrail freeTrail = new FreeTrail(driver);
        freeTrail.start_with_free_trail(PropertiesReader.readKey("illegal_email"));

        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        dashBoardPage.dashboardpage_validations();

    }


}