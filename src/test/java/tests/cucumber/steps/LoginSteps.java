package tests.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utilities.BaseStep;

public class LoginSteps extends BaseStep {

    @Given("I am on the www.n{int}.com web site")
    public void iAmOnTheHttpsWwwNComWebSite(int arg0) { homePage.goToN11();}

    @When("I click Giris Yap button on Home Page")
    public void iClickGirisYapButtonOnHomePage() throws Exception { homePage.goToLoginPage(); }

    @And("I fill E-Posta field with {string} and Sifre field with {string} and click Giris Yap on LoginPage")
    public void iFillEPostaFieldWithAndSifreFieldWithAndClickGirisYapOnLoginPage(String arg0, String arg1) {loginPage.loginToN11(arg0,arg1); }

}
