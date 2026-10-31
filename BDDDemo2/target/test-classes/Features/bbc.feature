Feature: Navigate to BBC and validate news section

  Scenario: Open BBC and click news
    Given I open the BBC homepage
    When I click on the news link
    Then I should see "News" in the page title