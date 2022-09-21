Feature: Login test

Scenario:  Successful Login with Valid Credentials
		Given user is on home page
		When user clicks on login page
		And enters proper credentials 
		Then users should be logged in and message should be displayed
		