Feature: Test login functionality for demowebshop

@validlogin
Scenario: Test demowebshop with valid credentials
Given open chrome and start application
When I enter valid username and password
Then User should be able to login

@registration
Scenario: Test demowebshop with valid new user information
Given open registration page
When I enter valid new user information
Then User should be able to register