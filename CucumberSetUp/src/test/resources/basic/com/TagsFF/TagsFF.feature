@Important
Feature: Create account of facebook12
	as a user you need to open facebook homepage and do the validation

@Smoke
Scenario: Validate first name field121
Given User need to be on facebook login page
When User enteres user "Deepa" first name
Then User checks user "Deepa" first name is present
Then Close the browser

@Smoke @Regression	
Scenario: Validate create user multiple fields122
Given User need to be on facebook login page
When User enteres user "Deepa" first name 
And User enteres user "Medhekar" surname
Then User checks user "Deepa" first name is present
#But User mobile field should be blank
Then Close the browser

Scenario: Validate first name field123
Given User need to be on facebook login page
When User enteres user "Tom" first name
Then User checks user "Tom" first name is present
Then Close the browser

@Regression
Scenario: Validate first name field124
Given User need to be on facebook login page
When User enteres user "Harry" first name
Then User checks user "Harry" first name is present
Then Close the browser

@Smoke
Scenario: Validate first name field125
Given User need to be on facebook login page
When User enteres user "Dick" first name
Then User checks user "Dick" first name is present
Then Close the browser

	
	
	