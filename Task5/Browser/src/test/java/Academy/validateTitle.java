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

public class validateTitle extends base   //inheritence the property of base class
{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		
		driver= initializeDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home page");
		
		
	}
	
	private boolean True;

	@Test
/*	public void basePageNavigation() throws IOException
	{
		//one is inheritence
		//creating objetc to that class and invoke methods of it
		
		LandingPage l=new LandingPage(driver);
		
		//compare text from the browser with actual value ,if mismatch it will throw error
		
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		
		log.info("Successfully validated text message");
		
		//will fetch and text the title
		
		//Assert.assertTrue(True);
		//Assert.assertTrue(l.getTitle().isDisplayed());
		
	}*/
	
	public void validateAppTitle() throws IOException
	{
		//one is inheritence
		//creating objetc to that class and invoke methods of it
		
		LandingPage l=new LandingPage(driver);
		
		//compare text from the browser with actual value ,if mismatch it will throw error
		
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		
		log.info("Successfully validated text message");
		System.out.println("Test Completed");
		
		//will fetch and text the title
		
		//Assert.assertTrue(True);
		//Assert.assertTrue(l.getTitle().isDisplayed());
		
	}
	
	
	
	@AfterTest
	public void teardown() throws Exception
	{
		
	driver.close();
	}

}