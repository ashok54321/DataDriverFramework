package com.tb.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	
	
	//WebDriver driver = new ChromeDriver();
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TB-DB\\git\\DataDriverFramework\\DataDriverFramework\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	} 
}
