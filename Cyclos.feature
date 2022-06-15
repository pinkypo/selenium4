@Cyclos
Feature: Cyclos Login Functionality
Scenario Outline: verify is user is able to login with valid credentials
Given If user is on home page
When  Click on login link
And   Enter user name as "<username>" and password as "<password>"
Then  click on logout link

Examples:
     |username| password|
     | demo   | 1234    |
     | demo10 | 1234    |
