package com.readyrefresh.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.readyrefresh.testBase.BaseClass;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver)
	{
	super(driver);
		
		
	}
	Actions act = new Actions(driver); // Action class to handle mouse events
	WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//Elements
	
	@FindBy(xpath = "//a[@id='continue-login']")
	WebElement clkcontinueToLogin;
	
	@FindBy(xpath = "//a[contains(text(),'Log In')]")	
	WebElement login;
	
	@FindBy(xpath ="//input[@id='j_username']" )
	WebElement txtUsername;
	
	@FindBy(xpath = "//input[@id='j_password']" )
	WebElement txtpassword;
	
	@FindBy(xpath = "//button[@id='loginFormSubmit']")
	WebElement btnLogin ;
	
	@FindBy(xpath = "//img[@src='/_ui/responsive/common/images/SVG/close-icon-white.svg']")
	WebElement membershipPoppup ;

	
	public void clickLogin()
	{
		login.click();
	}

	public void continueTologin() throws InterruptedException 
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(5000);
		myWait.until(ExpectedConditions.visibilityOf(clkcontinueToLogin));
		act.moveToElement(clkcontinueToLogin).click().build().perform();
	}
	
	public void enterUserName()
	{
		txtUsername.clear();
		txtUsername.sendKeys("stress@rr.com");
	}
	
	public void enterPassword() 
	{
		txtpassword.clear();
		txtpassword.sendKeys("Nestle123");
	}
	
	public void clickBtnLogin()
	{
		btnLogin.click();
	}
	
	public void closeMembershipPopup() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		act.moveToElement(membershipPoppup).click().build().perform();		
	}
	
	
}
