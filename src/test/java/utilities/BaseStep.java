package utilities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep {
    // Initialization
    public static WebDriver driver=null;
    public static HomePage homePage=null;
    public static LoginPage loginPage=null;
    public static ProductListingPage productListingPage=null;
    public static ProductDetailPage productDetailPage=null;
    public static MyCartPage myCartPage=null;

    //Page Classes Initialization
    protected void setupCucumber () {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver= SettingBrowser.StartBrowser("chrome");
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
        productListingPage=new ProductListingPage(driver);
        productDetailPage=new ProductDetailPage(driver);
        myCartPage=new MyCartPage(driver);
    }

    protected void teardown(){
        driver.close();
        driver.quit();
    }
}
