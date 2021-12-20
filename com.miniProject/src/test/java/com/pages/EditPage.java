package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditPage {
	WebDriver driver;

	public EditPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(linkText="Edit your account information") WebElement info;
	@FindBy(id="input-firstname") WebElement fname;
	@FindBy(id="input-lastname") WebElement lname;
	@FindBy(id="input-email") WebElement mail;
	@FindBy(id="input-telephone") WebElement tele;
	@FindBy(css=".btn-primary") WebElement cont;


	public void EditToApplication(String firstname,String lastname,String email, String telephone) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		info.click();
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		mail.sendKeys(email);
		tele.sendKeys(telephone);
		cont.click();

	}


}
