package com.automationpractice.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	
	public HomePageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
	}
	
	@Test(priority=1)
	public void sigInLinkTest(){
		homePage.signInLink();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
