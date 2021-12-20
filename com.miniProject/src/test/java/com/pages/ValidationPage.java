package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class ValidationPage {
	WebDriver driver;
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

	@FindBy(css=".text-danger") WebElement error;
	public void ValidationToOpenCart(String firstname,String lastname ,String email, String password,String confPass , String telephone) {
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

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

		System.out.println("msg"+error.getAttribute("innerHTML"));
		String actual_err=error.getAttribute("innerHTML");
		String Exp_error ="Mail Address does not appear to be valid!";
		Assert.assertTrue(actual_err.contains(Exp_error));
		System.out.println("completed::");


	}

}
