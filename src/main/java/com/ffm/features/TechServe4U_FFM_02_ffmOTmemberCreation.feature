 Feature: Register FFM OT Member

@AfterLogin
Scenario: Register a FFM OT member with valid information

	Given I am on the FFM platform as a FFM OT admin
	When I click on the Add Super Admin span
	When I input the fields of OT member
	When I click on the register button
	Then It should create a FFM OT member