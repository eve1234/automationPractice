package com.automationpractice.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * 
 */
public class LaunchCloseApp {
	
	WebDriver driver;
	
	@BeforeClass
	public void launchApp() {
		//instantiate Chrome Browser driver
		//System.setProperty("webdriver.chrome.driver", "/Users/yvonneak/Documents/webDrivers/chrome/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		//boolean applaunch=driver.getCurrentUrl();
		
		System.out.println("browser has launched");
		
	}
	
	@AfterClass
	public void CloseApp() {
		driver.quit();
		
		System.out.println("browser has quite");
		
	}
  
  
}
