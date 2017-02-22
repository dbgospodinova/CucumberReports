Feature: Registration finctionality

 
  @POR-2 @OPEN
  Scenario: Registration with valid credentials

    Given Open Chrome and start portal
    When I enter valid credentials
    Then User should be able to register


  @POR-2 @OPEN
  Scenario: Registration with invalid credentials

    Given Open Chrome and start portal
    When I enter invalid credentials
    Then User should not be able to register

