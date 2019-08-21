package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.BasePage;

import static utilities.BaseStep.productListingPage;

public class ProductDetailPage extends BasePage {
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    By addToCartButtonBy= By.xpath(".//a[contains(@class,'btnAddBasket')]");
    By quantityBy= By.xpath("//input[@type='number']");
    By productPriceBy=By.xpath(".//div[@class='newPrice']/ins");

    public static String productPrice="";

    //*****Page Methods*******
    public void verifyExistsOfAddToCart() throws Exception {
        while (isElementPresent(addToCartButtonBy)==false){
            backNavigate();
            productListingPage.clickRandomProduct();
        }
    }

    public void clickAddToCart() throws Exception {
        takeScreenshot("ProductDetails");
        productPrice= getText(productPriceBy);
        waitAndClick(addToCartButtonBy);
    }

    public void increaseNumberyOfProduct() {
        waitAndClick(quantityBy);
        waitAndClear(quantityBy);
        sendText(quantityBy,"2");
    }

    public void verifyProductQuantity(String quantity){
       waitVisibilityAndFindElement(quantityBy).equals(quantity);
    }

}
