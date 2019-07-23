
Feature: As a user
         I should register

@User
Scenario: Validate user registration

Given I launch app
When I provide data

| Fields                 | Values              |
| First Name             | Tom                 |
| Last Name              | Kenny               |
| Email Address          | someone@someone.com |
| Date Of Birth          | 22/05/1990          |
| Company                | ABX                 |
| Postcode               | H34 5ct             |
| Password               | Password1           |
| Confirm Password       | Password1           |

Then I should register
And I gets redirected to home screen



