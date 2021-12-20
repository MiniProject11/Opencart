package com.base.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	WebDriver driver;
	By titleText =By.className("Your Store");

	public static WebDriver startApllication(WebDriver driver , String browsername,String URL) {

		if(browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");  

			driver = new ChromeDriver();

		}
		else if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver","./Drivers/geckodriver.exe");  

			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("we do not support this browser");

		}




		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);


		driver.get(URL);

		return driver;

	}

}
