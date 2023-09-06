package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.MyAccountpage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{
	@Test(groups= {"sanity","master"})
	public void test_Login()
	{
		logger.info("Starting TC_002_Logintest....");
		
		
		try
		{
			
		
			//HomePage
		Homepage hp=new Homepage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//Login page
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		lp.setPassword(rb.getString("password"));
		lp.clickLogin();
		
		//MyAccountPage
		
		MyAccountpage macc=new MyAccountpage(driver);
		boolean targetPage=macc.isMyAccountPageExist();
		Assert.assertEquals(targetPage,true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	logger.info("FinishingTC_002_LoginTest.....");
		
	}
}
