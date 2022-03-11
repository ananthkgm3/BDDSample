@PhaseTwo
Feature: Task Functions

Scenario: Create new Task
	Given User must login
	When User create a new Task
@RegressionTest	
Scenario: View a Task
	Given User must login
	When User view a Task
	
Scenario: Edit a Task
	Given User must login
	When User edit Task details