Feature: As a user
         I should use as expected

Background: Logged in user

@General
Scenario: validate orientaion

Given I'm on home screen
When I rotate my phone to landscape mode
Then I shouldn't be able to use app in the landscape mode

