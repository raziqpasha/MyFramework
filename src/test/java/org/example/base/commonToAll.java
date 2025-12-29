package org.example.base;

import org.example.driver.DriverManger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class commonToAll {

    @BeforeMethod
    public void setup() {
        DriverManger.init();
    }

    @AfterMethod
    public void tearDown() {
        DriverManger.down();
    }
}
