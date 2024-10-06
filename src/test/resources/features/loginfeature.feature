Feature: Login With Valid Credential

@LOGIN
Scenario Outline: Registeration For New User

Given Open the main page 
Then Click on sign in button
Then Enter valid credential "<username>""<password>"
Then Logout this user 
Then Close window

Examples: 
         | username              | password     |        
         |atharvrane27@gmail.com | Anirudha@2700|