package testcases;

import org.testng.annotations.Test;

import Utilities.browserEngine;
import Utilities.forumURL;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T02_loginpageValidation 
{

public static WebDriver driver;
	
	
	@BeforeMethod
	public static void openBrowser()
	{
		
		driver=browserEngine.getBrowser();
	}
	
	@Test
	public static void loginpage()
	{
		
		//load the application under test 
		
				System.out.println("Browser is opening Home page.");
				
				driver.get(forumURL.homepageURL);
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Browser is opening Login page.");
				
				driver.findElement(By.xpath("//*[@id=\'text-fade\']/div[1]/div/div[3]/div/a[2]")).click();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//driver.get(forumURL.loginpageURL);
				
				//home page title validation 
				
				String loginpageETitle ="Digital Point - Forum | User Login";
				
				String loginpageATitle=driver.getTitle();
				
				AssertJUnit.assertEquals(loginpageATitle, loginpageETitle);
				
				
				System.out.println("Driver is logging in.");
				
				//identify the email textbox and send the data into this testbox 
							
				driver.findElement(By.name("email")).sendKeys(forumURL.loginUid);
				
				//identify the password textbox and send the value into this password textbox 
				
				driver.findElement(By.name("password")).sendKeys(forumURL.loginPsswd);
				
				//identify the signin button and click the button 
				
				driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button")).click();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Driver is logging out.");
				
				driver.findElement(By.xpath("//*[@id=\"navbar-right\"]/li/a/span")).click();
				
				driver.findElement(By.xpath("//*[@id=\"navbar-right\"]/li/ul/li/a")).click();
				
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}
	
	@AfterMethod
	public static void closeBrowser()
	{
		driver.close();
	}
	
}
