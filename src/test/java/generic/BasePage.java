package generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public static WebDriver driver;
	
		public BasePage(WebDriver driver)
		{
		this.driver=driver;
		}
		
		
		public static void verifyTitle(String etitle)
		{
			try
			{
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.titleContains(etitle));
			Reporter.log("Title is Matched : "+etitle,true);
			} catch(Exception e)
			{
				e.printStackTrace();
				Reporter.log("Title is not Matched : "+etitle,true);
			}
			}
		/*public static void isElementPresent(WebElement element)
		{
			try
			{
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is Present : "+element,true);
			} catch(Exception e)
			{
				e.printStackTrace();
				Reporter.log("Element is not Present : "+element,true);
			}
			}*/
			
					
		}
		
	


