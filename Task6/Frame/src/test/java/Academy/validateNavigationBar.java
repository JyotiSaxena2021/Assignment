package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;


//adding logs
//generating html reports
//screenshot on failures
//Jkins integration


public class validateNavigationBar extends base   //inheritence the property of base class
{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	


	@BeforeTest
	public void initialize() throws IOException
	{
		
		driver= initializeDriver();
	}
	
	
//	private boolean True;

	@Test
	/*public void basePageNavigation() throws IOException
	{WebDriverWait wait=new WebDriverWait(driver, 20);
	
		
		driver.get(prop.getProperty("url"));
		
		//one is inheritence
		//creating objetc to that class and invoke methods of it
		
		LandingPage l=new LandingPage(driver);
		
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		
		log.info("Navigation bar is displayed");
		
	
	}*/
	
	
	public void validateAppNavBar() throws IOException
	{

		//one is inheritance
		// creating object to that class and invoke methods of it
		LandingPage l=new LandingPage(driver);
	
		//compare the text from the browser with actual text.- Error..
	    Assert.assertTrue(l.getNavigationBar().isDisplayed());
	    log.info("Navigation Bar is displayed");
		 System.out.println("Test completed");
	 //   Assert.assertFalse(false);
		;
	
		
		}

@AfterTest
public void teardown() throws Exception
{
	
driver.close();
}


}
