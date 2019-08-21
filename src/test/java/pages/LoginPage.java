package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) { super(driver); }

    //*****Web Elements********
    By emailBy =  By.id("email");
    By passwordBy=By.id("password");
    By loginButtonBy=By.id("loginButton");

    //*****Page Methods******
    public void loginToN11 (String email, String password){
        sendText(emailBy,email);
        sendText(passwordBy,password);
        waitAndClick(loginButtonBy);
    }
}
