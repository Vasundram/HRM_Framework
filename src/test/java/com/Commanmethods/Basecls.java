package com.Commanmethods;

import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.ReportAggregates;
import com.aventstack.extentreports.model.Author;
import com.aventstack.extentreports.model.Category;
import com.aventstack.extentreports.model.Device;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.model.ScreenCapture;
import com.aventstack.extentreports.model.Screencast;
import com.aventstack.extentreports.model.Test;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Basecls {
public static WebDriver driver;
public static ExtentReports report ;
public static ExtentTest logger;
@BeforeSuite
public static void initialexecution() {
	ExtentHtmlReporter extent=new ExtentHtmlReporter("E:\\vss\\HRM_UIApplication\\Reports\\HRM_"+getsystemdate()+".html");
	  report  =new ExtentReports();
	  report.attachReporter(extent);
	  
}

@AfterMethod
public static void screenshotsattachtoreport(ITestResult result) throws IOException {
	Reporter.log("Screebashots are going to attach");
	if(result.getStatus()==ITestResult.SUCCESS) {
	logger.pass("Success", MediaEntityBuilder.createScreenCaptureFromPath(Screenshots.getscreenshot("True")).build());
	Reporter.log("All the pass screens are captured");
	}
	
	else if(result.getStatus()==ITestResult.FAILURE)
	{
		Reporter.log("Screebashots are going to attach");
		logger.fail("Failure", MediaEntityBuilder.createScreenCaptureFromPath(Screenshots.getscreenshot("false")).build());
		Reporter.log("All the failure screens are captured");
	}
	else
	{
		System.out.println("User unable to captured screenshots");
	}
	
	report.flush();
	{
		Reporter.log("Html reports are comp[leated",true);
	}

}


public static String getsystemdate() {
	
	DateFormat dateformet=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	Date dte=new Date();
	return dateformet.format(dte);
}






	public static void getbrowser() {
		String Browser="Chrome";
		
		if(Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\vss\\HRM_UIApplication\\BrowserDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.testingmasters.com/hrm");	
		}
			else if(Browser.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "E:\\vss\\HRM_UIApplication\\BrowserDrivers\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.get("http://www.testingmasters.com/hrm");	
			}
			else if(Browser.equals("ie"))
			{
				System.setProperty("webdriver.ie.driver", "E:\\vss\\HRM_UIApplication\\BrowserDrivers\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				driver.get("http://www.testingmasters.com/hrm");	
			
			}
				
			else
			{
				System.out.println("Given Browser is mismatching");
			}

		}
	}
	

