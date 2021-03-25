 Feature: FFM OT member should be able to login through valid credentials to the FFM platform

Scenario Outline: FFM OT member should login

Given I should able to view the login panel
When I should be able to give "<email>" and "<password>"
When I should be able to click on the login button
Then I should be able to view the FFM platform 

#Test Data
Examples:
|email				|password|
|blue@mail.com		|123456|
|red@mail.com		|123456|
|white@mail.com		|123456|