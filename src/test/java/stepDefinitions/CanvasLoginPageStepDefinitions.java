package stepDefinitions;

import org.testng.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPageObject;

public class CanvasLoginPageStepDefinitions extends Base {
	
	
	LoginPageObject loginpage;
	
	
	
	

	@When("^User click on Login button on top of the page$")
	public void user_click_on_Login_button_on_top_of_the_page() throws Throwable {
	
		
		loginpage = new LoginPageObject();
		
		loginpage.clickOnLoginToClassLink();
		


	}

	@Then("^User should see Canvas Login Page$")
	public void user_should_see_Canvas_Login_Page() throws Throwable {
		

		Assert.assertEquals(driver.getTitle(), "Log In to Canvas");

	   

	} 
	
	
	
	
	
	
	

}
