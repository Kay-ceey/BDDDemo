Feature: Login Action

  Scenario Outline: Successful Login with Valid Credentials
    Given User is on Home page
    When User Navigate to Login page
    And Enters "<username>" and "<password>"
    Then Message displays login successfully

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |