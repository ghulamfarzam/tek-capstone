package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;


public class HomeSteps extends CommonUtility{
	// all your step definitions classes will extends 
	// CommonUtility class
	// we need to create object of POMFactory class
	// PomFactory instance should be on top of the class 
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	String expectedTitle = "React App";
	String actualTitle = getTitle();// wrote this one in CommonUtility
	Assert.assertEquals(expectedTitle, actualTitle);
	logger.info(actualTitle +" is equal to "+ expectedTitle);
	}
	
	@Then("User verify retail page logo is present")
	public void userVerifyRetailPageLogoIsPresent() {
	Assert.assertTrue(isElementDisplayed(factory.homePage().logo));
	logger.info("logo is present");
		
	}
	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String value) {
		selectByVisibleText(factory.homePage().allDepartments,value);
		logger.info(value + " was selected from the drop down");
	    
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String value) {
		sendText(factory.homePage().searchInputField,value);
		logger.info("user entered "+value);
	  
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("user clicked on search button");
	}
	@Then("Item should be present")
	public void itemShouldBePresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().playStationItem));
		logger.info("item is present");
	    
	}

	@When("User click on All section")
	public void userClickOnAllSection() {
	click(factory.homePage().allElement);
	logger.info("user clicked on All element");
	}

	@Then("User verifies {string} is present")
	public void user_verifies_is_present(String value) {
	String expectedValue = value;
	String actualValue = getElementText(factory.homePage().shopByDepartment);
	Assert.assertEquals(expectedValue, actualValue);
	logger.info(expectedValue + " is present");
	}
	
	
	@And("User verifies cart icon is present")
	public void userVerifiesCartIconIsPresent() {
		slowDown();
		HighlightElement(factory.homePage().cart);
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.homePage().cart));
		logger.info("cart icon is present");
		scrollPageDownWithJS();
		slowDown();
	}
	

}


