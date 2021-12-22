package opencart.Pages;



import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.opencsv.CSVReader;

import webSearch.BrowserFactory;

public class BaseClass {


	public WebDriver driver;

	public ExtentHtmlReporter htmlReporter;  //ExtentReport
	public ExtentReports extent;                    //ExtentReport



	@BeforeClass
	public void setup() {

		driver=BrowserFactory.startApplication(driver, "Microsoft Edge", "http://localhost/open/");


		//ExtentReport
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}


	@AfterClass
	public void tearDown() {

		BrowserFactory.quitBrowser(driver);
		
		//ExtentReport
		extent.flush();

	}
	
	@DataProvider(name="Credentials")
	public Object[][] getData() throws IOException, Exception{
		
		String csvfile="./testData/LoginData.csv";
		CSVReader reader=new CSVReader(new FileReader(csvfile));
		String[] cell=reader.readNext();
		
		String loginData[][]=new String[10][2];
		int k=0;
		while((cell=reader.readNext())!=null) {
			
			for(int i=0;i<cell.length;i++)
			{
				loginData[k][i]=cell[i];
			}
			System.out.println();
			k++;
		}
		return loginData;
	}
}
