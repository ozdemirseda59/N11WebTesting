@AddProductToCart
Feature: Add Product To Cart Section

  Scenario Outline: Successfully adding the product to the cart by login in
    Given I am on the www.n11.com web site
    When I click Giris Yap button on Home Page
    And  I fill E-Posta field with "<email>" and Sifre field with "<password>" and click Giris Yap on LoginPage
    Then  I should see page title equals "n11.com - Alışverişin Uğurlu Adresi"
    When I enter Searchbox button "bilgisayar" on Home Page
    Then I should see page url contains "bilgisayar"
    When I click second page
    Then I should see page url contains "pg=2"
    When I click random product on Product Listing page
    Then I should see page url contains "-P"
    When I click Sepete Ekle button If the product is in stock on Product Detail Page
    And  I verify Product Price on my Cart
    And  I increase number of product
    Then I should see that the product quantity is "2"
    When I go to my basket
    And  I delete the product from the basket
    Then I should see my basket is empty

    Examples: Valid User
      | email                 | password |
      |ozdemirseda59@gmail.com|12345TesT!|