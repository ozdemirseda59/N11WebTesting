package pages;

import com.sun.jna.platform.win32.WinDef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BasePage;

public class HomePage extends BasePage {

    //*******Constructor*********
    public HomePage(WebDriver driver) { super(driver); }

    String baseURL="https://www.n11.com";

    //******Web Elements*********
    By loginButtonBy= By.className("btnSignIn");
    By searchBoxBy=By.id("searchData");
    By searchBoxButtonBy= By.className("searchBtn");
    By myBasketBy=By.className("myBasket");


    //****Page Methods***********
    public void goToN11(){
        driver.get(baseURL);
    }

    public void goToLoginPage() throws Exception {
        waitAndClick(loginButtonBy);
        checkForUrlContains("giris-yap");
    }

    public void goToMyBasket() throws Exception {
        waitAndClick(myBasketBy);
        checkForUrlContains("sepetim");
    }

    public void productSearch(String text) {
        sendText(searchBoxBy,text);
        waitAndClick(searchBoxButtonBy);
    }

}
