
Feature: some test cases

Background: 
						Given User is going to be on Tek School of America Website
						When User is going to click on Test Environment Link
						Then User will be on Test Environment Page
  @SDET-3
  Scenario: Users should be able to log in to Test environment
 
    When User clicks on My account
   	And User is going to click on log in option
    And User is entering username 'teststudent@gmail.com' and password 'Tek@Test.com'
    And User again clicks on log in
    Then User shuould be able log in the system
    

	@SDET-4
	Scenario: User should be able to log out
	
		When User clicks on LogOut under My account after being Logged In with 'teststudent@gmail.com' and password 'Tek@Test.com' 
		Then User should be able to Log Out
		
	@SDET-5
	Scenario: User should be able to Create an Account in Test environment page
	
	When User clicks on My Account in Test Environment Page
	And User clicks on regester
	And User type in personal information in the page
	
		 # firstName|lastName|email|phone|password
    |Noor|NoorNile|linda.williams@sakilacustomer.org|5401234123123|Test123|
    
  And User click on 'yes' radio button to Subscribe
  And User click the continue button

    Then User should see that 'Your Account Has Been Created!'
    When User Now connects to DataBase 
    And User is goint to send query 'select * from public.customer where email='linda.williams@sakilacustomer.org''
    Then User is going to verify that account is created 'linda.williams@sakilacustomer.org' 
	
 
 	@SDET-6 
 	Scenario: Canvas Log In
 	
 	When User clicks on Log In to Class
 	Then User should be on Canvas Log in page
 	
 	
 	@SDET-7
 	Scenario: User should be able to add a product to shopping cart
 	
 	When User Logs in to Test Environment page with 'teststudent@gmail.com' and password 'Tek@Test.com'
 	And clicks on any product on blue navigation bar like tablet 
 	And User click on Add to Cart option
 	Then the product should be added to cart
 	
 		
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 