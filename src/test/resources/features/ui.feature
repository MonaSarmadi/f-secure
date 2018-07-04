Feature: UI Test

  Background: Open The Page
    Given that Mark has open the f secure job opening page

  Scenario: Interview Phase Functionality Verification
    Then Mark verify that interview phase label is visible
    Then Mark verify that interview phase content is visible
