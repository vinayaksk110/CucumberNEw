Feature: Signup test 

Scenario: signup free trial account of rpc 
	Given user is on homepage 
	When user clicks on signup page 
	And enters all the required data 
	And clicks on signup 
	Then account should be signed up 
