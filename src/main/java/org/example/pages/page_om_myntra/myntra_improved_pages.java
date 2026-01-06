package org.example.pages.page_om_myntra;

import org.example.Utils.PropertiesReader;
import org.example.base.commonTo_myntra;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.base.commonTo_myntra.*;
/*Scenario:

1. Open Myntra website.

2. Search for "Bag".

3. Click on the 7th result (requires List handling).

4. Switch to the new tab (product opens in a new window).

5. Click "Add to Cart".

6. Go to Cart and click "Remove".

7. Handle the confirmation popup.

[JAVA + SELENIUM CODE SOLUTION] */

public class myntra_improved_pages {
    WebDriver driver;

    public myntra_improved_pages(WebDriver driver){
        this.driver=driver;
    }

    //locators

    private  By search_item = By.xpath("//input[@placeholder=\"Search for products, brands and more\"]");
    private  By product_7th = By.xpath("(//li[@class='product-base']//img)");
    private  By add_t_cart = By.xpath("//div[text()='ADD TO BAG']");

    private  By bag_productstored = By.xpath("//span[@class=\"myntraweb-sprite desktop-iconBag sprites-headerBag\"]");
    private  By remove_product = By.xpath("//button[text()='REMOVE']");

    private  By remove_popup = By.xpath("//div[@class='modal-base-modal bulkActionStrip-confirmationModalDesktop']//button[text()='REMOVE']");


    //Actions

    public void myntra_productsearch(){
       openurl();
        enterInput(search_item, PropertiesReader.readKey("product_details"));
       // clickelemet(product_7th);
        clickelemet(product_7th,6);
        windowhandle();
        clickelement(add_t_cart);
        clickelement(bag_productstored);
        clickelement(remove_product);
        clickelement(remove_popup);

    }

}
