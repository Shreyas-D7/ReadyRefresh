package com.readyrefresh.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.readyrefresh.testBase.BaseClass;

public class AddOneTimeProductsToCart extends BasePage {
	
	public AddOneTimeProductsToCart(WebDriver driver)
	{
		super(driver);
		
	}
	
	Actions act = new Actions(driver);
	
	@FindBy(xpath="//span[@id='zipCodeHeaderField']")
	WebElement zipCodeDropDown;
	
	@FindBy(xpath="//input[@id='manualZipInputField']")
	WebElement zipCodeHomePage;
	
	@FindBy(xpath="//button[@id='changeZipCode']")
	WebElement changeZipCode;
	
	@FindBy(xpath = "//div[@id='navbar']//a[@id='ColdDrinksNavigationComponent']") 
	WebElement coldDrinks;

	@FindBy(xpath = "//li[@class='navdropdown nav-menu-list menu-open orange-bdr']//div[@id='ColdDrinksNavigationComponent_submenu']//div[@class='nav-submenu-list']//ul//li//a[@class='dropdown-item'][normalize-space()='Shop all Drinks']")
	WebElement shopAllDrinks;
	
	@FindBy(xpath="//a[@id='2424_product_details']")
	WebElement selectProd;
	
	@FindBy(xpath="//a[@aria-label='Increase Quantity']")
	WebElement incQty;
	
	@FindBy(xpath="//label[@for='optionsRadiosOneTime']")
	WebElement oneTimeFrequency;
	
	@FindBy(xpath="//button[@id='addToNewDelCartButton']")
	WebElement addToNewCart;
	
	@FindBy(xpath="//button[@id='gotToCart']")
	WebElement goToCart;
	
	@FindBy(xpath="//div[@class='item-cart-buttons checkout-btn mobile-hidden']//button[@role='link'][normalize-space()='Proceed to Checkout']")
	WebElement proceedToCart;
	
	@FindBy(xpath="//button[@name='addToCartButton']")
	WebElement addToCart;
	
	@FindBy(xpath="//button[@id='mcProceedtoCartBtn']")
	WebElement mcProceedtoCart;
	
	@FindBy(xpath=" //div[@class='item-cart-buttons checkout-btn mobile-hidden']//button[@role='link'][normalize-space()='Proceed to Checkout']")
	WebElement proceedToCheckOut;
	
	public void setZipCode()  
	{
		zipCodeDropDown.click();
		zipCodeHomePage.clear();
		zipCodeHomePage.sendKeys("06902");
		changeZipCode.click();
		
		
	}
	
	public void selectColdDrinks() throws InterruptedException 
	{
		Thread.sleep(10);
		coldDrinks.click();
	}
	
	public void selectShopAllDrinks() 
	{
		shopAllDrinks.click();
	}
	
	public void select2424Product()
	{
		selectProd.click();
		
	}
	
	public void increaseQty()
	{
		incQty.click();
	}
	
	public void selectOneTimeFrequency() 
	{
		oneTimeFrequency.click();
	}
	
	public void addDelToNewCart()
	{
		addToNewCart.click();
			
	}
	
	public void mcAddToCart()
	{
		mcProceedtoCart.click();
	}
	
	public void goToCart()
	{
		goToCart.click();
	}
	
	public void clkProceedToCart()
	{
		
		proceedToCart.click();	
	}
	
	public void clkMcProceedToCart()
	{
			mcProceedtoCart.click();
			
	}
		
	
	public void clkAddToCart() 
	{
		addToCart.click();
	}
	
	public void clkProceedToCheckOut()
	{
		proceedToCheckOut.click();
	}

}



