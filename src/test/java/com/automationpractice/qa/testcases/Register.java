package com.automationpractice.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//import com.automationpractice.qa.base.App;




public class Register {
	
	//App vidScreenCaptures;
	LaunchCloseApp lanuchApp;
	@Test(priority=1)
	public void NewRegisteringUser() throws InterruptedException {
		
		//Instantiate the class to be use
		//vidScreenCaptures = new VidScreenCaptures();
		
		try {
			//class new object
			lanuchApp =new LaunchCloseApp(); //Instantiate class
			//as we are not in a static void method
			
			//calling the launchCloseApp class to use it properties
			//not repeating codes
			lanuchApp.launchApp();
			
			lanuchApp.driver.get("http://automationpractice.com/index.php");
			
			lanuchApp.driver.findElement(By.linkText("Sign in")).click();
			lanuchApp.driver.findElement(By.id("email_create")).sendKeys("gorgeous65@msn.com");
			//lanuchApp.driver.findElement(By.xpath("/*[@id=\'create-account_form\']/div/div[3]/input[2]")).click();
			lanuchApp.driver.findElement(By.name("SubmitCreate")).click();
			Thread.sleep(3000);
			String errorMessage=lanuchApp.driver.findElement(By.xpath("//*[@id=\'create_account_error\']")).getText();
			
			//String errorMessage=lanuchApp.driver.findElement(By.id("create_account_error")).getText();
					
			System.out.print(errorMessage );
			
			//lanuchApp.driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
			//next page to complete new users details
			/*Thread.sleep(3000);
			
			lanuchApp.driver.findElement(By.id("uniform-id_gender2")).click();
			lanuchApp.driver.findElement(By.id("customer_firstname")).sendKeys("Akos");
			lanuchApp.driver.findElement(By.id("customer_lastname")).sendKeys("Pokua");
			
			//lanuchApp.driver.findElement(By.id("email")).sendKeys("gorgeous65@msn.com");
			lanuchApp.driver.findElement(By.id("passwd")).sendKeys("mypwd123");
			
			//dropdown for DOB
			lanuchApp.driver.findElement(By.id("uniform-days")).click();
			Select dropdownunDays= new Select (lanuchApp.driver.findElement(By.id("days")));
			dropdownunDays.selectByIndex(1);
			
			lanuchApp.driver.findElement(By.id("uniform-months")).click();
			Select dropdownunMonths= new Select (lanuchApp.driver.findElement(By.id("months")));
			dropdownunMonths.selectByVisibleText("March ");
			
			lanuchApp.driver.findElement(By.id("uniform-years")).click();
			Select dropdownunYears= new Select (lanuchApp.driver.findElement(By.id("years")));
			dropdownunYears.selectByValue("1986");
			
			lanuchApp.driver.findElement(By.id("uniform-newsletter")).click();
			
			lanuchApp.driver.findElement(By.id("uniform-optin")).click();
			
			
			//shipping address
			lanuchApp.driver.findElement(By.id("firstname")).sendKeys("Akos");
			lanuchApp.driver.findElement(By.id("lastname")).sendKeys("Pokua");
			
			lanuchApp.driver.findElement(By.id("company")).sendKeys("mycompany");
			lanuchApp.driver.findElement(By.id("address1")).sendKeys("12");
			lanuchApp.driver.findElement(By.id("address2")).sendKeys("The Blue Ave");
			lanuchApp.driver.findElement(By.id("city")).sendKeys("Manhattan");
			
			lanuchApp.driver.findElement(By.id("uniform-id_state")).click();
			Select dropdownunState= new Select (lanuchApp.driver.findElement(By.id("id_state")));
			dropdownunState.selectByVisibleText("New York");

			lanuchApp.driver.findElement(By.id("postcode")).sendKeys("10022");
			
			lanuchApp.driver.findElement(By.id("uniform-id_country")).click();
			Select dropdownunCountry= new Select (lanuchApp.driver.findElement(By.id("id_country")));
			dropdownunCountry.selectByValue("21");
			
			lanuchApp.driver.findElement(By.id("phone")).sendKeys("0051636687932");
			lanuchApp.driver.findElement(By.id("phone_mobile")).sendKeys("0051674687902");
			
			
			lanuchApp.driver.findElement(By.id("alias")).sendKeys("gorgeous65@msn.com");
			
			lanuchApp.driver.findElement(By.name("submitAccount")).click();*/
		
			lanuchApp.driver.quit();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	
}