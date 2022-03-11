Feature: Opencart Login function
#
#Scenario: Valid Login  
#	When User is on opencart login page
#	And User navigates to login page
#	Given User login with credentials
#	Then User navigates to My Account page
#
#Scenario: Valid Login   #parametrization without example
#	When User is on opencart login page
#	And User navigates to login page
#	Given User login with "firstlast07@gmail.com" and "Test@123"
#	Then User navigates to My Account page
#	
#Scenario: InValid Login
#	When User is on opencart login page
#	And User navigates to login page
#	Given User login with "firstlast07@gmail.com" and "Test123"
#	Then Should display error msg
#	
#	
#Scenario Outline: Valid Login #parametrization with example
#	When User is on opencart login page
#	And User navigates to login page
#	Given User login with "<email>" and "<password>"
#	Then User navigates to My Account page
#
#Examples:
#	| email | password |
#	| firstlast07@gmail.com | Test@123 |
#	| firstlast08@gmail.com | Test@123 |

	
Scenario: Search Item		#Data Table
	When User is on opencart login page
	And User navigates to login page
	Given User login with credentials
		| email | pwd |
		| firstlast07@gmail.com | Test@123 |
	Then User navigates to My Account page
	And User search item
		| phone |
	