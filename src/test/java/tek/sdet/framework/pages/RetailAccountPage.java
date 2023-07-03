package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	// update profile ---------------------------------
	@FindBy(id = "profileImage")
	public WebElement profileImage;
	
	@FindBy(id = "nameInput")
	public WebElement nameInputField;

	@FindBy(id="personalPhoneInput")
	public WebElement phoneInputField;
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement personalUpdateButton;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInforUpdatesuccessMessage;
	
	
	@FindBy(id = "newAccountBtn")
	public WebElement newAccountBtnField;
	
	@FindBy(id = "accountLink")
	public WebElement accountLinkField;
	
	//locators for add credit car to account-------------------------------------------- 
	
	@FindBy(xpath = "//img[@alt='add payment method']")
	public WebElement addPaymentMethod;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInputField;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInputField;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInputField;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInputField;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInputField;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitBtn;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodAddedSuccessMssage;
	
	//edit Card--------------------------------------------------------------------------------------
	@FindBy(xpath = "//p[@class='account__payment__sub-text']")
	public WebElement cardField;
	
	@FindBy(xpath = "//div[@class='flex gap-2 py-2']//child::button[1]")
	public WebElement editCardField;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitBtnField;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentUpdatedSuccess;
	
	
	//Remove Credit/Debit car ---------------------------------------------------
	
	@FindBy(xpath = "//p[@class='account__payment__sub-text']")
	public WebElement removeField;
	
	
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removeButton;
	
	
	//Add Address
	
	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement AddAddressBttn;
	
	@FindBy(id = "countryDropdown")
	public WebElement countryDropdownField;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameInputField;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInputField;
	
	@FindBy(id = "streetInput")
	public WebElement streetInputField;
	
	@FindBy(id = "apartmentInput")
	public WebElement apartmentInputField;
	
	@FindBy(id = "cityInput")
	public WebElement cityInputField;
	
	@FindBy(name = "state")
	public WebElement stateInputField;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInputField;
	
	@FindBy(id = "addressBtn")
	public WebElement addressBtn;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccess;
	
	
	//edit Address
	
	@FindBy(xpath = "//div[@class='account__address-btn-wrapper']//button[1]")
	public WebElement editAddressOption;
	
	@FindBy(id = "addressBtn")
	public WebElement updateAddressBttn;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdateSuccessMssg;
	
	
	//remove address 
	@FindBy(xpath = "//div[@class='account__address-btn-wrapper']//button[2]")
	public WebElement removeAddressField;
	
	
	public void clearCreditDebitCardInfo() {
		cardNumberInputField.clear();
		nameOnCardInputField.clear();
		clearTextUsingSednKeys(securityCodeInputField);
}


	private void clearTextUsingSednKeys(WebElement securityCodeInputField2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
