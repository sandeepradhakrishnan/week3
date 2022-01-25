Feature: Login function of leaftaps app
Scenario: login with postive credential
Given open the chrome brower
Given load the application
And enter the username 'demosalesmanager'
And enter the password 'crmsfa'
When click the ok button
Then homepage should open and displayed

Scenario: 2 login with postive credential
Given open the chrome brower
Given load the application
And enter the username 'demo'
And enter the password 'crmsfa'
When click the ok button
But Error message should be displayed





