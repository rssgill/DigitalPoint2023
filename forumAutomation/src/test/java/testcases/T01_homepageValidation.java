package testcases;

import org.testng.annotations.Test;

import Utilities.browserEngine;
import Utilities.forumURL;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T01_homepageValidation 
{

	public static WebDriver driver;
	
	
	@BeforeMethod
	public static void openBrowser()
	{
		
		driver = browserEngine.getBrowser();
	}
	
	@Test
	public static void homepage()
	{
		
		driver.get(forumURL.regTitle);
		
		String homepageATitle = "Digital Point Forum";
		String homepageBTitle = driver.getTitle();
		
		AssertJUnit.assertEquals(homepageATitle, homepageBTitle);
		
	}
	
	@AfterMethod
	public static void closeBrowser()
	{
		driver.close();
	}
	
	//public static void main(String[] args) {	}

}
