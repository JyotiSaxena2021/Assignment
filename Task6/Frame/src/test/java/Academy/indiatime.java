

package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class indiatime extends base   //inheritence the property of base class
{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	String trend,msg,link111;
	@BeforeTest
	public void initialize() throws IOException
	{
		
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	
	
	}
	
	
	private boolean True;

	@Test

	public void IND() 
	{
		
		driver.get("http://indiatimes.com");
		log.info("Navigated to Indiatimes");
		driver.findElement(By.xpath("//*[@id='sectiontrending']/ul/li[7]/a")).click();
		   
		//driver.get(m);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		 for(int j=1;j<5;j++)
		    {
		    trend=driver.findElement(By.xpath("//*[@id=\"indiatimes_app_id\"]/div/div/div[3]/div[4]/div[2]/div/div["+j+"]/div/div[1]/a")).getText();

		    System.out.println(trend);
		    }
		    
		System.out.println("IND Test Completed");
		log.info("IND Successfully validated text message");
		
	}
	
	@AfterTest
	public void Trend() throws Exception
	{

		driver.navigate().back();
	//driver.navigate().to(url);
		
	System.out.println("IPL-2020");
	
	Actions a=new Actions(driver);
	
	//IPL2021==//*[@id='indiatimes_app_id']/div/div/div[2]/div/div/div[2]/div/div[3]/div/a
	WebElement move=driver.findElement(By.xpath("//*[@id='header']/div/div[2]/a[1]"));
	
	a.moveToElement(driver.findElement(By.xpath("//*[@id='indiatimes_app_id']/div/div/div[2]/div/div/div[2]/div/div[3]/div/a"))).build().perform();
	
	System.out.println(driver.findElement(By.xpath("//*[@id='indiatimes_app_id']/div/div/div[2]/div/div/div[2]/div/div[3]/div/a")).getTagName());
	
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	for(int i=1;i<4;i++)  
	{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	msg=driver.findElement(By.xpath("//*[@id=\'indiatimes_app_id\']/div/div/div[2]/div[3]/div[2]/div["+i+"]/a[2]")).getText();
	System.out.println(msg);
	}
		
		
		
	}
	
	@AfterTest
	public void teardown() throws Exception
	{
		
	driver.close();
	}

}