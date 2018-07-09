Feature: UI Test

  Background: Open The Page
    Given that Mona has open the f secure job opening page

  Scenario: Verify Interview Phase Functionality
    Then Mona verify that interview phase label is visible
    Then Mona verify that interview phase content is visible

  Scenario: Verify Pagination Functionality
    When Mona clicks pagination button to see next 6 job ads
    Then Mona see the next new job ads

  Scenario: Verify pagination visibility
    Then Mona verify that pagination buttons are visible

  Scenario: Find Quality Engineer Job title
    Then Mona verify poznan from drop down menu is visible
    When Mona clicks poznan from drop down list
    Then Mona verify quality engineer exist
