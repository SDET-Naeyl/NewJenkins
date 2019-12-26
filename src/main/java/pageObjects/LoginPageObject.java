package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObject extends Base{
	
	
	public LoginPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy this annotation is part of PageFactory class which help us to initialize the element
	
	@FindBy(how= How.XPATH, using = "//a[text()='Test Environment']")
	
	private WebElement testEnvironmentLink;
	
	@FindBy(how = How.XPATH, using="//a[text()='Login to Class']")
	
	private WebElement loginToClassLink;
	
	
	@FindBy(how = How.ID, using = "//input[@id='mc4wp_email']")
	
	
	
	private WebElement subsEmailField;
	
	
	/**
	 * This method will click on Test Environment Link ot Tek School Page
	 */
	public void clickOnTestEnvironmentLink() {
		testEnvironmentLink.sendKeys(Keys.ENTER);
	}
	
	// This method will click on Login page
	public void clickOnLoginToClassLink() {
		loginToClassLink.sendKeys(Keys.ENTER);
	}
	
	
	public void sendValueToSubsEmailField(String emailValue) {
		subsEmailField.sendKeys(emailValue);
		
	}
	
	// This method will return the page title
	public String pageTitle() {
		String TekSchoolPageTitle = driver.getTitle();
		return TekSchoolPageTitle;
	}
	
	
	
	
	
	
	

}
