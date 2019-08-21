package tests.cucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseStep;

public class HomePageSteps extends BaseStep {
    @Before
    public void setup(){setupCucumber();}

    @When("I go to www.n{int}.com web site")
    public void iGoToWwwNComWebSite(int arg0) { homePage.goToN11();}

    @Then("I should see page title equals {string}")
    public void iShouldSeePageTitleEquals(String arg0) { homePage.checkForTitleEquals(arg0);}

     @After
    public void close(){teardown();}

}
