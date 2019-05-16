package com.tb.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tb.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void loginAsBankManager() throws InterruptedException {
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		log.debug("Inside Login Test");
		driver.findElement(By.cssSelector(OR.getProperty("bmtBtn"))).click();
		Thread.sleep(3000);
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))),"Login not successfull");
		
		log.debug("Login successfully executed..!!");
		Reporter.log("Login successfully executed....!!");
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\TB-DB\\Pictures\\Screenshots\\Screenshot.png\">screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\TB-DB\\Pictures\\Screenshots\\Screenshot.png\"><img src=\"C:\\Users\\TB-DB\\Pictures\\Screenshots\\Screenshot.png\" height=200 width=200></img></a>");
	}
}
