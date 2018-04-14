package com.automationpractice.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(linkText="Sign in")
	WebElement signInLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public SignInPage signInLink() {
		signInLink.click();
		return new SignInPage();
	}
	

}
