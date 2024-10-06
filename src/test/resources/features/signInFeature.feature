Feature: Login With Register User
@SIGNIN
Scenario Outline: Login With Valid Credentail

Given Load webiste
Then store usercredential "<username>""<password>"
Then Click on sing in button
Then Perform sign in 
Then Logout user
Then Closed window

Examples: 
         | username                | password   | 
         | bapurane41096@gmail.com | Bapu@41096 |