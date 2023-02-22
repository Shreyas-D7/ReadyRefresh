package com.readyrefresh.testBase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.readyrefresh.pageObjects.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	


	public static WebDriver driver;
	public Logger logger;
	public ResourceBundle rb;
	
//	@Parameters("browser")  //for crossbrowser testing and parallel browser testing
	@BeforeClass
	public void setup()		//(String br)
	{
		
		logger=LogManager.getLogger(this.getClass());
		rb = ResourceBundle.getBundle("config"); // load config.properties file
		
/**	
		if(br.equals("Chrome")) {
		//WebDriverManager.chromedriver().setup();  // no need to use this in latest selenium update
		driver = new ChromeDriver();
		}
		else if( br.equals("Edge")){
			driver =new EdgeDriver();
		}else if(br.equals("firefox")) {
			driver = new FirefoxDriver();
			
		}else {
			driver = new ChromeDriver();
		}
		
	**/
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(rb.getString("ppr")); //getting URl from config file
		driver.manage().window().maximize();
	}
	
	public String captureScreen(String tname) {
		
//		SimpleDateFormat df =  new SimpleDateFormat("yyyyMMddhhmmss");
//		Date dt = new Date();
//		String timeStamp = df.format(dt);
//		wrting above code in single line below
		
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\"+tname + "_" +timeStamp+".png";
		
		try {
			FileUtils.copyFile(source, new File (destination));
		}
		catch(Exception e){
			e.getMessage();
		}
		
		return destination;
		
	}
	
	
	public String randomString1()
	{
		String generatedString1= RandomStringUtils.randomAlphabetic(5);
		return generatedString1;	
	}
	
	public String randomString2()
	{
		String generatedString2= RandomStringUtils.randomAlphabetic(3);
		return generatedString2;	
	}
	
	
	public String randomNumber()
	{
		String generatedNumber= RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}
	
	public String randomAlphaNumeric()
	{
		String str = RandomStringUtils.randomAlphabetic(3);
		String num =RandomStringUtils.randomNumeric(3);
		return str+"@"+num ;
	}
	
	

}
