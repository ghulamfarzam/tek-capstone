package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;


public class RetailOrderPage extends BaseSetup{
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "search")
	public WebElement allDepartmentDropdown;
	
	@FindBy(id = "searchInput")
	public WebElement searchInputField;
	
	@FindBy(id = "searchBtn")
	public WebElement searchBttn;
	
	@FindBy(xpath = "//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement KasaOutdoorSmartPlugItem;
	
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement productQtyDropdown;
	
	@FindBy(xpath = "//span[text()='Add to Cart']")
	public WebElement addToCartBttn;
	
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartQtyField;
	
	//place an order with Shipping address and payment Method on file​​​​​​​
	
	@FindBy(id = "cartBtn")
	public WebElement cartBttn;
	
	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckoutBttn;
	
	@FindBy(id = "placeOrderBtn")
	public WebElement placeorderBttn;
	
	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedSuccessfullyMssg;
	
	
	//Cancel Order-----------------------------------------
	
	@FindBy(id = "orderLink")
	public WebElement orderLinkField;
	
	@FindBy(xpath = "//div[@class='order__header']")
	public List<WebElement> ListOfOrder;
	
	@FindBy(xpath = "//p[@class='order__header-btn']")
	public WebElement orderDetailDisplay;
	
	@FindBy(id = "cancelBtn")
	public WebElement cancelBtn;
	
	@FindBy(id = "reasonInput")
	public WebElement cancellationReason;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelSubmitBttn;
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement yourOrderCancelledMssg;
	
	//return Item ------------------------------------
	@FindBy(id = "returnBtn")
	public WebElement returnBttnField;
	
	@FindBy(id = "reasonInput")
	public WebElement returnBttnReason;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropOffInput;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement returnOrderSubmitBtn;
	
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnSuccessMssg;
	
	
	//write review ------------------------------------
	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineInput;
	
	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitBtn;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewAddedSuccessMssg;
	
	
	
	
	
	
	
	
	
	
	
	
	


}
