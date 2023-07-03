package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@Then("User change the category to {string}")
	public void userChangeTheCategoryTo(String smarthHome) {
		selectByVisibleText(factory.orderPage().allDepartmentDropdown, smarthHome);
		logger.info("user selected smart home option successfully");

	}

	@Then("User search for an item {string}")
	public void userSearchForAnItem(String kasaOutdoorSmarthPlug) {
		sendText(factory.orderPage().searchInputField, kasaOutdoorSmarthPlug);
		logger.info("item name was entered successfully");

	}

	@Then("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.orderPage().searchBttn);
		logger.info("search button was clicked successfully");

	}

	@Then("User click on item")
	public void userClickOnItem() {
		click(factory.orderPage().KasaOutdoorSmartPlugItem);
		logger.info("item was clicked successfully");

	}

	@Then("User select quantity {string}")
	public void userSelectQuantity(String itemQty) {
		selectByVisibleText(factory.orderPage().productQtyDropdown, itemQty);
		logger.info("Item quantity was selected successfully");

	}

	@Then("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.orderPage().addToCartBttn);
		logger.info("add to car button was clicked successfully");
	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String itemQtyInTheCart) {
		Assert.assertEquals(itemQtyInTheCart, factory.orderPage().cartQtyField.getText());
		logger.info(itemQtyInTheCart + " quantity was displayed in the cart");
	}

	// User can place an order with Shipping address and payment Method on
	// file​​​​​​​------------

	@Then("User search for an item Apex Legends {string}")
	public void userSearchForAnItemApexLegends(String apexLegends) {
		sendText(factory.orderPage().searchInputField, apexLegends);
		logger.info(apexLegends + " entered successfully");

	}

	@Then("User select Apex Legends quantity {string}")
	public void userSelectApexLegendsQuantity(String itemQty) {
		selectByVisibleText(factory.orderPage().productQtyDropdown, itemQty);
		logger.info(itemQty + " selected Successfuly");

	}

	@Then("the cart icon quantity Apex Legends should change to {string}")
	public void theCartIconQuantityApexLegendsShouldChangeTo(String expectedQty) {
		Assert.assertEquals(expectedQty, factory.orderPage().cartQtyField.getText());
		logger.info(expectedQty + " validated successfully");

	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.orderPage().cartBttn);
		logger.info("Cart Button was clicked successfully");

	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.orderPage().proceedToCheckoutBttn);
		logger.info("proceed to checkout button was clicked successfuly");

	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.orderPage().placeorderBttn);
		logger.info("place your order button was clicked successfully");

	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().orderPlacedSuccessfullyMssg));

	}

	// Cancel Order -----------------------------------------------------------------------------
	@Then("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderLinkField);
		logger.info("user clicked on order link successfully");
	}

	@Then("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> listOfOrders = factory.orderPage().ListOfOrder;
		for (int i = 0; i < listOfOrders.size(); i++) {
			if (factory.orderPage().orderDetailDisplay.getText().equalsIgnoreCase("Hide Details")) {
				if (factory.orderPage().cancelBtn.isDisplayed()) {
					break;
				}
			} else if (factory.orderPage().orderDetailDisplay.getText().equalsIgnoreCase("Show Details")) {
				click(factory.orderPage().orderDetailDisplay);
				if (factory.orderPage().cancelBtn.isDisplayed()) {
					break;
				}
			}
		}
	}

	@Then("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelBtn);
		logger.info("Cancel the order button was clicked successfully");
	}

	@Then("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancellationReason) {
		selectByVisibleText(factory.orderPage().cancellationReason, cancellationReason);
		logger.info(cancellationReason + " reason was selected successfully");
	}

	@Then("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelSubmitBttn);
		logger.info("cancel submit was clicked successfully");
	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String yourOrderCancelledMssg) {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().yourOrderCancelledMssg));
		//Assert.assertEquals(yourOrderCancelledMssg, factory.orderPage().yourOrderCancelledMssg);
		logger.info(yourOrderCancelledMssg + " was verified successfully");
		
	}
	
	//Return Order--------------------------------------------------------
	
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnBttnField);
	   
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String itemDamaged) {
		selectByVisibleText(factory.orderPage().returnBttnReason, itemDamaged);
	   
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String fedEx) {
		selectByVisibleText(factory.orderPage().dropOffInput, fedEx);
	    
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderSubmitBtn);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().returnSuccessMssg));
	}
	@Then("a cancelation message should be displayed as {string}")
	public void aCancelationMessageShouldBeDisplayedAs(String returnMssge) {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().returnSuccessMssg));
	   
	}
	//write review ---------------------------------------------------------
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	  click(factory.orderPage().reviewBtn);
	  logger.info("review button was clicked successfully");
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headlineText, String reviewText) {
		sendText(factory.orderPage().headlineInput, headlineText);
		sendText(factory.orderPage().descriptionInput, reviewText);
		logger.info("user entered headline and description in review area successfully");
	    
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	   click(factory.orderPage().reviewSubmitBtn);
	   logger.info("user clicked add your review button successfully");
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reviewAddedMssg) {
		Assert.assertEquals(reviewAddedMssg, factory.orderPage().reviewAddedSuccessMssg.getText());
		Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewAddedSuccessMssg));
	   
	}

}
