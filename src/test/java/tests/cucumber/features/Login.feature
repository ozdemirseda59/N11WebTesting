@LoginPage
  Feature: Login Section
    Scenario Outline: Successfully Login to Website
      Given I am on the www.n11.com web site
      When I click Giris Yap button on Home Page
      And  I fill E-Posta field with "<email>" and Sifre field with "<password>" and click Giris Yap on LoginPage
      Then I should see page title equals "n11.com - Alışverişin Uğurlu Adresi"

      Examples: Valid User
        | email                 | password |
        |ozdemirseda59@gmail.com|12345TesT!|
