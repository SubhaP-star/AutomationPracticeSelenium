package pom;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generic.BasePage;
import generic.generics;

public class HomePage extends BasePage {

	generics selenium;

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		selenium=new generics();
	}

	@FindBy(xpath="//a[@class='login']")
	private WebElement signIn;

	@FindBy(xpath="//input[@id='email']")
	private WebElement UNTB;


	@FindBy(xpath="//input[@name='passwd']")
	private WebElement PassWordTB;

	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement SignIn;

	@FindBy(xpath="//input[@type='text']")
	private WebElement searchMenuList;

	@FindBy(xpath="//button[@name='submit_search']")
	private WebElement menubtnclick;

	@FindBy(xpath="//a[@class='logout']")
	private WebElement signOutButton;

	@FindBy(xpath="//a[.='Contact us']")
	private WebElement contactStore;

	@FindBy(xpath="//textarea[@id='message']")
	private WebElement writeTextMessage;

	@FindBy(xpath="//button[@id='submitMessage']")
	private WebElement sendButton;

	@FindBy(id="id_contact")
	private WebElement contactID;

	@FindBy(name="id_order")
	private WebElement orderreference;

	@FindBy(name="id_product")
	private WebElement nameproduct;

	@FindBy(className="logo img-responsive")
	private WebElement getpageHeading;

	@FindBy(id="email_create")
	private WebElement eMail;

	@FindBy(id="SubmitCreate")
	private WebElement createSubmit;
	
	@FindBy(xpath="//div[@id='uniform-id_gender1']")
	private WebElement genderRadioBtn;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	private WebElement customerLastName;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	private WebElement customerFirstName;
	
	@FindBy(xpath="//input[@name='passwd']")
	private WebElement customerPassword;
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='postcode']")
	private WebElement postalcode;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	private WebElement phoneMobile;
	
	@FindBy(xpath="//button[@name='submitAccount']")
	private WebElement submitAccount;
	
	@FindBy(name="id_state")
	private WebElement state;
	
	@FindBy(name="id_country")
	private WebElement country;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[1]/div/a[1]/img")
	private WebElement itemImage;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[2]/div[2]/a[2]")
	private WebElement selectMoreBtn;
	
	@FindBy(xpath="//input[@id='quantity_wanted']")
	private WebElement quantityWanted;
	
	
	@FindBy(id="group_1")
	private WebElement sizeText;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div/p/button")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedToChkOt;
	
	@FindBy (xpath="/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")
	private WebElement chkCart;
	
	@FindBy (linkText="About us")
	private WebElement aboutCompany;
	
	@FindBy (linkText="Specials")
	private WebElement specialColln;
	
	@FindBy (css="html body#prices-drop.prices-drop.hide-right-column.lang_en div#page "
			+ "div.columns-container div#columns.container"
			+ " div.row div#center_column.center_column.col-xs-12.col-sm-9 ul.product_list.grid.row "
			+ "li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line."
			+ "first-item-of-mobile-line.last-mobile-line div.product-container div.right-block h5 a.product-name")
	
	private WebElement printerChiffonDress;
	
	@FindBy (xpath="/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")
	private WebElement chiffonDressAddtCrt; 
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement addressProceed;
	
	@FindBy (xpath="//a[@title='Proceed to checkout']")
	private WebElement prcdToChkot; 
	
	@FindBy (xpath="//button[@name='processCarrier']")
	private WebElement shippingPoced;
	
	@FindBy (xpath="//div[@id='uniform-cgv']")
	private WebElement termsAndCondtions;
	
	@FindBy (xpath="/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")
	private WebElement payByCheck;
	
	@FindBy (xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement confirmTheOrder;
	
	@FindBy (xpath="/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")
	private WebElement summaryChkOut;
	
	@FindBy (xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
	private WebElement dressesSelection;
	
	@FindBy (xpath="/html/body/div/div[2]/div/div[3]/div[2]/div[3]/div[2]/div[2]")
	private WebElement summerDressescnt;
	
	public void setDressesSelection()
	{
		dressesSelection.click();	
		System.out.println("success");
	}
	public void setsummerDressescnt()
	{
		String countCheck = summerDressescnt.getText();
		System.out.println(summerDressescnt);
	}
	
	public void setconfrmTheOrder()
	{
		confirmTheOrder.click();
		System.out.println("Your order on System store is complete");
	}
	
	public void setsummaryChkOut()
	{
		summaryChkOut.click();	
	}
	public void setpayByCheck()
	{
		payByCheck.click();
	}
	public void settermsAndCondtions()
	{
		termsAndCondtions.click();
	}
	public void setshippingPoced()
	{
		shippingPoced.click();
	}
	public void setAddressProced()
	{
		addressProceed.click();
	}
	public void setchiffonDressAddtCrt()
	{
		chiffonDressAddtCrt.click();
	}
	public void setprcdToChkot()
	{
		prcdToChkot.click();
	}
	public void setprinterChiffonDress() throws InterruptedException
	{
		printerChiffonDress.click();
		Thread.sleep(2000);
		System.out.println("select the printed chiffon Collection");
	}
	public void setspecialColln()
	{
		specialColln.click();
		System.out.println("select the special Collection");
	}	
	public void setAboutCompany()
	{
		aboutCompany.click();
	}	
	public void refresh()
	{
		selenium.refresh(driver);
	}	
	public void setCartChecking()
	{
		selenium.cartChecking(chkCart, driver, "3");
	}
	public void setProceedToChkOt()
	{
		proceedToChkOt.click();
	}
	public void setAddToCart()
	{
		addToCart.click();
	}
	public void setClear()
	{
		selenium.clear(quantityWanted);
	}
	public void setSizeText(String sizevalue)
	{
		selenium.gselectbyvisibletext(sizeText, sizevalue);
	}
	public void setQuantityWanted(String value)
	{
		quantityWanted.sendKeys(value);
		System.out.println("The Total Quantity of the item selected:"+value);
	}
	public void setItemImage() throws InterruptedException
	{
		selenium.hover(driver, itemImage);
		Thread.sleep(2000);
	}
	public void setselectMoreBtn()
	{
		selectMoreBtn.click();
	}
	public void setGenderRadioBtn()
	{
		genderRadioBtn.click();
	}
	public void setCustomerFirstName(String custFName)
	{
		customerFirstName.sendKeys(custFName);
	}
	public void setCustomerLastName(String custLName)
	{
		customerLastName.sendKeys(custLName);
	}
	public void setCustomerPwd(String custPwd)
	{
		customerPassword.sendKeys(custPwd);
	}
	public void setFirstName(String fN)
	{
		firstName.sendKeys(fN);
	}
	public void setLastName(String lN)
	{
		lastName.sendKeys(lN);
	}
	public void setAddress(String addr)
	{
		address.sendKeys(addr);
	}
	public void setCity(String cty)
	{
		city.sendKeys(cty);
	}
	public void setPostalCode(String pCode)
	{
		postalcode.sendKeys(pCode);
	}
	public void setPhoneMobile(String pMob)
	{
		phoneMobile.sendKeys(pMob);
	}
	public void setSubmitButton()
	{
		submitAccount.click();
	}
	public void pageHeading(String getpageHeading )
	{
		driver.findElement(By.xpath("//img[@class='logo img-responsive']")).getText();
		Reporter.log("Page Title: "+getpageHeading,true);
	}
	public  void checkIsEmail(String str )
	{
		eMail.sendKeys(str);
		
	}
	public void chkCreateSubmit() throws InterruptedException
	{
		createSubmit.click();
		Thread.sleep(3000);
	}
	
	public boolean setisElementPresent(By by)
	{
		if(selenium.isElementPresent(by))
		{
			return true;
		} else
			return false;
	}
	
	public void state(String ste)
	{
		selenium.gselectbyvisibletext(state, ste);
	}
	public void country(String cntry)
	{
		selenium.gselectbyvisibletext(country, cntry);
	}
	public void orderid(int n)
	{
		selenium.gselectbyindex(orderreference,n);
	}
	public void productid(int o)
	{
		selenium.gselectbyindex(nameproduct, o);
	}
	public void contactid(int m)
	{
		selenium.gselectbyindex(contactID, m);
	}
	public void setsignInButton()
	{
		signIn.click();
	}
	public void setUserName(String un)
	{
		UNTB.sendKeys(un);
	}
	public void setPasswrd(String pw)
	{
		PassWordTB.sendKeys(pw);
	}
	public void setsubmit()
	{
		SignIn.click();
	}
	public void searchmenuList(String sm)
	{
		searchMenuList.sendKeys(sm);
	}
	public void searchMenuClick()
	{
		menubtnclick.click();
	}
	public void searchsignOutButtons()
	{
		signOutButton.click();
	}
	public void contact_Store()
	{
		contactStore.click();
	}
	public void sendMessage()
	{
		writeTextMessage.sendKeys("All the Best to complete the scripts");
	}
	public void contactSendButton()
	{
		sendButton.click();
	}

}


