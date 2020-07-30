package generic;



	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

	public class generics extends BaseTest {
		


		public static void gselectbyindex(WebElement element,int n)
		{
			Select select = new Select(element);
			select.selectByIndex(n);
		}
		
		public static void refresh(WebDriver driver)
		{
			driver.navigate().refresh();
		}
		
		public static boolean cartChecking(WebElement element, WebDriver driver,String Actualtext)
		{
			String expectText=element.getText();
			if(expectText.equals(Actualtext))
			{
				return true;
			}
			return false;
		}
		 	
			public static boolean isElementPresent(By by) {

				boolean returnValue = true;

				try {
					driver.findElement(by);
				} catch (Exception e) {
					returnValue = false;
				}
				return returnValue;
			}
					
	
		public static void clear(WebElement element)
		{
			element.clear();
		}
		
		public static void gselectbyvalue(WebElement element, String i)
		{
			Select select = new Select(element);
			select.selectByValue(i);
		}
		
		public static void gselectbyvisibletext(WebElement element, String v)
		{
			Select select = new Select(element);
			select.selectByVisibleText(v);
		}

		public static void hover(WebDriver driver,WebElement toelement)
		{
			Actions action = new Actions(driver);
			action.moveToElement(toelement).perform();
		}


		
			
		}



