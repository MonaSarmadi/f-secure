Feature: HomePage Test

  Background: Open The Home Page
    Given that Mona has open the f secure Home page

  Scenario: Verify For Home Phase Functionality
    Then Mona verify that For Home item is visible
    When Mona drag mouse pointer on For Home item
    Then Mona see For Home items contain F-SECURE TOTAL , F-SECURE SAFE and FREEDOM VPN

  Scenario: Verify For BUSINESS Phase Functionality
    Then Mona verify that For BUSINESS item is visible
    When Mona drag mouse pointer on For BUSINESS item
    Then Mona should only see items containing 'Protection Service for Business', 'F Secure Rapid Detection & Response Service' and 'F-Secure Rapid Detection & Response'

  Scenario: Verify For Country Selector Icon
    When Mona choose her country from country selector icon
    Then Mona should see her country name in the bottom of the page


