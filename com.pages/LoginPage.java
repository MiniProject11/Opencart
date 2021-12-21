package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	@FindBy(css=".fa-home") WebElement home;



	public void loginToOpencart(String usernameApplication,String passApplication) {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



	toggle.click();
	Lbtn.click();
	email.sendKeys(usernameApplication);
	password.sendKeys(passApplication);
	loginbutton.click();
	home.click();


	

}
}
