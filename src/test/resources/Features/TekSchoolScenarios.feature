Feature: Tek School Scenarios

  Background: 
  Given User is on TekSchool Page
    And User click on Test Environment link
    And User should see Test Environment page

  @SDET_003
  Scenario: SDET2019AUG_SDET_003_Execution
    When User click on myAccount menue on to of the page
    And User click on login on myAccount menu
    And User enter user name 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
    And User click on login button
    Then User should be logged in

@SDET_003_SO
  Scenario Outline: SDET2019AUG_SDET_003_Execution with multipule user and password
    When User click on myAccount menue on to of the page
    And User enter user name '<username>' and password '<password>' in returning menu
    And User click on login button
    Then User should be logged in

    Examples: |username|password|
    |teststudent@gmail.com|Tek@Test.com|
    
    |tekschool001@gmail.com|testtest|
    
    |testdata@gmail.com|testdata|
    
    
    @SDET_Register_Form
    Scenario: SDET2019AUG_SDET_Register_Form_Test
    
    When User click on myAccount menue on to of the page
    And User click on register on myAccount menu
    And User fill register form with below information
    
    # firstName|lastName|email|phone|password
    |Shaiq|Darwish|margaret.moore@sakilacustomer.org|5401234123123|Test123|
    
    And User click on 'yes' radio button for Subscribe
    And User click on continue button
    Then User should see 'Your Account Has Been Created!'
    When User connects to DataBase 
    And User sends query 'select * from public.customer where email='margaret.moore@sakilacustomer.org''
    Then User verify account is created with email'margaret.moore@sakilacustomer.org' 
    
    
    
    
    
    
    
    
    # This is just an example of Data Table
    # And User will fill the personal information section with below data
    # |name|lastname|phone|email|password|passwordConfirmation|
    # |student|tekstudent|54023432434|tek@gmail.com|1234|1234|
    
    # difference between Data Table and Scenario outline
    # Scenario outline:
    # It runs entire scenario based on rows in examples keyword
    # But DataTables runs only that specific step in a scenario