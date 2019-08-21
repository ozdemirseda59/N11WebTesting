@ProductListing
Feature: Product Listing Section
  Scenario: Successfully product listing by search box on Home Page
    Given I am on the www.n11.com web site
    When I enter Searchbox button "bilgisayar " on Home Page
    Then I should see page url contains "bilgisayar"
    And  I should see listed of related products on Product Listing Page

    Scenario: Succesfully click second page on Listing Pag
      Given I am on the Product Listing Page
      When  I click second page
      Then  I should see page url contains "pg=2"