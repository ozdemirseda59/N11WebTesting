package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SettingBrowser {
    public static WebDriver driver;

    public static WebDriver StartBrowser(String BrowserName)
    {
        if (BrowserName.equals("firefox"))
        {
            driver = new FirefoxDriver();
            System.setProperty("webdriver.gecko.driver", ":\\geckodriver.exe");
        }
        else if (BrowserName.equals("chrome"))
        {
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", ":\\chromedriver.exe");
        }
        else if (BrowserName.equals("IE"))
        {
            driver = new InternetExplorerDriver();
            System.setProperty("webdriver.ie.driver", ":\\iexploredriver.exe");
        }

        driver.manage().window().maximize();
        return driver;
    }
}
