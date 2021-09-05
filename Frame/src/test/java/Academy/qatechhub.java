

package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class qatechhub extends base   //inheritence the property of base class
{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	
	
	}
	
	
	private boolean True;

	@Test

	public void QA() 
	{
		
		driver.get("http://qatechhub.com");
		log.info("Navigated to qatechhub");
		
		//driver.get(m);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("QATest Completed");
		log.info("QASuccessfully validated text message");
		
	}
	
	@AfterTest
	public void fbook() throws Exception
	{
		driver.get("http://facebook.com");
		driver.get(prop.getProperty("fb"));  
		log.info("Navigated to Home page");
		//driver.navigate().to(fb);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("QATest Completed");
		log.info("QASuccessfully validated text message");
		
		
		
	}
	
	@AfterTest
	public void teardown() throws Exception
	{
		
	driver.close();
	}

}