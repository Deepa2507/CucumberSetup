Feature: Create account of facebook9
	as a user you need to open facebook homepage and do the validation

	Scenario: Validate first name field91
	Given User need to be on facebook login page
	When User enteres user first name
	Then User checks user first name is present
	Then Close the browser
	
	Scenario: Validate create user multiple fields92
	Given User need to be on facebook login page
	When User enteres user first name 
	And User enteres user surname
	Then User checks user first name is present
	#But User mobile field should be blank
	Then Close the browser
	
	
	
	
	