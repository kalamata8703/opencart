package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;


import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.Homepage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
	@Test(groups= {"regression","master"})
	public void test_accountRegistration() throws InterruptedException
	{
		logger.info("******* starting TC_001_AccountRegistrationTest *******");
		Homepage hp=new Homepage(driver);
		logger.info("Clicking on MyAccount link");
		hp.clickMyAccount();
		
		logger.info("Clicking on register link");
		hp.clickRegister();
		
		logger.info("Providing customers details");
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setTextEmail(randomeString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		Thread.sleep(2000);
		
		String confmsg=regpage.getConfirmationMsg();
		System.out.println(confmsg);
		if(confmsg.equals("Your Account Has Been Created!"))
		{
		logger.info("Registration successful...");
		Assert.assertTrue(true);
		}
		else
		{
			logger.error("Registration failed");
				Assert.fail();
		}
		logger.info("******* Finished TC_001_AccountRegistrationTest *******");
	}
		
	
}

