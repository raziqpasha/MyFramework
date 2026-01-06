package org.example.pages.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    By search_item = By.xpath("//input[@placeholder=\"Search for products, brands and more\"]");
    By product_7th = By.xpath("(//li[@class='product-base']//img)");
    By add_t_cart = By.xpath("//div[text()='ADD TO BAG']");

    By bag_productstored = By.xpath("//span[@class=\"myntraweb-sprite desktop-iconBag sprites-headerBag\"]");
    By remove_product = By.xpath("//button[text()='REMOVE']");

    By remove_popup = By.xpath("//button[text()='REMOVE']");

}
