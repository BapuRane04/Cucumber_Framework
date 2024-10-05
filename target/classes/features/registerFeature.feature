Feature: Register Feature
@REGISTRATION
Scenario Outline: Registeration For New User

Given Open the website 
Then click on register button
Then Enter required details "<Gender>""<FirstName>""<LastName>""<DOB>""<emailID>""<companyName>""<password>""<confirmPassword>"
Then Register User
Then Close Window 

Examples:
        |Gender | FirstName       | LastName | DOB        | emailID                     | companyName | password | confirmPassword | 
        | M		| Automation      | Tester   | 04-11-1996 | automation.tester@gmail.com	| orosoft	  | tester   | tester          |    