@ProductDetail
Feature: Product Detail section
  Background:
    Given I am on the www.n11.com web site
    When I enter Searchbox button "bilgisayar " on Home Page
    Then I should see page url contains "bilgisayar"

  Scenario: Successfully go to product detail page
    Given I am on the Product Listing Page
    When I click random product on Product Listing page
    Then I should see page url contains "-P"



