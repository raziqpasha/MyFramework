package org.example.test.pageobjectmodelTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.example.Utils.PropertiesReader;
import org.example.base.commonToAll;
import org.example.pages.pageObjectModel.vwo_improved_pages.LoginPage_improved;
import org.testng.Assert;
import org.testng.annotations.Test;





import static org.example.driver.DriverManger.getDriver;

public class vwo_login_test_improved extends commonToAll {

private static final Logger logger = LogManager.getLogger(vwo_login_test_improved.class);

    @Test
    public void logintest_improved(){
        logger.info("starting login test with invalid credentials");
        logger.debug("whiel checking the scripts found some compile time error");
        logger.fatal("fatalerro-code is dead");
        logger.error("found error in the script");
        LoginPage_improved loginPageImproved = new LoginPage_improved(getDriver());
        String error =loginPageImproved.loginwithinvaliscred_improved(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        Assert.assertEquals(error,PropertiesReader.readKey("error-message"));
    }
}
