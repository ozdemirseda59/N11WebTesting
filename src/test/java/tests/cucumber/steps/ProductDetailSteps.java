package tests.cucumber.steps;

import cucumber.api.java.en.When;
import utilities.BaseStep;

public class ProductDetailSteps extends BaseStep {

    @When("I click random product on Product Listing page")
    public void iClickRandomProductOnProductListingPage() { productListingPage.clickRandomProduct();}
}
