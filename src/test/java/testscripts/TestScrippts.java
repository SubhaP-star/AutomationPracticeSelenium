package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.generics;
import junit.framework.Assert;
import pom.HomePage;

public class TestScrippts extends BaseTest{
	@Test
	public void alltestcases()
	{
		HomePage p = new HomePage(driver);
		p.setsignInButton();
		p.setUserName("subhaviji@gmail.com");
		p.setPasswrd("password123");
		p.setsubmit();
		BasePage.verifyTitle("My account - My Store");
		p.searchmenuList("dresses");
		p.searchMenuClick();
		p.searchsignOutButtons();
	}

	@Test()
	public void contactStore()
	{

		HomePage p = new HomePage(driver);
		p.setsignInButton();
		p.setUserName("subhaviji@gmail.com");
		p.setPasswrd("password123");
		p.setsubmit();
		BasePage.verifyTitle("My account - My Store");
		p.contact_Store();
		p.contactid(2);
		p.orderid(1);
		p.productid(2);
		driver.findElement(By.id("fileUpload")).sendKeys("C:\\Users\\subha\\Desktop\\Collections.txt");
		p.sendMessage();
		p.contactSendButton();

	}

	@Test

	public void checkLogoText()
	{
		HomePage p = new HomePage(driver);
		p.pageHeading("YOUR LOGO a New Experience");
	}

	@Test

	public void createAnAccount() throws InterruptedException 
	{
		HomePage p = new HomePage(driver);
		p.setsignInButton();
		p.checkIsEmail("suganes@gmail.com");
		p.chkCreateSubmit();
		p.setisElementPresent(By.xpath("//div[@id='create_account_error']"));
		String actualMessage="An account using this email address has already been registered. Please enter a valid password or request a new one.";
		if(p.setisElementPresent(By.xpath("//div[@id='create_account_error']")))
		{
			System.out.println("Successfully completed");
		} 
		else
		{
			System.out.println("Continue with adding an new account");	
			p.setGenderRadioBtn();
			p.setCustomerFirstName("Subha");
			p.setCustomerLastName("Prabhu");
			p.setCustomerPwd("Password123");
			p.setFirstName("Subha");
			p.setLastName("prabhu");
			p.setAddress("123 rajaji nagar chennai");
			p.setCity("Chennai");
			p.state("Texas");
			p.setPostalCode("75244");
			p.country("United States");
			p.setPhoneMobile("9723008382");
			p.setSubmitButton();

		}			

	}

	 @Test

	public void addToCart() throws InterruptedException
	{
		HomePage p = new HomePage(driver);
		p.setItemImage();
		p.setselectMoreBtn();
		p.setClear();
		p.setQuantityWanted("3");
		p.setSizeText("M");
		p.setAddToCart();
		p.setProceedToChkOt();
		p.refresh();
		p.setCartChecking();
	}



	@Test
	
	public void aboutCompanyDetails() throws InterruptedException
	{
		HomePage p = new HomePage(driver);
		p.setAboutCompany();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Successfully shown the Company Details");
	}
	
	@Test
	
	public void specialCollections() throws InterruptedException 
	{
		HomePage p = new HomePage(driver);
		p.setsignInButton();
		p.setUserName("subhaviji@gmail.com");
		p.setPasswrd("password123");
		p.setsubmit();
		p.setspecialColln();
		p.setprinterChiffonDress();
		p.setchiffonDressAddtCrt();
		p.setprcdToChkot();
		p.setsummaryChkOut();
		p.setAddressProced();
		p.settermsAndCondtions();
		p.setshippingPoced();
		p.setpayByCheck();
		p.setconfrmTheOrder();
		String finalShowoff=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div")).getText();
		System.out.println(finalShowoff);
	}
	
	@Test
	public void checkTheCount() 
	{
		HomePage p = new HomePage(driver);
		p.setDressesSelection();
		p.setsummerDressescnt();
	    System.out.println("There are total 3 dresses in the Summer Collections");
}
}

