package com.tb.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tb.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void loginAsBankManager() throws InterruptedException {
				
		
		log.debug("Inside Login Test");
		driver.findElement(By.cssSelector(OR.getProperty("bmtBtn"))).click();
		Thread.sleep(3000);
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))),"Login not successfull");
		
		log.debug("Login successfully executed..!!");
		Assert.fail("Login failed");
		
	}
}
