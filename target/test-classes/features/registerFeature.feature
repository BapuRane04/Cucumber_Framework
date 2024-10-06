Feature: Register Feature
@REGISTRATION
Scenario Outline: Registeration For New User

Given Open the website 
Then Enter required details "<FirstName>""<LastName>""<emailID>""<password>""<confirmPassword>"
Then click on register button
Then Register User
Then Close Window 

Examples:
        |FirstName       | LastName | emailID                       | password | confirmPassword | 
        |Automation      | Tester   | automation.tester@gmail.com	| tester   | tester          |    