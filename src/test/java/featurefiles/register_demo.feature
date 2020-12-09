Feature: Registration Action

@successful_registration
Scenario: Registration with valid data
Given User is on the Register page
When User enters valid data 
And clicks the button
Then User is redirected to registration completed page

@unsuccessful_registration1
Scenario: Failure in registration on leaving the first Name empty 
Given User is on the Register page
When user leaves first Name field blank
And clicks the button
Then display firstname alert message

@unsuccessful_registration2
Scenario: Failure in registration on leaving the last Name blank
Given User is on the Register page
When user leaves last Name field blank 
And clicks the button
Then display lastname alert message

@unsuccessful_registration3
Scenario: Failure in registration on leaving email blank 
Given User is on the Register page
When user leaves the email field blank 
And clicks the button
Then display email alert message

@unsuccessful_registration4
Scenario: Failure in registration on incorrect email format 
Given User is on the Register page
When user enters all data
But user enters incorrect email format 
And clicks the button
Then display email formate alert message

@unsuccessful_registration5
Scenario: Failure in registration on leaving the password field blank 
Given user should be on the register page
When user leaves password field blank 
And clicks the button
Then display password alert message

@unsuccessful_registration6
Scenario: Failure in registration on incorrect password format 
Given User is on the Register page
When user enters incorrect password format 
And clicks the button
Then display password formate alert message

@unsuccessful_registration7
Scenario: Failure in registration on leaving the confirm password field blank 
Given User is on the Register page
When user leaves confirm password field blank 
Then display confirm password alert message

@unsuccessful_registration8
Scenario: Failure in registration on mismatch in the confirm password field 
Given User is on the Register page
When user enters mismatched password in the confirm password field 
And clicks the button
Then display password mismatch alert message