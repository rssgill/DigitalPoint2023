package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.browserEngine;
import Utilities.forumURL;

public class T03_userRegistration 
{
	
		
		public static WebDriver driver;
		
	@BeforeTest
		
		public static void openbrowser()
		{
			driver=browserEngine.getBrowser();
			
		}

	@Test

		public static void homepageValidation()
		{
			//open the homepage to validate
		
			System.out.println("Browser is opening homepage.");
		
			driver.get(forumURL.homepageURL);
		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Verifying Home Page title
			String homepageTitle = "Digital Point Forum";
		
			String expectedTitle = driver.getTitle();
		
			AssertJUnit.assertEquals(homepageTitle, expectedTitle);
			
			
			// Clicking User Registration Button
			driver.findElement(By.xpath("//*[@id=\"text-fade\"]/div[1]/div/div[3]/div/a[3]")).click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Verifying User Registration Page Title
			String registrationpageTitle = "Digital Point Forum Registration";
			
			String expectedRegistrationTitle = driver.getTitle();
		
			AssertJUnit.assertEquals(registrationpageTitle, expectedRegistrationTitle);
			
			
			//Identifying "select language" and clicking
			//driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/select")).click();
			
			//Identifying and selecting "English"
			//driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/select/option[2]")).click();
			
			new Select (driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/select"))).selectByVisibleText(forumURL.regLanguage);
			
			
			
			//Identifying "select language" and clicking
			//driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/select")).click();
			
			//Identifying and selecting "Bangla"
			//driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/select/option[4]")).click();
			
			//Identifying and Entering value First name Text Box
			driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/input")).sendKeys(forumURL.regFname);
			
			//Identifying and Entering value Email Text Box
			driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[3]/input")).sendKeys(forumURL.regEmail); 
			
			//Identifying and clicking Gender "Male" Radio Button
			driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[4]/div/label[2]/input")).click();
			
			//Identifying and Selecting "course " drop down
			//driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[5]/select")).click();
			
			new Select (driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[5]/select"))).selectByVisibleText(forumURL.regCourse);
			
			//Identifying and Selecting "MCSA-Windows Server" from drop down
			//driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[5]/select/option[7]")).click();
			
			//Identifying and clicking "I confirmed all info is correct" checkbox
			driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[6]/input")).click();
			
			//Identifying and Selecting "Title" drop down
			//driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div[1]/select")).click();
			
			new Select (driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div[1]/select"))).selectByVisibleText(forumURL.regTitle);
			
			//Identifying and Selecting "Mr." from drop down
			//driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div[1]/select/option[2]")).click();
			
			//Identifying and Entering value Last name Text Box
			driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div[2]/input")).sendKeys(forumURL.regLname);
			
			//Identifying and Entering value Password Text Box
			driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div[3]/input")).sendKeys(forumURL.regPsswd);
			
			//Identifying and Entering value Phone Text Box
			driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div[4]/input")).sendKeys(forumURL.regPhoneNum);
			
			//Identifying and clicking Submit Button
			driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/input")).click();
			
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

	@AfterMethod

		public static void closeBrwoser()

		{
			//closing the browser 
		
			//System.out.println("Driver is closing Browser.");
		
			//driver.close();
		}

	

}
