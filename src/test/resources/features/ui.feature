Feature: UI Test

  Background: Open The Job Openings Page
    Given that Mona has open the f secure Home Page
    Then Mona click on Careers link
    Then Mona mouse hover on careers tab and click on job openings item

  Scenario: Verify Interview Phase Functionality
    Then Mona verify that interview phase label is visible
    Then Mona verify that interview phase content is visible

  Scenario: Verify Pagination Functionality
    When Mona clicks pagination button to see next 6 job ads
    Then Mona see the next new job ads

  Scenario: Verify pagination visibility
    Then Mona verify that pagination buttons are visible
@ignore
  Scenario: Find Quality Engineer Job title
    Then Mona verify poznan from drop down menu is visible
    When Mona clicks poznan from drop down list
    Then Mona verify quality engineer exist


