package com.automationpractice.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.util.TestUtil;

public class SignInPage extends TestBase {
	
	@FindBy(id="email_create")
	WebElement recreatAcctEmail;
	
	@FindBy(name="SubmitCreate")
	WebElement createSubmitBtn;
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public SignInPage createAccount(String email) {
		
		
		recreatAcctEmail.sendKeys(email);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", createSubmitBtn);
      //createSubmitBtn.click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT , TimeUnit.SECONDS);
		
      //next page to complete new users details
		return new SignInPage();
		
	}

}
