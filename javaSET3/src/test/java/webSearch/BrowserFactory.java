package webSearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFactory {


	@SuppressWarnings("deprecation")
	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL) {

		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();

		}
		else if(browserName.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver=new FirefoxDriver();

		}
		else if(browserName.equals("Microsoft Edge"))
		{
			System.setProperty("webdriver.msedge.driver", "./Driver/msedgedriver.exe");
			driver= new EdgeDriver();
		}
		else if(browserName.equals("Opera"))
		{
			System.setProperty("webdriver.opera.driver", "./Driver/operadriver.exe");
			driver=new OperaDriver();
		}
		else
		{
			System.out.println("We do not support this WebPage.");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

	public static void 	quitBrowser(WebDriver driver) {
		driver.quit();

	}

}
