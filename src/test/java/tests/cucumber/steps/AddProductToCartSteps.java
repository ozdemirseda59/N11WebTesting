package tests.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseStep;

public class AddProductToCartSteps extends BaseStep {
    @When("I click Sepete Ekle button If the product is in stock on Product Detail Page")
    public void iClickSepeteEkleButtonIfTheProductIsInStockOnProductDetailPage() throws Exception {productDetailPage.clickAddToCart();}

    @Then("I verify Product Price on my Cart")
    public void iVerifyProductPriceOnMyCart() throws Exception { myCartPage.verifyProductPrice();}

    @And("I increase number of product")
    public void iIncreaseNumberOfProduct() { productDetailPage.increaseNumberyOfProduct();}


    @Then("I should see that the product quantity is {string}")
    public void iShouldSeeThatTheProductQuantityIs(String arg0) { productDetailPage.verifyProductQuantity(arg0);}

    @When("I go to my basket")
    public void iGoToMyBasket() throws Exception { homePage.goToMyBasket();}

    @And("I delete the product from the basket")
    public void iDeleteTheProductFromTheBasket() {myCartPage.removeProduct(); }

    @Then("I should see my basket is empty")
    public void iShouldSeeMyBasketIsEmpty() { myCartPage.verifyCartEmty();}
}
