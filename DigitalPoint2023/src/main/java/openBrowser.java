import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class openBrowser 
{

	public static WebDriver driver;
	
	public static void main(String[] args) 
	{
		
		//open the browser
		System.setProperty("webdriver.chrome.drive", "E:\\Class2023\\GRFC\\DigitalPoint\\GRFC\\DigitalPoint2023\\Drivers\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.drive", "E:\\Class2023\\GRFC\\DigitalPoint\\GRFC\\DigitalPoint2023\\Drivers\\geckodriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		driver=new ChromeDriver(opt);
		
		//driver= new ChromeDriver();
		
		//driver= new FirefoxDriver();
		
		driver.get("https://forum.digitalpoint.tech/");
		
		
		//maximize the browser window
		driver.manage().window().maximize();
		
				
		//driver.close();
		
		

	}

}
