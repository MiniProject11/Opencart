package com.base.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {


	public WebDriver driver;
	public static ExtentReports extent;
	public 	static ExtentTest logger;
	public 	static ExtentHtmlReporter htmlReporter;

	@BeforeClass
	public void setUp() {

		driver=BrowserFactory.startApllication(driver, "Chrome", "http://localhost/opencart/");	    

	}
	

	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}

	public boolean verifyBasePageTitle() {
		String expectedPageTitle="Your Store";
		return getPageTitle().contains(expectedPageTitle);
	}

	public boolean verifyLoginTitle() {
		String expectedPageTitle="My Account";
		return getPageTitle().contains(expectedPageTitle);
	}
	public boolean verifycheckoutTittle() {
		String expectedPageTitle="Checkout";
		return getPageTitle().contains(expectedPageTitle);
	}
	@BeforeSuite
	public void generateReport() {
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/TestCasesReports.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Host Name", "Mini Project");
		extent.setSystemInfo("Environment", "Automation Testing");
		extent.setSystemInfo("User Name", "Open Cart");
		reporter.config().setChartVisibilityOnOpen(true);
		reporter.config().setDocumentTitle("Automation Testing OF Open Cart");
		reporter.config().setReportName("OpenCart");
		reporter.config().setTestViewChartLocation(ChartLocation.TOP);
		reporter.config().setTheme(Theme.DARK);

		extent.attachReporter(reporter);



	}
	@AfterMethod
	public void tearDownextent(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			String str =report.getScreenshot(driver);
			logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(str).build());
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
		}
		else
		{
			logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
			logger.skip(result.getThrowable());
		}


	}
	@AfterSuite
	public void tearDownextent()
	
	{
		extent.flush();
		driver.quit();

	}
}