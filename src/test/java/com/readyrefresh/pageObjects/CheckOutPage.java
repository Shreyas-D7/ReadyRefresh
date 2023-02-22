package com.readyrefresh.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList;

import com.github.javafaker.Faker;
import com.readyrefresh.testBase.BaseClass;

public class CheckOutPage extends BasePage {
	
	public CheckOutPage(WebDriver driver) {
		super(driver);
		
	}
	
	BaseClass bc = new BaseClass();
	//label[@id='create_account_label']//strong[contains(text(),'New to ReadyRefresh?')]
	
	@FindBy(xpath="//label[@id='create_account_label']")
	WebElement newToReadyRefresh;
	
	@FindBy(xpath ="//label[normalize-space()='Residential Customer']")
	WebElement residentialCustomer;
	
	@FindBy(xpath="//input[@id='checkout-complete-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='checkout-create-password1']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='checkout-create-password2']")
	WebElement confirmPwd;
	
	@FindBy(xpath="//label[contains(text(),'I agree with the Privacy Policy and the Terms & Co')][1]")
	WebElement clkPolicy;
	
	@FindBy(xpath="//label[contains(text(),'Yes, I’d like to get updates on discounts and deal')]")
	WebElement clkGetupdates;
	
	@FindBy(xpath="//button[@id='register-button1']")
	WebElement btnRegisterAndContinue;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement regFirstname;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement regLastName;
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	WebElement regPhoneNumber;
	
	@FindBy(xpath="//input[@name='mobilePhoneNumber']")
	WebElement regMobilePhoneNumber;
	
	@FindBy(xpath="//span[@class='checkmark']")
	WebElement getNoticification;
	
	@FindBy(xpath="//button[@id='customerInfoAddressSubmit']")
	WebElement btnSubmitCustomerInfo;
	
	@FindBy(xpath="//input[@id='request-address-line1']")
	WebElement txtStreetaddress;
	
	@FindBy(xpath="//li/div[contains(text(),'69 Broad St Stamford, CT 06901-2309')]")
	WebElement dropDownStreetAddress;
	
	@FindBy(xpath="//input[@id='postal_code']")
	WebElement postalCode;
	
	@FindBy(xpath="//li/div[contains(text(),'Stamford, CT 06901')]")
	WebElement dropdownPostalCode;
	
	@FindBy(xpath="//button[@id='addressSubmit']")
	WebElement btnAddressSubmit;
	
	@FindBy(xpath="//span[contains(text(),'Credit Card Billing Address is the same as Deliver')]")
	WebElement clkUseDeliveryAddress;
	
	@FindBy(xpath="//input[@id='card_nameOnCard']")
	WebElement nameOnCard;
	
	@FindBy(xpath="//select[@id='c-ct']")
	WebElement cardType;
	
	@FindBy(xpath="//input[@id='c-cardnumber']")
	WebElement cardNumber;
	
	@FindBy(xpath="//input[@id='ExpiryMonth']")
	WebElement expiryMonth;
	
	@FindBy(xpath="//input[@id='ExpiryYear']")
	WebElement expiryYear;
	
	@FindBy(xpath="//input[@id='card_cvNumber']")
	WebElement cardCVV;
	
	//@FindBy(xpath="//label[contains(@for,'autoAuthorizationCheck')]//span[contains(@class,'checkmark')]")
//	@FindBy(xpath="//span[contains(text(),'I authorize this card for automatic payments every')]")
	@FindBy(xpath="//*[@id='silentOrderPostForm']/div[1]/div[4]/section/div/div[2]/div[2]/div/label/span[2]")
	WebElement clkAuthorize;
	
	@FindBy(xpath="(//button[normalize-space()='Save and Continue'])[1]")
	WebElement cardSaveAndContinue;
	
//	@FindBy(xpath="//span[@class='ui-state-default']")
//	List <WebElement> allDates;
	
	@FindBy(xpath="//a[@aria-label='Next Month']")
	WebElement nextMonth;
	
	@FindBy(xpath="//a[@class='ui-state-default'][@role='button']")
	List <WebElement> availableDates;
	
	@FindBy(xpath="//td[contains(@disabled,'disabled')]")
	List <WebElement>  unavailableDates;
	
	@FindBy(xpath="//button[@id='deliveryTimeSubmit']")
	WebElement deliveryDateSubmit;
	
	@FindBy(xpath="//iframe[@id='xiFrameHosted']")
	WebElement cardIframe1;
	
	@FindBy(name="xieCommFrame")
	WebElement cardIframe2;
	
	@FindBy(xpath="//form/div/div/button[@id='placeOrder2']")
	WebElement placeOrderCTA;
	
	@FindBy(xpath="//*[@id=\"6713-3ed2_frndby_close_btn\"]/a/img")
	WebElement referaFriendBanner;
	
	Faker faker = new Faker();
	Actions act = new Actions(driver);
	WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));	
	
	String fName= faker.name().firstName();
	String lName = faker.name().lastName();
	String pwd = "Nestle123";
	String number = bc.randomNumber();
	
	public void selectNewToReadyRefresh()
	{
		newToReadyRefresh.click();
		
	}
	
	public void selectResidentialCustomer()
	{
		residentialCustomer.click();
	
	}
	
	public void txtEmail()
	{
		String generateEmail =  fName+"@"+lName+".com" ;
		System.out.println("Email : "+generateEmail);
		email.sendKeys(generateEmail);
	}
	
	public void setPassword()
	{
		password.sendKeys(pwd);
		System.out.println("Password : "+pwd);
	}
	
	public void setConfirmPwd()
	{
		confirmPwd.sendKeys(pwd);
		System.out.println("Confirm Password : "+pwd);
	}
	
	public void clkPolicy()
	{
		clkPolicy.click();
	}
	
	public void clkGetUpdates()
	{
		clkGetupdates.click();
	}
	
	public void clkRegisterAndContinue()
	{
		btnRegisterAndContinue.click();
	}
	
	public void setFirstName()
	{
		regFirstname.sendKeys(fName);
	}
	
	public void setLastName()
	{
		regLastName.sendKeys(lName);
	}
	
	public void setPhoneNumber()
	{
		regPhoneNumber.sendKeys(number);
	}
	
	public void setMobileNumber()
	{
		regMobilePhoneNumber.sendKeys(number);
	}

	public void clkGetNoticification()
	{
		getNoticification.click();
	
	}
//	public void selectCardType()
//	{
//		Select dropdown = new Select(CardType);
//		dropdown.selectByVisibleText("VISA");
//	}
	
	public void clkSubmitCustomerInfo() 
	{
		
	btnSubmitCustomerInfo.click();
	}
	
	public void setPostalCode()
	{
		postalCode.clear();
		postalCode.sendKeys("0690");
	}
	
	public void selectPostalcode()
	{
		dropdownPostalCode.click();
	}
	
	public void setStreetAddress()
	{
		txtStreetaddress.clear();
		txtStreetaddress.sendKeys("06901");
		
	}
	
	public void selectStreetAddress() 
	{
		dropDownStreetAddress.click();
		
	}
	
	public void clkAddressSubmit()
	{
		btnAddressSubmit.click();
	}
	
	
	public void selectDate() throws InterruptedException
	{
		
		System.out.println("inside select date");
		if(availableDates.size() != 0 )
		{
			for(WebElement i:availableDates)
			{
		
				System.out.println(i.getText());
				i.click();
				break;
			}	
		}
		else
		{
			System.out.println("no available dates in current month, going to next month");
			nextMonth.click();
			myWait.until(ExpectedConditions.visibilityOfAllElements(availableDates));
			
			for(WebElement j:availableDates)
			{
				j.click();
				break;
			}	
		}
			
	}
	
	public void clkDeliveryDateSubmit()
	{
		deliveryDateSubmit.click();
	}
	
	public void switchToCardFrame()
	{
		driver.switchTo().frame(cardIframe1);
		driver.switchTo().frame(cardIframe2);
	}
	
	public void enterCardDetails() throws InterruptedException
	{
		Thread.sleep(3);
		//clkUseDeliveryAddress.click();
		nameOnCard.sendKeys(fName);
		switchToCardFrame();
		System.out.println("name on card : " +fName);
		if(cardType.isDisplayed())
		{
			System.out.println("card type displayed");
			Select dropdown = new Select(cardType);
			dropdown.selectByVisibleText("VISA");
			cardNumber.sendKeys("4112344112344113");
		}
		else
		{
			System.out.println("refreshing");
			driver.navigate().refresh();
			System.out.println("refreshed");
			Select dropdown = new Select(cardType);
			dropdown.selectByVisibleText("VISA");
			cardNumber.sendKeys("4112344112344113");
		}
		
		driver.switchTo().defaultContent();
		expiryMonth.sendKeys("09");
		expiryYear.sendKeys("27");
		cardCVV.sendKeys("123");
		Thread.sleep(2);
		myWait.until(ExpectedConditions.visibilityOf(clkAuthorize));
		System.out.println("testing clkauthorie");
		//act.moveToElement(clkAuthorize).click().build().perform();
		clkAuthorize.click();
		cardSaveAndContinue.click();
		
	}
	
	public void clkPlaceOrderCta() throws InterruptedException
	{
	
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click()", placeOrderCTA);	
		
		myWait.until(ExpectedConditions.visibilityOf(referaFriendBanner));
		act.moveToElement(referaFriendBanner).click().build().perform();
		
		}
	

}



