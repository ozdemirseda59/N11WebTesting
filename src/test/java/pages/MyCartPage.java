package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BasePage;

public class MyCartPage extends BasePage {
    public MyCartPage(WebDriver driver) { super(driver); }

    By productPriceBy= By.className("price");
    By removoProductBy=By.xpath(".//span[contains(@class,'removeProd')]");
    By cartEmtyBy=By.className("cartEmptyText");


    //******Page Methods************
    public void verifyProductPrice() throws Exception {
        checkForTextContains(productPriceBy,ProductDetailPage.productPrice);
        takeScreenshot("MyCart");
    }

    public void removeProduct(){ waitAndClick(removoProductBy); }

    public void verifyCartEmty(){waitVisibility(cartEmtyBy);}
}

