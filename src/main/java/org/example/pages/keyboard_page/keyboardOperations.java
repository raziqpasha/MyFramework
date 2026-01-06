package org.example.pages.keyboard_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.Utils.KeyboardActionsUtil.*;
import static org.example.driver.DriverManger.getDriver;

public class keyboardOperations {
    WebDriver driver;
    public keyboardOperations(WebDriver driver){
        this.driver=driver;
    }


private By srch = By.xpath("//div[@class=\"RjvT8t\"]//input[@title=\"Search for Products, Brands and More\"]");
    public  void keyboardoperations(){
        getDriver().get("https://www.salesforce.com/form/developer-signup/?d=pb");
//        WebElement ele = getDriver().findElement(srch);
//
//        pressEnter(ele);

        WebElement element = driver.findElement(By.xpath("//input[@id=\"UserFirstName-XqUs\"]"));
        element.sendKeys("raziqpasha");
        pressArrowDown(element);
    }
}
