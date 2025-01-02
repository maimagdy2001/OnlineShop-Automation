Feature: F01_SignUp | users could SignUp with valid data

  Scenario: User could signup with valid data
    When user click on signup button
    And user signup with valid "testuse009036467" and "123456"
    And press on signup button
    Then verify user signup successfully