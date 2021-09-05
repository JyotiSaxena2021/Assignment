package Task5;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class Browser {
	static DesiredCapabilities dc=new DesiredCapabilities();
	
	// TODO Auto-generated method stub
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		driver.get("http://google.com");
	}

		@Test()
		public void testOnChrome() throws MalformedURLException
		{
			dc.setBrowserName("chrome");
			dc.setPlatform(Platform.WIN10);
			
			WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
			driver.get("http://google.com");		
				
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
				
		}

		@Test()
		public void testOnIEBrowser() throws MalformedURLException
		{
		dc.setBrowserName("internetExplorer");
		dc.setPlatform(Platform.WIN10);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		driver.get("http://google.com");		
		
				
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
				
		}

		@Test()
		public void testOnFireFoxBrowser() throws MalformedURLException
		{
				
		dc.setBrowserName("geckodriver");
		dc.setPlatform(Platform.WIN10);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		driver.get("http://google.com");		
				
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
				
		}


WebDriver driver;
		@AfterClass
		public void close()
		{
		driver.quit();
		}
	}

	
	
	


