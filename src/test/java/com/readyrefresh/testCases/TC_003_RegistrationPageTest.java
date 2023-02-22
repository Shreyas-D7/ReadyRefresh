package com.readyrefresh.testCases;

import org.testng.annotations.Test;

import com.readyrefresh.pageObjects.AddOneTimeProductsToCart;
import com.readyrefresh.pageObjects.CheckOutPage;
import com.readyrefresh.pageObjects.RegistrationPage;
import com.readyrefresh.testBase.BaseClass;

public class TC_003_RegistrationPageTest extends BaseClass  {
	
	@Test(priority=1)
	void addOneTimeProductsToCart() throws InterruptedException 
	{
		logger.debug("Application log .................................");
		logger.info("***** Starting TC_003_REgistrationPageTest******");
		
		AddOneTimeProductsToCart apc = new AddOneTimeProductsToCart(driver);
		//apc.setZipCode();
		apc.selectColdDrinks();
		apc.selectShopAllDrinks();
		apc.select2424Product();
		apc.increaseQty();
		apc.selectOneTimeFrequency();
		apc.clkAddToCart();
		logger.info("Added produ2ct to cart");
		
		apc.clkMcProceedToCart();
		apc.clkProceedToCheckOut();
	}
	
	@Test(priority=2)
	void checkOutPage() throws InterruptedException
	{
		CheckOutPage cop =new CheckOutPage(driver);
		
		cop.selectNewToReadyRefresh();
		cop.selectResidentialCustomer();
		cop.txtEmail();
		cop.setPassword();
		cop.setConfirmPwd();
		cop.clkPolicy();
		cop.clkGetUpdates();
		cop.clkRegisterAndContinue();
		cop.setFirstName();
		cop.setLastName();
		cop.setPhoneNumber();
		cop.setMobileNumber();
		cop.clkGetNoticification();
		cop.clkSubmitCustomerInfo();
		cop.setPostalCode();
		cop.selectPostalcode();
		cop.setStreetAddress();
		cop.selectStreetAddress();
		cop.clkAddressSubmit();
		cop.selectDate();
		cop.clkDeliveryDateSubmit();
		cop.enterCardDetails();
		//cop.clkPlaceOrderCta();
		
	}

}
