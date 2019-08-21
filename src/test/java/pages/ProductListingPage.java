package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BasePage;

public class ProductListingPage extends BasePage {
    public ProductListingPage(WebDriver driver) { super(driver); }

    //*******Web Elements*****
    By secondPageBy= By.xpath(".//div[@class='pagination']/a[2]");
    By productImagHrefBy=By.xpath(".//div[@class='pro']//img");

    //********Page Methods*****
    public void clickSecondPage() {
        move(secondPageBy);
        waitAndClick(secondPageBy);
        waitImplicitly();
    }

    public void clickRandomProduct(){
        clickRandomElement(productImagHrefBy);
    }
}
