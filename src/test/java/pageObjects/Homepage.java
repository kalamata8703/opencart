package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage
{
	WebDriver driver;
	
	//Constructor
	 public Homepage(WebDriver driver)
	{
		super(driver);
		
	}
	
	//locating elements
	

	 @FindBy(xpath = "//span[text()='My Account']")
		WebElement lnkMyaccount;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement linkRegister;
	@FindBy(xpath="//a[normalize-space()='Login']") 
	WebElement llinkLogin;


	
	//Action Methods
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}
	public void clickRegister()
	{
		linkRegister.click();
	}
	public void clickLogin()
	{
		llinkLogin.click();
	}
}
