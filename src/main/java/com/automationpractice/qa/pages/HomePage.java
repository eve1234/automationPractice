package com.automationpractice.qa.pages;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.util.TestUtil;

public class HomePage extends TestBase {
	
	Actions action;
	
	@FindBy(linkText="Sign in")
	WebElement signInLink;
	
	@FindBy(xpath="//a[@title='Contact Us']")
	WebElement ContactUsLink;
	
	@FindBy(xpath="//a[@title='View my shopping cart']")
	WebElement viewMyShoppingCartLink;
	
	@FindBy(xpath="//a[@title='Women']")
	WebElement womenLink;
	
	@FindBy(xpath="//a[@title='Blouses']")
	WebElement blousesLink;
	
	//@FindBy(xpath="//a[@title='Dresses']")
	@FindBy(xpath="//ul[@class='clearfix submenu-container first-in-line-xs menu-mobile']//a[@title='Dresses']")
	WebElement dressesLink;
	
	 
	//@FindBy(xpath="//a[@title='Evening Dresses']")
	@FindBy(xpath="//ul[@class='clearfix submenu-container first-in-line-xs menu-mobile']//ul[@style]//a[@title='Evening Dresses']")
	WebElement eveningDressesLink;
	
	
	
	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	
	public SignInPage signInLink() {
		signInLink.click();
		return new SignInPage();
	}
	
	public ContactUsPage contactUsLink() {
		ContactUsLink.click();
		return new ContactUsPage();
		
	}
	
	public HomePage womenLink() throws InterruptedException {
		
		Assert.assertEquals(true, womenLink.isDisplayed());
	    action =new Actions(driver);
	    Thread.sleep(2000);
		action.moveToElement(womenLink).build().perform();
		driver.findElement(By.xpath("//a[@title='Blouses']")).click();
		
		return new HomePage();
		
	}
	
	public HomePage dressesLink() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    action =new Actions(driver);
		action.moveToElement(dressesLink).build().perform();
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//ul[@class='clearfix submenu-container first-in-line-xs menu-mobile']//ul[@style]//a[@title='Evening Dresses']
		//driver.findElement(By.xpath("//a[@title='Evening Dresses']")).click();
		
		driver.findElement(By.xpath("//ul[@class='clearfix submenu-container first-in-line-xs menu-mobile']//ul[@style]//a[@title='Evening Dresses']")).click();
		
		
		return new HomePage();
		
	}
	
	
	public CartPage viewMyShoppingCartLink() {
		viewMyShoppingCartLink.click();
		return new CartPage();
		
	}
	
	

}
