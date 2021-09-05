package Workplace.IndiaTimesPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Header {

	public static void main(String[] args) throws InterruptedException
	{
		
		

System.setProperty("webdriver.chrome.driver","C:\\Users\\AmarJyoti\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
String url="https://www.indiatimes.com/";

driver.get(url);
driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
    
    WebElement header=driver.findElement(By.xpath("//*[@id=\'sectiontrending\']"));
 
    List<WebElement> links=header.findElements(By.tagName("a"));
    int count=links.size();
   
    for(WebElement header1:links)
	 {
		System.out.println(header.getText()); 
	
	for(int i=0;i<9;i++)
		
	{
		System.out.println(i);
		
	}
	break;
	 }
    
    
	}
}
