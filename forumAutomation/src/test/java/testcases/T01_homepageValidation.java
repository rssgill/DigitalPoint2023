package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		
		System.setProperty("webdriver.chrome.drive", "C:\\GRFC\\eclipse-workspace\\forumAutomation\\Driver\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		driver=new ChromeDriver(opt);
		
		//driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public static void homepage()
	{
		
		driver.get("https://forum.digitalpoint.tech/");
		
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
