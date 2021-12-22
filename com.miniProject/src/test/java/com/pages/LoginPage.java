package com.pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}



	@FindBy(css=".list-inline .dropdown-toggle") WebElement toggle;

	@FindBy(linkText="Login") WebElement Lbtn;

	@FindBy(id="input-email") WebElement email;
	@FindBy(id="input-password") WebElement password;
	@FindBy(css=".btn:nth-child(3)") WebElement loginbutton;
	@FindBy(css=".fa-user") WebElement btn;
	@FindBy(linkText="Logout") WebElement logoutbtn;

	@FindBy(linkText="Continue") WebElement logoutcon;

	public void loginToOpencart(String usernameApplication,String passApplication) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		toggle.click();
		Lbtn.click();
		email.sendKeys(usernameApplication);
		password.sendKeys(passApplication);
		loginbutton.click();
		btn.click();
	

	}

public void logout() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	logoutbtn.click();
	logoutcon.click();
}



}
