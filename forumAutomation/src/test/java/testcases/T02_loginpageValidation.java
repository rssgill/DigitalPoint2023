package testcases;

import org.testng.annotations.Test;
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
	public static void loginpage()
	{
		
		driver.get("https://forum.digitalpoint.tech/user/index.php/login");
		
		String loginpageATitle = "Digital Point - Forum | User Login";
		String loginpageBTitle = driver.getTitle();
		
		AssertJUnit.assertEquals(loginpageATitle, loginpageBTitle);
		
		//identify the email textbox and send the data into this textbox 
		
				driver.findElement(By.name("email")).sendKeys("nizam.mahmood@gmail.com");
				
				//identify the password textbox and send the value into this password textbox 
				
				driver.findElement(By.name("password")).sendKeys("abcdef*123456");
				
				//identify the signin button and click the button 
				
				driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button")).click();
		
	}
	
	@AfterMethod
	public static void closeBrowser()
	{
		driver.close();
	}
	
}
