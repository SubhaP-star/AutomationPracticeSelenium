package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest   {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	
	public void Precondition()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\HRM123Mgt\\AutomationPractice\\drivers\\chromedriver.exe");
		/*WebDriverManager.chromedriver().setup()*/;
		driver = new ChromeDriver();

		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
	}
	
	@AfterMethod
	
	public void postcondition()
	{
	driver.close();
	

}
}
