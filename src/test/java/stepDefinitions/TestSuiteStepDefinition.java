package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.TestSuitePageObject;
import utilities.DBUtilities;
import utilities.Utility;

public class TestSuiteStepDefinition extends Base {

	TestSuitePageObject tekSchoolElements = new TestSuitePageObject();

	@Given("^User is going to be on Tek School of America Website$")
	public void user_is_on_TekSchool_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("test");

		Base.initializeDriver();

		// Check for title

		String expectedTitle = "TEK School – Knowledge is power";

		// This is hard Assertion and if expected does not meet actual resutl. it will
		// fail the execution
		Assert.assertEquals(tekSchoolElements.pageTitle(), expectedTitle);

	}

	// THIS METHOD WILL CLICK ON TEST ENVIRONMENT LINK
	@When("^User is going to click on Test Environment Link$")
	public void user_clicks_on_Test_Environment_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("test");

		tekSchoolElements.clickOnTestLink();

	}
	// THIS METHOD WILL VERIFY

	@Then("^User will be on Test Environment Page$")
	public void user_should_see_Test_Enironment_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("test");

		Assert.assertEquals(driver.getTitle(), "TEK SCHOOL");
	}

	@When("^User clicks on My account$")
	public void user_clicks_on_My_Account() {

		tekSchoolElements.clickOnMyAccount();
 
	}

	@And("^User is going to click on log in option$")

	public void user_clicks_on_Log_in() {
		tekSchoolElements.clickOnLogin();
	}

	@And("^User is entering username '(.+)' and password '(.+)'$")

	public void user_is_entering_password(String userName, String password) {
		tekSchoolElements.enterEmailAddress(userName);
		tekSchoolElements.enterPassword(password);

	}

	@And("^User again clicks on log in$")

	public void user_click_on_second_login() {

		tekSchoolElements.clickOnLoginButton();
	}

	@Then("^User shuould be able log in the system$")

	public void user_is_on_LogIn_page() {
		System.out.println("Test Case number 3 passeed");
	}

	@When("^User clicks on LogOut under My account after being Logged In with '(.+)' and password '(.+)'$")
	public void user_logs_out_after_logIn(String userName, String password) {

		tekSchoolElements.clickOnMyAccount();
		tekSchoolElements.clickOnLogin();
		tekSchoolElements.enterEmailAddress(userName);
		tekSchoolElements.enterPassword(password);
		tekSchoolElements.clickOnLoginButton();

	}

	@Then("^User should be able to Log Out$")

	public void user_should_be_logOut_AfterLogIn() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tekSchoolElements.clickOnMyAccount();
		tekSchoolElements.clickOnLogOut();

		System.out.println("Test Case 4 passed");
	}

	@When("^User clicks on My Account in Test Environment Page$")

	public void user_clicks_on_My_Account_to_Register() {

		tekSchoolElements.clickOnMyAccount();

	}

	@And("^User clicks on regester$")

	public void user_clicks_onRegister() {
		tekSchoolElements.clickonRegister();
	}

	@When("^User type in personal information in the page$")
	public void user_type_in_personal_information(DataTable personalInfo) throws Throwable  {
		
		List<List<String>> dataValue = personalInfo.raw();

 
		tekSchoolElements.fillFirstName(dataValue.get(0).get(0));

		tekSchoolElements.filLastName(dataValue.get(0).get(1));

		tekSchoolElements.fillEmail(dataValue.get(0).get(2));

		tekSchoolElements.fillPhoneNumber(dataValue.get(0).get(3));

		tekSchoolElements.fillPassword(dataValue.get(0).get(4));

		tekSchoolElements.fillPasswordConfirmation(dataValue.get(0).get(4));

	}
	

	
	
	@And("^User click on '(.+)' radio button to Subscribe$")
	public void user_click_on_yes(String radioButtonValue) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		tekSchoolElements.subscribeRadioButton(radioButtonValue);
			Utility.screenshot(driver);
	}
	
	
	
	@When("^User click the continue button$")
	public void user_click_continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		
		tekSchoolElements.clickOnContinueButton();
	}
	
	
	
	@Then("^User should see that 'Your Account Has Been Created!'$")
	
	public void user_should_see_Your_Account_Has_Been_Created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertEquals(tekSchoolElements.confirmationMessage(),true);
		
		Utility.screenshot(driver);
	}
	
	
	@When("^User Now connects to DataBase$")
	
	public void user_connects_to_DataBase() throws Throwable {

		DBUtilities.setupConnection();
	
	}
	
	@And("^User is goint to send query '(.+)'$")
	
	public void user_is_goin_to_sends_query(String query) throws Throwable {
		
		DBUtilities.runQuery(query);

	}
	
	@Then("^User is going to verify that account is created '(.+)'$")
	
	
	public void user_verify_that_account_is_created(String emailValidation) throws Throwable {

		Assert.assertEquals(DBUtilities.data(), emailValidation);
		
		System.out.println("Test Case 5 passed");
		
		}
	
	
	@When("^User clicks on Log In to Class$")
	
	public void user_clicksOnCanvas() {
		
		driver.navigate().back();
		tekSchoolElements.clickOnCanvasLink();
		
	}
	
	@Then("^User should be on Canvas Log in page$")
	
	public void user_should_be_on_Canvas_Login() {
		
		System.out.println("Test Case 6 Passed");
		
	}
	
	
	@When("^User Logs in to Test Environment page with '(.+)' and password '(.+)'$")
	
	public void user_logsIn(String userName, String password) {
		
		tekSchoolElements.clickOnMyAccount();
		tekSchoolElements.clickOnLogin();
		tekSchoolElements.enterEmailAddress(userName);
		tekSchoolElements.enterPassword(password);
		tekSchoolElements.clickOnLoginButton();
		
	}
	
	@And("^clicks on any product on blue navigation bar like tablet$")
	
	public void user_clicks_on_any_product() {
		
		tekSchoolElements.clickOnTabletNav();
	}
	
	@And("^User click on Add to Cart option$")
	
	public void user_clicks_onAddTo() {
		
		tekSchoolElements.clickOnTabletAddToCart();
		
	}
	
	@Then("^the product should be added to cart$")
	
	public void product_should_beAdded() {
		
		System.out.println("Step 7 passed");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
