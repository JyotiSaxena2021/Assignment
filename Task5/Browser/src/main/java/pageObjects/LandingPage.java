package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

public WebDriver driver;

	By signin=	By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	
	By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	
	
	
	public LandingPage(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
	
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		
		return driver.findElement(signin); //return type method  of webelement
		
		//System.out.println("This is landing page");
	}
	
	public WebElement getTitle()
	{
		
		return driver.findElement(title); //return type method  of webelement
		
	}
	
	
	public WebElement getNavigationBar()
	{
		
		return driver.findElement(NavBar); //return type method  of webelement
		
	}
	
}	
