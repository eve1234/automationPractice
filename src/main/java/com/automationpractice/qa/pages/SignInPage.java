package com.automationpractice.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.util.TestUtil;

public class SignInPage extends TestBase {
	
	@FindBy(id="email_create")
	WebElement recreatAcctEmail;
	
	@FindBy(name="SubmitCreate")
	WebElement createSubmitBtn;
	
	@FindBy(id="uniform-id_gender2")
	WebElement gender2SelRadioBtn;
	
	@FindBy(id="customer_firstname")
	WebElement customerFirstName;
	

	@FindBy(id="customer_lastname")
	WebElement customerLastName;
	

	@FindBy(id="passwd")
	WebElement passwd;
	
	//dropdown for DOB
	@FindBy(id="uniform-days")
	WebElement uniformDaysDDSel;
	

	@FindBy(id="uniform-months")
	WebElement uniformMonthsDDSel;
	
	@FindBy(id="uniform-years")
	WebElement uniformYearsDDSel;
	
	@FindBy(id="uniform-newsletter")
	WebElement uniformNewsletterChk;
	
	//
	@FindBy(id="uniform-optin")
	WebElement uniformOptinChk;
	
	@FindBy(id="firstname")
	WebElement firstName;
	
	@FindBy(id="lastname")
	WebElement lastName;
	
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="uniform-id_state")
	WebElement countryStateDDSel;
	
	@FindBy(id="postcode")
	WebElement postcode;
	
	@FindBy(id="uniform-id_country")
	WebElement countryDDSel;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="phone_mobile")
	WebElement phoneMobile;
	
	@FindBy(id="alias")
	WebElement alias;
	
	@FindBy(name="submitAccount")
	WebElement submitAccountBtn;
	
	
	
	
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public SignInPage createAccount(String email, String custFName, String custLName, String password, String days, String months, String years, String fName, String lName, String comp, String adds1, String adds2, String cityOfAdd, String cState, String pCode, String country, String landphone, String pMobile, String aliasEmail) {
		
		
		recreatAcctEmail.sendKeys(email);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", createSubmitBtn);
      //createSubmitBtn.click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT , TimeUnit.SECONDS);
		
        //if the user already is in the system capture error message otherwise carry on
        String errorMessage=driver.findElement(By.xpath("//*[@id=\'create_account_error\']")).getText();
        //String userAlreadyRegMsg="User is already registered";
        //Assert.assertEquals(userAlreadyRegMsg, errorMessage);
        //An account using this email address has already been registered. Please enter a valid password or request a new one.
        if(errorMessage.contains("An account using this email address has already been registered. Please enter a valid password or request a new one.")) {
		//String errorMessage=lanuchApp.driver.findElement(By.id("create_account_error")).getText();
				
		System.out.print("User is already registered " + errorMessage );
     
        }
        else {
        	 //next page to complete new users details
        	gender2SelRadioBtn.click();
        	customerFirstName.sendKeys(custFName);
		customerLastName.sendKeys(custLName);
		passwd.sendKeys(password);
		
		//dropdown for DOB
		uniformDaysDDSel.click();
	
		Select dropdownDays= new Select (driver.findElement(By.id("days")));
		dropdownDays.selectByIndex(1);
		
		uniformMonthsDDSel.click();
		Select dropdownMonths= new Select (driver.findElement(By.id("months")));
		dropdownMonths.selectByVisibleText(months);
		
		uniformYearsDDSel.click();
		Select dropdownYears= new Select (driver.findElement(By.id("years")));
		dropdownYears.selectByValue(years);
		
		uniformNewsletterChk.click();
	
		uniformOptinChk.click();
		
		//shipping address
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		
		company.sendKeys(comp);
		address1.sendKeys(adds1);
		address2.sendKeys(adds2);
		city.sendKeys(cityOfAdd);
		
		countryStateDDSel.click();
		Select dropdownState= new Select (driver.findElement(By.id("id_state")));
		dropdownState.selectByVisibleText(cState);

		postcode.sendKeys(pCode);
		
		countryDDSel.click();
		Select dropdownunCountry= new Select (driver.findElement(By.id("id_country")));
		dropdownunCountry.selectByValue(country);
		
		phone.sendKeys("0051636687932");
		phoneMobile.sendKeys(pMobile);
		
		
		alias.sendKeys(aliasEmail);
		
		submitAccountBtn.click();
	
		
		
        	
        	
        }
		return new SignInPage();
		
	}

}
