package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class base {

	public WebDriver driver; //globally define
	public Properties prop;
	String browserName[]= {"chrome","fiefox","IE"};
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//Automated- chrome,firefox,ie,safari

		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		//dc.se

		//Webdriver driver=new ChromeDriver();
		WebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		driver.get("http://rediff.com");



		// 
		}

	
		
	public WebDriver initializeDriver() throws IOException
	{
		
		
		prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\AmarJyoti\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		
		
		if(browserName.equals("chrome"))
		{
			
			//write code which execute on chrome
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AmarJyoti\\chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}
	
	
		else if(browserName.equals("firefox"))
	
		{	System.setProperty("webdriver.gecko.driver","C:\\Users\\AmarJyoti\\geckodriver.exe");
		
			driver=new FirefoxDriver();
			
		}
		else if(browserName.equals("IE"))

		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\AmarJyoti\\IEDriverServer.exe");
			
			driver=new InternetExplorerDriver();
			
		}
			
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
	}

	
	ExtentReports extent; //globally define this 
	@BeforeTest


		public void config()
		{
			String path=System.getProperty("user.dir")+"\\reports\\index.html";

			ExtentSparkReporter	reporter=new ExtentSparkReporter(path);
			reporter.config().setReportName("WEbAutomationREsult");
			reporter.config().setDocumentTitle("Test REsult");
		
			extent=new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Jyoti");
		
		
		
		}

	
	
public String getScreenShotPath(String TestcaseName,WebDriver driver) throws IOException
{
	
TakesScreenshot ts= (TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);
String destinationFile=System.getProperty("user.dir")+"\\reports\\"+TestcaseName+".png";
FileUtils.copyFile(source,new File(destinationFile));
return destinationFile;
}

}
