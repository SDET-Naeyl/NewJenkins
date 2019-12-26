package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TekSchoolScenariosPageObject extends Base {

	public TekSchoolScenariosPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='My Account']")
	private WebElement myAccountWebelement;

	
	@FindBy(how = How.XPATH, using = "//a[text()='Register']")
	private WebElement registerWebElement;

	@FindBy(how = How.XPATH, using = "//a[text()='Login']")
	private WebElement loginWebElement;

	@FindBy(how = How.ID, using = "input-email")
	private WebElement emailAddressFieldWebElement;

	@FindBy(how = How.ID, using = "input-password")
	private WebElement passwordFieldWebElement;

	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	private WebElement loginButtonWebElement;

	@FindBy(how = How.XPATH, using = "//h2[text()='My Account']")
	private WebElement myAccountTextWebElement;

	
	@FindBy(how = How.XPATH, using = "//input[@id='input-firstname']")
      //input[@id='input-firstname']
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-email']")
	private WebElement emailField;
	
	@FindBy(how = How.ID, using = "input-telephone")
	private WebElement phoneNumber;
	
	@FindBy(how = How.NAME, using = "password")
	private WebElement passwordField;
	
	@FindBy(how = How.XPATH, using = "//input[@name='confirm']")// here is the problem
	private WebElement confirmPasswordFiel;
	
	
	@FindBy(how = How.XPATH, using = "//input[@value='1' and @name='newsletter']")
	private WebElement subscribeYesButton;
	
	@FindBy(how = How.XPATH, using = "//input[@value='0' and @name='newsletter']")
	private WebElement subscribeNoButton;
	

	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	private WebElement continueButton;
	
	@FindBy(how = How.XPATH, using = "//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedConfirmationText;
	
	
	public void fillFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void filLastName(String LName) {
		lastName.sendKeys(LName);
	}
	
	public void fillEmail(String email) {
		
		emailField.sendKeys(email);
	}
	
	public void fillPhoneNumber(String phone) {
		phoneNumber.sendKeys(phone);
	}
	
	public void fillPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void fillPasswordConfirmation(String passwordConfirmation) {
		confirmPasswordFiel.sendKeys(passwordConfirmation);
	}
	
	
	public void subscribeRadioButton(String yesOrNo) {
		if(yesOrNo.equals("yes")) {
			subscribeYesButton.click();
		}else {
			subscribeNoButton.click();
		}
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public boolean confirmationMessage() {
		boolean confirmationText = accountCreatedConfirmationText.isDisplayed();
		return confirmationText;
				
	}
	
	// Writing action methods for WebElements we store in this obj repository class

	public void clickOnMyAccount() {
		try {
			Assert.assertEquals(true, myAccountWebelement.isDisplayed());
			
				myAccountWebelement.click();
			
		} catch (ElementNotInteractableException e) {

			myAccountWebelement.sendKeys(Keys.ENTER);

		}
	}

	public void clickonRegister() {
		try {
			registerWebElement.click();
		} catch (ElementNotInteractableException e) {

			registerWebElement.sendKeys(Keys.ENTER);

		}
	}

	public void clickOnLogin() {
		try {
			loginWebElement.click();
		} catch (ElementNotInteractableException e) {
			loginWebElement.sendKeys(Keys.ENTER);
		}

	}

	public void enterEmailAddress(String emailValue) {

		emailAddressFieldWebElement.sendKeys(emailValue);
	}

	public void enterPassword(String passwordValue) {
		passwordFieldWebElement.sendKeys(passwordValue);
	}

	public void clickOnLoginButton() {
		loginButtonWebElement.click();
	}

}