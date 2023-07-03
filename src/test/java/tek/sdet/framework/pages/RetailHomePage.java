package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
	public WebElement retailLogo;
	
	@FindBy(id = "signinLink")
	public WebElement signInOption;
	
	@FindBy(linkText = "Account")
	public WebElement accountOption;
	
	@FindBy(linkText = "Orders")
	public WebElement ordersOption;
	
	@FindBy(id = "logoutBtn")
	public WebElement logOutOption;
	
	
	@FindBy(xpath = "//button[@class='second-nav__all-btn']")
	public WebElement allField;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allButtn;
	
	//department section
	
	@FindBy(id = "contentHeader")
	public WebElement departmentField;
	
	@FindBy(xpath = "//div[@class='sidebar__content']/div[1]")
	public WebElement electronics;
	
	@FindBy(xpath ="//div[@class='sidebar__content']/div[2]")
	public WebElement computers;
	
	@FindBy(xpath = "//div[@class='sidebar__content']/div[3]")
	public WebElement smartHome;
	
	@FindBy(xpath = "//div[@class='sidebar__content']/div[4]")
	public WebElement sports;
	
	@FindBy(xpath = "//div[@class='sidebar__content']/div[5]")
	public WebElement automative;
	
	
	@FindBy(xpath = "//div[@id='sidebar']/div/div[1]")
	public WebElement tvAndVideo;
	
	@FindBy(xpath = "//div[@id='sidebar']/div/div[2]")
	public WebElement videoGames;
	
	@FindBy(xpath = "//div[@class='modal']/div/div/div/div[1]")
	public WebElement accessories;
	
	@FindBy(xpath = "//div[@class='modal']/div/div/div/div[2]")
	public WebElement networking;
	
	@FindBy(xpath = "//div[@class='modal__content h-screen w-80 ']/div/div/div[1]")
	public WebElement smarthHomeLightning;
	
	@FindBy(xpath = "//div[@class='modal__content h-screen w-80 ']/div/div/div[2]")
	public WebElement plugsAndOutlets;
	
	@FindBy(xpath = "*//body//child::div[@id='sidebar']/div/div[1]")
	public WebElement athleticClothing;
	
	@FindBy(xpath = "*//body//child::div[@id='sidebar']/div/div[2]")
	public WebElement excerciseAndFitness;
	
	@FindBy(xpath = "//html//body//*/node()//div[@class='sidebar__content']//div[1]")
	public WebElement automativepartsAndAccessories;
	
	@FindBy(xpath = "//html//body//*/node()//div[@class='sidebar__content']//div[2]")
	public WebElement motorCycleAndPowersports;
	
	
	
	
	

}
