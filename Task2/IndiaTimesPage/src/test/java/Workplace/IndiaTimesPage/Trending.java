package Workplace.IndiaTimesPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pageObjects.LandingPage;

public class Trending {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmarJyoti\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String url="https://www.indiatimes.com/";
		String msg,trend;
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Header");
		
		
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
		
		
		
		System.out.println("Footer");
		WebElement footer=driver.findElement(By.xpath("//*[@id=\'indiatimes_app_id\']/div/div/footer/div[1]/div[2]/div[7]"));
	    
	    List<WebElement> links1=footer.findElements(By.tagName("a"));
	    int count1=   links1.size();
	    System.out.println(count); 
	
	    for(WebElement footer1:links1)
	    {
		System.out.println(footer1.getText()); 
	    }
		
		
		
		System.out.println("Trending");
		driver.findElement(By.xpath("//*[@id='sectiontrending']/ul/li[7]/a")).click();
   
    for(int j=1;j<5;j++)
    {
    trend=driver.findElement(By.xpath("//*[@id=\"indiatimes_app_id\"]/div/div/div[3]/div[4]/div[2]/div/div["+j+"]/div/div[1]/a")).getText();

    System.out.println(trend);
    }
    
		
	driver.navigate().to(url);
	
	System.out.println("IPL-2020");
	driver.findElement(By.xpath("//a[@href='/ipl-indian-premier-league']")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	for(int i=1;i<=3;i++)  
	{
	msg=driver.findElement(By.xpath("//*[@id=\'indiatimes_app_id\']/div/div/div[2]/div[3]/div[2]/div["+i+"]/a[2]")).getText();
	System.out.println(msg);
	}
	
	
	}
	
}


