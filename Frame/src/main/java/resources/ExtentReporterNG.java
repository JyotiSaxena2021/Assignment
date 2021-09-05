package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	 static ExtentReports extent; //globally define this 

public static ExtentReports getReportObject()
{
	


	String path=System.getProperty("user.dir")+"\\reports\\index.html";

	ExtentSparkReporter	reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("WEbAutomationREsult");
	reporter.config().setDocumentTitle("Test Result");

	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Jyoti");
	return extent;

	
	
}

public static ExtentReports getReportObject1() {
	// TODO Auto-generated method stub
	return extent;
}
}