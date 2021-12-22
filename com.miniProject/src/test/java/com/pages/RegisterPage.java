
package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(id="input-firstname") WebElement fname;
	@FindBy(id="input-lastname") WebElement lname;
	@FindBy(id="input-email") WebElement mail;
	@FindBy(id="input-telephone") WebElement tele;
	@FindBy(id="input-password") WebElement pass;
	@FindBy(id="input-confirm") WebElement conf;
	@FindBy(name="agree") WebElement agr;

	@FindBy(css=".btn-primary") WebElement btn;
	

	@FindBy(css=".list-inline .dropdown-toggle") WebElement toggle;

	@FindBy(linkText="Register") WebElement Rbtn;

	@FindBy(linkText="Logout") WebElement logout;
	@FindBy(linkText="Continue") WebElement conti;

	

	public void RegisterToOpenCart(String firstname,String lastname ,String email, String password,String confPass , String telephone) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		toggle.click();
		Rbtn.click();
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		mail.sendKeys(email);
		tele.sendKeys(telephone);
		pass.sendKeys(password);
		conf.sendKeys(confPass);
		agr.click();
		btn.click();
		
	}


}
