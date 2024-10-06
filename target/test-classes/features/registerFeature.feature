Feature: Register Feature
@REGISTRATION
Scenario Outline: Registeration For New User

Given Open the website 
Then Enter required details "<FirstName>""<LastName>""<emailID>""<password>""<confirmPassword>"
Then click on register button
Then Register User
Then Close Window 

Examples:
        |FirstName | LastName | emailID                 | password      | confirmPassword | 
        |Bapu      | Rane     | bapurane41096@gmail.com	| Bapu@41096    | Bapu@41096      |    