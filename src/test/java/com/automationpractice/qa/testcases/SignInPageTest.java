package com.automationpractice.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.HomePage;
import com.automationpractice.qa.pages.SignInPage;
import com.automationpractice.qa.util.TestUtil;

public class SignInPageTest extends TestBase{
	
	HomePage homePage;
	SignInPage signInPage;
	TestUtil testUtil;
	HomePageTest homePageTest;
	 String sheetName = "createAcct";

	public SignInPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil=new TestUtil();
		homePage=new HomePage();
		signInPage = new SignInPage();
		
		homePage.signInLink();
		
	}
	
	@DataProvider
	public Object [][] getAcctCreateData(){
		Object [][] data=TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	@Test(priority=1, dataProvider="getAcctCreateData")
	public void createAccountTest(String email, String custFName, String custLName, String password, String days, String months, String years, String fName, String lName, String comp, String adds1, String adds2, String cityOfAdd, String cState, String pCode, String country, String landphone, String pMobile, String aliasEmail) {
		signInPage.createAccount(email, custFName, custLName, password, days, months, years, fName, lName, comp, adds1, adds2, cityOfAdd, cState, pCode, country, landphone, pMobile, aliasEmail);
		
		
	}
	
/*	@Test(priority=1)
	public void loadPage() {
		System.out.println("Loadpage");
	}*/
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
	
