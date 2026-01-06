package org.example.pages.mouse_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.Utils.MouseActionsUtil.hover;
import static org.example.driver.DriverManger.getDriver;

public class mouseOperation {

    WebDriver driver;
    public mouseOperation(WebDriver driver){
        this.driver=driver;
    }

    By by = By.xpath("//div[@class=\"yQdBY2\"]//img[@alt=\"Flight Bookings\"]");

    public void mouseaction(){
        getDriver().get("https://www.flipkart.com/");
        hover(by);
    }
}
