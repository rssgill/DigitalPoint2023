package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browserEngine 
{

	public static WebDriver driver;
	
	public static WebDriver getBrowser()
	{
		
		System.setProperty("webdriver.chrome.drive", "E:\\Class2023\\GRFC\\DigitalPoint\\GRFC\\forumAutomation\\Driver\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.drive", "E:\Class2023\GRFC\DigitalPoint\GRFC\forumAutomation\Driver\geckodriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		driver=new ChromeDriver(opt);
		
		//driver= new FirefoxDriver();
		
		//driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		return driver;
	}
	
	
	
}
