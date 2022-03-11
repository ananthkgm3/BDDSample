@PhaseOne
Feature: Contact and Deal Functions
@RegressionTest
Scenario: Create new Contact
	Given User must login
	When User create a new contact
@SmokeTest	
Scenario: View a contact
	Given User must login
	When User view a contact
@RegressionTest
Scenario: Edit a contact
	Given User must login
	When User edit contact details
@SmokeTest @RegressionTest
Scenario: Create new Deal
	Given User must login
	When User create a new deal
	
Scenario: View a deal
	Given User must login
	When User view deal details
	
Scenario: User logout
	Given User must login
	When User Logout from App