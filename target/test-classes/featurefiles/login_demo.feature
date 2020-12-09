Feature: login Action

@login_successful
Scenario: Successful login with valid credentials
Given user should be on the login page
When user enters the valid username and password and clicks on sign in
Then user should be redirected to home page of the website

@login_unsuccessful
Scenario Outline: Display error message on invalid credentials
 Given user is on the login page of WebDemoPage
 When user enters <email> and <Password> fields
 And clicks on sign in button
 Then displays alert message
 Examples:
 |email|Password|
 |     |        |
 |     |Aeiouare@5|
 |abcdxyz1234@gmail.com|       |
 |abcdxyz1234@gmail.com|Aeiouare@5|

