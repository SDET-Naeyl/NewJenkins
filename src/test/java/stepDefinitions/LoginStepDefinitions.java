package stepDefinitions;

import org.testng.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPageObject;

public class LoginStepDefinitions extends Base {
	
	//Declare LOginPageObject obj
	 
	LoginPageObject loginpage;

	@Given("^User is on TekSchool Page$")
	public void user_is_on_TekSchool_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("test");
		
		Base.initializeDriver();
		
		// Check for title
		loginpage = new LoginPageObject();
		
		String expectedTitle = "TEK School – Knowledge is power";

		// This is hard Assertion and if expected does not meet actual resutl. it will fail the execution
		Assert.assertEquals(loginpage.pageTitle(), expectedTitle);
		
		
	}

	// THIS METHOD WILL CLICK ON TEST ENVIRONMENT LINK
	@When("^User click on Test Environment link$")
	public void user_clicks_on_Test_Environment_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("test");
		
		loginpage = new LoginPageObject();
		loginpage.clickOnTestEnvironmentLink();
		
		

	}
	// THIS METHOD WILL VERIFY

	@Then("^User should see Test Environment page$")
	public void user_should_see_Test_Enironment_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("test");
		
		Assert.assertEquals(driver.getTitle(), "TEK SCHOOL");
		

	}
	
	
}
