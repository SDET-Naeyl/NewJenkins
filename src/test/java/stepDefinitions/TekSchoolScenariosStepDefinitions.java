package stepDefinitions;
import java.util.List;

import org.testng.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.TekSchoolScenariosPageObject;
import utilities.DBUtilities;
import utilities.Utility;

public class TekSchoolScenariosStepDefinitions extends Base {
	
	TekSchoolScenariosPageObject tekSchoolScenariosPageObject = new TekSchoolScenariosPageObject();
	
	@When("^User click on myAccount menue on to of the page$")
	public void user_click_on_myAccount_menu_on_top_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.clickOnMyAccount();
		
	}

	// replace 'username' and 'password' with (.+)
	@And("^User enter user name '(.+)' and password '(.+)' in returning menu$")
	public void user_enter_username_username_and_password_password_in_returning_menu(String userName, String passWord) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.enterEmailAddress(userName);
		tekSchoolScenariosPageObject.enterPassword(passWord);
	}
 
	@And("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.clickOnLoginButton();
	   
	}

	@Then("^User should be logged in$")
	public void user_should_be_logined_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // Assert.assertEquals(true, tekSchoolScenariosPageObject.verifyLoginToMyAccount());
	    
	}
	
	@And("^User click on login on myAccount menu$")
	
	public void user_click_on_login_on_myAccount_menu() {
		
		tekSchoolScenariosPageObject.clickOnLogin();

		
	}
	
	
	
	@When("^User click on register on myAccount menu$")
	public void user_click_on_register_on_myAccount_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		tekSchoolScenariosPageObject.clickonRegister();
	}

	@When("^User fill register form with below information$")
	public void user_fill_register_form_with_below_information(DataTable personalInfo) throws Throwable {
	  
		List<List<String>> dataValue = personalInfo.raw();
		
		tekSchoolScenariosPageObject.fillFirstName(dataValue.get(0).get(0));
		
		tekSchoolScenariosPageObject.filLastName(dataValue.get(0).get(1));
		
		tekSchoolScenariosPageObject.fillEmail(dataValue.get(0).get(2));
		
		tekSchoolScenariosPageObject.fillPhoneNumber(dataValue.get(0).get(3));
		
		tekSchoolScenariosPageObject.fillPassword(dataValue.get(0).get(4));
		
		tekSchoolScenariosPageObject.fillPasswordConfirmation(dataValue.get(0).get(4));
		
		
		
	}

	@When("^User click on '(.+)' radio button for Subscribe$")
	public void user_click_on_yes_radio_button_for_Subscribe(String radioButtonValue) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		tekSchoolScenariosPageObject.subscribeRadioButton(radioButtonValue);
			Utility.screenshot(driver);
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		
		tekSchoolScenariosPageObject.clickOnContinueButton();
	}

	@Then("^User should see 'Your Account Has Been Created!'$")
	public void user_should_see_Your_Account_Has_Been_Created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertEquals(tekSchoolScenariosPageObject.confirmationMessage(),true);
		
		Utility.screenshot(driver);
	}
	
	@When("^User connects to DataBase$")
	public void user_connects_to_DataBase() throws Throwable {

		DBUtilities.setupConnection();
	
	}

	@When("^User sends query '(.+)'$")
	public void user_sends_query(String query) throws Throwable {
		
		DBUtilities.runQuery(query);

	}

	@Then("^User verify account is created with email'(.+)'$")
	public void user_verify_account_is_created_with_email(String emailValidation) throws Throwable {

	Assert.assertEquals(DBUtilities.data(), emailValidation);	
	
	}
	
	
	
	
	

}