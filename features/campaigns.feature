@campaigns
Feature: MailChimp mobile campaigns

  Background:
    Given I am on the campaigns mobile view

  @MQA-100 @HIGH @smoke
  Scenario: As a test engineer I want to view the campaigns mobile view to verify basic functionality
    Then I should see the "Campaigns" page
    And I should see a create campaign iconoing, Completed
    Then I should see the High Five confirmation and freddie hand displayed