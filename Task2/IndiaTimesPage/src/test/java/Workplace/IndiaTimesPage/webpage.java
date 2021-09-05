package Workplace.IndiaTimesPage;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class webpage 

{
	public static void main(String[] args) throws InterruptedException
		{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmarJyoti\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	String url="https://www.indiatimes.com/";
	
	driver.get(url);
	driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    WebElement footer=driver.findElement(By.xpath("//*[@id=\'indiatimes_app_id\']/div/div/footer/div[1]/div[2]/div[7]"));
	 
	    List<WebElement> links=footer.findElements(By.tagName("a"));
	 int count=   links.size();
	 System.out.println(count); 
	
	 for(WebElement footer1:links)
	 {
		System.out.println(footer1.getText()); 
	 }
	 
	 
	
		
	 
	 
	 
	 
		}
		
		

}
