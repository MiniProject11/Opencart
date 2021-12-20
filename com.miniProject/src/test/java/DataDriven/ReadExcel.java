package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcel {
	WebDriver driver;


	@BeforeClass
	public void setbrowser() {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");  
		driver = new ChromeDriver();
		driver.get("http://localhost/opencart/");
	}
	@AfterClass
	public void down() {
		driver.close();
	}
	@Test(dataProvider="testdata")         //Data provider setUP
	public void demoClass(String username, String password) throws InterruptedException {

		driver.findElement(By.cssSelector(".list-inline .dropdown-toggle")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).click();

		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).click();


		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();

		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().matches("My Account"), "Invalid credentials");
		driver.findElement(By.cssSelector(".fa-user")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();

		System.out.println("Login successful");
	}

	@DataProvider(name="testdata")    // Data Provider Annotation
	public Object[][] testDataExample(){
		ReadExcelFile configuration = new ReadExcelFile("./data/login2.xlsx");
		int rows = configuration.getRowCount(0);
		Object[][]signin_credentials = new Object[rows][2];

		for(int i=0;i<rows;i++)
		{
			signin_credentials[i][0] = configuration.getData(0, i, 0);
			signin_credentials[i][1] = configuration.getData(0, i, 1);
		}
		return signin_credentials;
	}
}
