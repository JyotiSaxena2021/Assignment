import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraShop {


	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmarJyoti\\chromedriver.exe");
		String m= "https://www.myntra.com/"  ;

		WebDriver driver=new ChromeDriver();
		WebDriverWait w =new WebDriverWait(driver,5);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(m);
		//driver.findElement(By.partialLinkText("kids Trousers")).click();
		

		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mountRoot']")));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions a=new Actions(driver);
		
		
		WebElement move=driver.findElement(By.cssSelector("div[class='desktop-navLink']"));
		
		WebElement move1 = driver.findElement(By.cssSelector("div[class='desktop-userIconsContainer']"));
		a.moveToElement(driver.findElement(By.cssSelector("a[href*='men']"))).build().perform();
		
		
		
		driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/div/div/div/li[1]/ul/li[7]/a")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='desktopSearchResults']/div[1]/section/div[1]/div[1]/div/div/div")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='desktopSearchResults']/div[1]/section/div[1]/div[1]/div/div/div/ul/li[1]")).click();
		String title=new String (driver.findElement(By.xpath("//*[@id='mountRoot']/div/div[1]/main/div[3]/div[1]/section/div/div[1]/span")).getText());

		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		//Filter
		
		
		WebElement CheckBrand= driver.findElement(By.xpath("//*[@id='mountRoot']/div/div[1]/main/div[3]/div[1]/section/div/div[3]/ul/li[1]")); 
			for(int i=0;i<2;i++)
			{
				
				CheckBrand.click();
				System.out.println(CheckBrand.isSelected());
			}
			
		//driver.findElement(By.xpath("//input*[contains text(),'Roadster']")).click();
	/*	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			WebElement CheckPrice= driver.findElement(By.xpath("//*[@id='mountRoot']/div/div[1]/main/div[3]/div[1]/section/div/div[4]/ul/li[1]/label/div")); 
			for(int j=0;j<2;j++)
			{
				
				CheckPrice.click();
				System.out.println(CheckPrice.isSelected());
			}
			

			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

				
			WebElement CheckDisount= driver.findElement(By.xpath("//*[@id='mountRoot']/div/div[1]/main/div[3]/div[1]/section/div/div[6]/ul/li[5]")); 
			for(int k=0;k<2;k++)
			{
				
				CheckDisount.click();
				System.out.println(CheckDisount.isSelected());
			}
				
				
			*/
			//select item
				driver.findElement(By.xpath("//*[@id='desktopSearchResults']/div[2]/section/ul/li[3]/a/div[1]/div")).click();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				
				

			//Add in bag
				
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				
				
				driver.findElement(By.xpath("//*[contains(text(), 'Allow')]")).click();

			
				driver.findElement(By.xpath("//*[@id='sizeButtonsContainer']/div[2]/div[3]")).click();
				
				
				driver.findElement(By.xpath("//*[@id='mountRoot']/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]")).click();
		
				driver.findElement(By.xpath("//*[@id='cartItemsList']/div/div/div[2]/div/div[3]/div[2]/button")).click();
				driver.navigate().forward();
				driver.close();
				
				
				
				
				
				
	}
}


