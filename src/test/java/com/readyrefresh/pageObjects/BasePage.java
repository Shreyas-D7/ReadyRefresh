package com.readyrefresh.pageObjects;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	WebDriver driver;

	
	// Select dropDown;
	// Actions act = new Actions(driver);
	
	public BasePage(WebDriver driver) 
	{
		
		this.driver = driver;
	//	this.dropDown = dropDown;
		//this.act = act;
	
		PageFactory.initElements(driver, this);
	//	PageFactory.initElements(dropDown, this);
		
		
	}

	//Actions act = new Actions(driver);
}
