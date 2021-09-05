package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base   //inheritence the property of base class
{
	public WebDriver driver;

	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		
	
	
	}
	
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String UserName,String Password ,String text) throws IOException
	{
		
		//one is inheritence
		//creating objetc to that class and invoke methods of it
		
		LandingPage l=new LandingPage(driver);
		
		l.getLogin().click(); //driver.findElement by.cssmethod
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys("xyz@gmail.com");
		//System.out.println("email");
		lp.getPassword().sendKeys("123456");

		log.info(text);
		
		
		lp.getLogin().click();
	}

@DataProvider
public Object[][] getData()
{
	//rows stands for how many different data types test should run
	//collumn stands for how many values per each test
	//Array size 2
	//0th row 
	//2rows and 3columns
	Object[][] data=new Object[2][3];
	
	data[0][0]="nonrestricteduser@qa.com";
	data[0][1]="1234345";
	data[0][2]="RestrictedUser";
	
	data[1][0]="restricteduser@qa.com";
	data[1][1]="1234345";
	data[1][2]="Non RestrictedUser";
	
	return data;
		

}
@AfterTest
public void teardown() 
{
	
driver.close();

}
}
