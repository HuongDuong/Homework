@tag
Feature: Test Create an account
  I want to use this template for my feature file

  @createanaccount
  Scenario Outline: Test create an account
    Given I Open browser
    When I click Sign in link
    And I input email "<email>"
    And I click Create an account button
    And I input you personal information and I click radio button select gender "<gender>"
    And I input first name "<firstname>"
    And I input last name "<lastname>"
    And I input email "<email>"
    And I input password "<password>"
    And I input date of birth: day "<day>" and I input month "<month>" and I input year "<year>"
    And I input your address and I input first name "<addfirstname>"
    And I input last name "<addlastname>"
    And I input company "<addcompany>"
    And I input address "<address>"
    And I input address line "<addressline>"
    And I input city "<city>"
    And I input state "<state>"
    And I input postal code "<postalcode>"
    And I input country "<country>"
    And I input additional information "<additionalinformation>"
    And I input home phone "<homephone>"
    And I input mobile phone "<mobilephone>"
    And I input assign an address alias for future reference "<assignaddress>"
    And I click on Register button
    Then I verify result when create an account successfully

    Examples: 
      | email                | gender | firstname | lastname | email                | password | day | month   | year | addfirstname | addlastname | addcompany | address  | addressline | city | state     | postalcode | country       | additionalinformation | homephone | mobilephone | assignaddress |
      | huongduong@gmail.com | Mrs    | Huong     | Duong    | huongduong@gmail.com | 12345678 |   3 | January | 1994 | Huong        | Duong       | cty abc    | Tan Binh | Go Vap      | HCM  | Minnesota |      12345 | United States |              12345678 | 102345678 |   123456789 | TB-HCM        |
