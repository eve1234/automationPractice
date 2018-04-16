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
	
	@Test(priority=2)
	public void contactUsLinkTest(){
		homePage.contactUsLink();
		
	}
	
	@Test(priority=3)
	public void viewMyShoppingCartLinkTest(){
		homePage.viewMyShoppingCartLink();
		
	}
	
	
	@Test(priority=4)
	public void womenLinkTest() throws InterruptedException{
		homePage.womenLink();
		
	}
	
	@Test(priority=5)
	public void dressesLinkTest() throws InterruptedException{
		homePage.dressesLink();
		
	}
	
	/*@Test(priority=6)
	public void dressesLinkTest(){
		homePage.dressesLink();
		
	}*/
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
