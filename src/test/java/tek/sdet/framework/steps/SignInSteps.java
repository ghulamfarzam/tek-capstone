package tek.sdet.framework.steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().retailLogo));
		logger.info("user is on retail website");
	}
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInOption);
		logger.info("user cliked on Sign In option");

	}
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passWordValue) {
		sendText(factory.signInPage().emailField, emailValue);
		sendText(factory.signInPage().passwordField,passWordValue);
		logger.info("user entered email and password");
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on login button");
	}
	
	@Then("User should be logged into Account")
	public void userShouldBeLoggedIntoAccount() {
		waitTillPresence(factory.homePage().accountOption);
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		Assert.assertTrue(isElementDisplayed(factory.homePage().ordersOption));
		Assert.assertTrue(isElementDisplayed(factory.homePage().logOutOption));
		logger.info("user logged in into account");
		
	}
	
	// Create Account --------------------------------------------------------------------------------
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
	   click(factory.accountPage().newAccountBtnField);
	   logger.info("user clicked on new accout button");
	}
	
	@Then("I enter {string} and {string} and {string} and {string}")
	public void iEnterAndAndAnd(String name, String email, String password, String confirmPass) {
		
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for(Map<String, String> row : data) {
			sendText(factory.signInPage().nameInputField, row.get("name"));
			sendText(factory.signInPage().emailInputField, row.get("email"));
			sendText(factory.signInPage().passwordInputField, row.get("password"));
			sendText(factory.signInPage().confirmPasswordInputField, row.get("password"));
			logger.info("user entered name, email and password successfully");
		}
	}
	   
	
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		waitTillClickable(factory.signInPage().signupBtnField);
		click(factory.signInPage().signupBtnField);
		logger.info("user clicked on signup button");
	    
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		waitTillPresence(factory.signInPage().profileImage);
		Assert.assertTrue(isElementDisplayed(factory.signInPage().profileImage));
		logger.info("user successfully created an account");
		
	}
	   
	}





