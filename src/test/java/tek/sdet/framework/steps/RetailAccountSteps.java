package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	 
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue){
		clearTextUsingSendKeys(factory.accountPage().nameInputField);
		sendText(factory.accountPage().nameInputField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().phoneInputField);
		sendText(factory.accountPage().phoneInputField, phoneValue);
		logger.info("user updated the name and the phone value");

	}
	
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().personalUpdateButton);
		logger.info("user clicked on update button");
	    
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInforUpdatesuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInforUpdatesuccessMessage));
		logger.info("user profile information updated");
	}
	
	//add credit card to account----------------------------------------------------------------------------
	
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPaymentMethod);
		logger.info("user successfully clicked on add payment method link");
	   
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
			sendText(factory.accountPage().cardNumberInputField, data.get(0).get("cardNumber"));
			sendText(factory.accountPage().nameOnCardInputField, data.get(0).get("nameOnCard"));
			sendText(factory.accountPage().expirationMonthInputField, data.get(0).get("expirationMonth"));
			//selectByVisibleText(factory.accountPage().expirationMonthInputField, data.get(0).get("expirationMonth"));
			sendText(factory.accountPage().expirationYearInputField, data.get(0).get("expirationYear"));
			//selectByVisibleText(factory.accountPage().expirationYearInputField, data.get(0).get("expirationYear"));
			sendText(factory.accountPage().securityCodeInputField, data.get(0).get("securityCode"));
			logger.info("user entered card number, name, expiration date and year successfully");
			Thread.sleep(3000);
		}
	
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("user clicked add your car button successfully");
	    
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMssg) {
		if(expectedMssg.contains("Payment")) {
			waitTillPresence(factory.accountPage().paymentMethodAddedSuccessMssage);
			Assert.assertEquals(expectedMssg, factory.accountPage().paymentMethodAddedSuccessMssage.getText());
			logger.info(expectedMssg + " is displayed");
		}
		
	}

	
	//edit card section -----------------------------------------------------------------------
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().cardField);
		click(factory.accountPage().editCardField);
		logger.info("User successfully clicked on card and edit car fields successfully");
	    
	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) throws InterruptedException {
	    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	    for(Map<String, String> row : data) {
//	    	clear(factory.accountPage().cardNumberInputField);
//	    	clear(factory.accountPage().nameOnCardInputField);
//	    	clear(factory.accountPage().securityCodeInputField);
	    	clearTextUsingSendKeys(factory.accountPage().cardNumberInputField, row.get("cardNumber"));
	    	//sendText(factory.accountPage().cardNumberInputField, data.get(0).get("cardNumber"));
	    	clearTextUsingSendKeys(factory.accountPage().nameOnCardInputField, row.get("nameOnCard"));
	    	//sendText(factory.accountPage().nameOnCardInputField, data.get(0).get("nameOnCard"));
	    	selectByVisibleText(factory.accountPage().expirationMonthInputField, row.get("expirationMonth"));
	    	//selectByVisibleText(factory.accountPage().expirationMonthInputField, data.get(0).get("expirationMonth"));
	    	selectByVisibleText(factory.accountPage().expirationYearInputField, row.get("expirationYear"));
	    	//selectByVisibleText(factory.accountPage().expirationYearInputField, data.get(0).get("expirationYear"));
	    	clearTextUsingSendKeys(factory.accountPage().securityCodeInputField, row.get("securityCode"));
	    	//sendText(factory.accountPage().securityCodeInputField, data.get(0).get("securityCode"));
	    	logger.info("User entered the new inforamtion successfully");
	    	Thread.sleep(2000);
	    	
	    	
	    	
	    }
	   
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().paymentSubmitBtnField);
		logger.info("user clicked on update your card successfully");
	  
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
	    waitTillPresence(factory.accountPage().paymentUpdatedSuccess);
	    Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentUpdatedSuccess));
	    logger.info("Payment Method updated successfully");
	}
	
	
	//remove card section ---------------------------------------------------------------------------------
	@When ("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() throws InterruptedException {
		click(factory.accountPage().removeField);
		waitTillClickable(factory.accountPage().removeButton);
		logger.info("user clicked on remove buttoon successfuly");
		Thread.sleep(2000);
	}
	@Then ("payment details should be removed")
	public void paymentDetailsShouleBeRemove() {
		logger.info("payment method has been removed successfully");
	}

//add address section -------------------------------------------
	
	@When("User click on Add address option")
	 public void userClickOnAddAddressOption() {
		click(factory.accountPage().AddAddressBttn);
		logger.info("user clicked on add address button successfully");
		
	}
	@When("user fill new address form with below information")
	 public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		 List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		 for(Map<String, String> row : data) {
			 selectByValue(factory.accountPage().countryDropdownField, row.get("country"));
			 sendText(factory.accountPage().fullNameInputField, row.get("fullName"));
			 sendText(factory.accountPage().phoneNumberInputField, row.get("phoneNumber"));
			 sendText(factory.accountPage().streetInputField, row.get("streetAddress"));
			 sendText(factory.accountPage().apartmentInputField, row.get("apt"));
			 sendText(factory.accountPage().cityInputField, row.get("city"));
			 selectByValue(factory.accountPage().stateInputField, row.get("state"));
			 sendText(factory.accountPage().zipCodeInputField, row.get("zipCode"));
			 logger.info("user entered fullname, phone number, street address, apartment, city, state and zip code successfully");
		 }
		 
	 }
	@When("User click Add Your Address button")
	 public void userClickAddYourAddressButton() {
		 click(factory.accountPage().addressBtn);
		 logger.info("user clicked on add your address button successfuly");
		 
	 }
	@Then("a message should be displayed ‘Address Added Successfully’")
	 public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		 waitTillPresence(factory.accountPage().addressAddedSuccess);
			Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddedSuccess));
			logger.info("user added address successfully");
		 
	 }
	 
	 
	//edit Address -------------------------------------------------------------------------------
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editAddressOption);
		logger.info("edit address option was clicked successfully");
	   
	}
	
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().updateAddressBttn);
	  
	}
	@When("User click update Your Address button {string}")
	public void userClickUpdateYourAddressButton(String addressUpdateMssg) {
		Assert.assertEquals(addressUpdateMssg, factory.accountPage().addressUpdateSuccessMssg);
	

	   
	}

	//remove address-----------------------------------------------------------
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddressField);
		logger.info("user clicked on remove button successfully");
	    
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		logger.info("user removed address successfully");
		
	    
	}

	     
	 }
	 
	 
