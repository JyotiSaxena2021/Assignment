package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

public WebDriver driver;




	By email=	By.cssSelector("[id='user_email']");
	By password=	By.cssSelector("[type='password']");
	By login=	By.cssSelector("[value='Log In']");

	public LoginPage(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
	
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		
		return driver.findElement(email); //return type method  of webelement
		
	}
	

	public WebElement getPassword()
	{
		
		return driver.findElement(password); //return type method  of webelement
		
	}
	
	public WebElement getLogin()
	{
		
		return driver.findElement(login); //return type method  of webelement
		
	}

	
	
}
