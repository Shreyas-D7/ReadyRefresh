package com.readyrefresh.testCases;

import org.testng.annotations.Test;

import com.readyrefresh.pageObjects.AddOneTimeProductsToCart;
import com.readyrefresh.pageObjects.CheckOutPage;
import com.readyrefresh.pageObjects.LoginPage;
import com.readyrefresh.testBase.BaseClass;

public class TC_001_LoginPageTest extends BaseClass {
	
	@Test(priority = 1)
	void testLoginPage() throws InterruptedException
	
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.clickLogin();
		lp.continueTologin();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickBtnLogin();
		lp.closeMembershipPopup();
		
	}

	@Test(priority = 2)
	void testAddOneTimeProductsToCart() throws InterruptedException
	{
		AddOneTimeProductsToCart apc = new AddOneTimeProductsToCart(driver);
		
		apc.selectColdDrinks();
		apc.selectShopAllDrinks();
		apc.select2424Product();
		apc.increaseQty();
		apc.selectOneTimeFrequency();
		apc.addDelToNewCart();
		apc.goToCart();
		apc.clkProceedToCart();
		
	}
	
	@Test(priority=3)
	void checkOutPage() throws InterruptedException 
	{
		CheckOutPage cop = new CheckOutPage(driver);
		cop.selectDate();
		
	}
}
