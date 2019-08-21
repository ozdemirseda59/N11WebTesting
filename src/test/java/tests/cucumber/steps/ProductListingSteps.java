package tests.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseStep;

public class ProductListingSteps extends BaseStep {

    @When("I enter Searchbox button {string} on Home Page")
    public void iEnterSearchboxButtonOnHomePage(String arg0) { homePage.productSearch(arg0);}

    @Then("I should see page url contains {string}")
    public void iShouldSeePageUrlContains(String arg0) throws Exception { productListingPage.checkForUrlContains(arg0);}

    @And("I should see listed of related products on Product Listing Page")
    public void iShouldSeeListedOfRelatedProductsOnProductListingPage() { }

    @Given("I am on the Product Listing Page")
    public void iAmOnTheProductListingPage() { }

    @When("I click second page")
    public void iClickSecondPage() { productListingPage.clickSecondPage();}

}
