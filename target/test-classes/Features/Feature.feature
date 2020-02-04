Feature: Verifying the Adactin details

Scenario Outline: Verifying login details with valid credentials
	Given user is in login page of Adactin Hotel
	When user should enter the "<userName>" and "<userPassword>"
	And user click the login button
	Then user logged in successfully
Examples:
	|userName| Password|
	|Siranjeevi1990 |7918Y4|
	
	Scenario Outline: Verify the hotel search Page
	When user select the location "<location>" and "<hotels>" and "<roomtype>" and "<noofroom>" and "<adult>" and "<child>"
	And user click the search button
	Examples:
	|location|hotels|roomtype|noofroom|adult|child|
	|Sydney|Hotel Creek|Standard|1 - One|1 - One|1 - One|
	
	Scenario: verifying the select hotel page
	When user should click the check box
	Then user should click the continue button
	
	Scenario Outline: Verify the search hotel page
	When user should enter the "<firstName>" and "<lastName>" and "<address>" and "<credits>" and "<cardType>" and "<endMnth>" and "<endYr>" and "<cvv>"
	Then user should click the book successfully
	Examples:
	|firstName|lastName|address|credits|cardType|endMnth|endYr|cvv|
	|Jivi|smile|chennai|12345678901234|Visa|December|2021|987|