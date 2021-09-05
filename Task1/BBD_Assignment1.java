import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BBD_Assignment1 {

	public static void main(String[] args)  throws InterruptedException
	
	
	
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmarJyoti\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebDriverWait w =new WebDriverWait(driver,5);

		
		driver.get("https://google.com");
		
		
		driver.manage().window().maximize();
		
		String m="http://qatechhub.com" ;
		String fb="http://facebook.com" ;
		
		driver.get(m);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to(fb);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
	}

}
