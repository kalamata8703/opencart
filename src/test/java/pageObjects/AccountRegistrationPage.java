package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
WebDriver driver;
//Constructor
	
	 public AccountRegistrationPage( WebDriver driver)
	{
		super(driver);
	}
	
	//locating elements
	

@FindBy(xpath="//input[@id='input-firstname']") WebElement txtFirstName;
@FindBy(xpath="//input[@id='input-lastname']") WebElement txtLastName;
@FindBy(xpath="//input[@id='input-email']") WebElement txtEmail;
@FindBy(xpath="//input[@id='input-telephone']") WebElement txtTelephone;
@FindBy(xpath="//input[@id='input-password']") WebElement txtpassword;
@FindBy(xpath="//input[@id='input-confirm']") WebElement txtconfirmpassword;

@FindBy(xpath="//input[@name='agree']") WebElement chkPolicy;
@FindBy(xpath="//input[@value='Continue']") WebElement btnContinue;
@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfirmation;

//Action methods

public void setFirstName(String FstName)
{
	txtFirstName.sendKeys(FstName);
}
public void setLastName(String LstName)
{
	txtLastName.sendKeys(LstName);
}
public void setTextEmail(String email)
{
	txtEmail.sendKeys( email);
}
public void setTelephone(String tel)
{
	txtTelephone.sendKeys(tel);
}
public void setPassword(String pwd)
{
	txtpassword.sendKeys(pwd);
}
public void setConfirmPassword(String pwd) {
	txtconfirmpassword.sendKeys(pwd);
}
public void setPrivacyPolicy()
{
	chkPolicy.click();	
}
public void clickContinue()
{
	btnContinue.click();
}
public String getConfirmationMsg() {
	try {
		return (msgConfirmation.getText());
	} catch (Exception e) {
		return (e.getMessage());

	}
}
}
