#this is name of feature

Feature: Login

#this is name of scenario

@test
Scenario: Login test to TekSchool Test Environment Page

Given User is on TekSchool Page 
When User clicks on Test Environment link 
Then User should see Test Enironment Page

