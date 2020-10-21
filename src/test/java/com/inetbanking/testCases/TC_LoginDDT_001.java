package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginDDT_001 extends BaseClass
{
	@Test
	public void loginTest() throws IOException 
	{
			
		
		LoginPage lp=new LoginPage(driver);
		logger.info("Entered username");
		lp.setUserName(username);
		logger.info("Entered password");
		
		lp.setPassword(password);
		
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		
		}
		else
		{
		
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
			
		}
		
	}
}
