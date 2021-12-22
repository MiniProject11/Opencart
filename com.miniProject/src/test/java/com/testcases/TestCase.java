package com.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.utility.BaseClass;
import com.opencsv.exceptions.CsvValidationException;
import com.pages.EditPage;
import com.pages.LoginPage;
import com.pages.NevigationPage;
import com.pages.RegisterPage;
import com.pages.ValidationPage;
import com.pages.checkoutPage;

public class TestCase extends BaseClass {

	@Test (priority=1)	
	//Register To OpenCart
	public void RegisterAppliction() {
		logger = extent.createTest("Register To Application");

		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.RegisterToOpenCart("MYmini", "project", "10079978467opencart@gmail.com", "mini", "mini", "123445");
		LoginPage lp =PageFactory.initElements(driver, LoginPage.class);
		lp.logout();

	}



	@Test (priority=2)		
	//Login TO OpenCart
	public void LoginApplication() {
		logger = extent.createTest("Login To Application");

		LoginPage loginpage =PageFactory.initElements(driver, LoginPage.class);

		loginpage.loginToOpencart("0991opencart@gmail.com", "mini");
		loginpage.logout();

	}
	@Test (priority=3)		
	//Nevigation To Home Page
	public void NevigationToHomePage() {
		logger = extent.createTest("Nevigation To HomePage");
		NevigationPage nevigation = PageFactory.initElements(driver, NevigationPage.class);
		nevigation.NevigationToOpenCart();

	}

	//Checkout without Login
	@Test (priority=4)		

	public void CheckoutToOpenCart() {
		logger = extent.createTest("Checkout without login");

		checkoutPage cp = PageFactory.initElements(driver, checkoutPage.class);
		cp.withoutLogin();
		Assert.assertTrue(verifycheckoutTittle(), "Home page title doesn't match");		
	}

	@Test (priority=5)		
	//Edit Details to Account
	public void EditDetails() throws CsvValidationException, IOException {
		logger = extent.createTest("Edit details of already Register User");

		LoginPage loginpage =PageFactory.initElements(driver, LoginPage.class);
		loginpage.loginToOpencart("0111opencart@gmail.com", "mini");
		EditPage editpage = PageFactory.initElements(driver, EditPage.class);
		editpage.EditToApplication("Aashi", "Rathore", "rathore123@gmail.com", "2345671");
		loginpage.logout();
	}

	@Test (priority=6)		
	//Validation
	public void validationError() {
		logger = extent.createTest("Validation of mandatory fields");
		ValidationPage vp = PageFactory.initElements(driver, ValidationPage.class);
		vp.ValidationToOpenCart("MYmini", "project", "  ", "mini", "mini", "123445");

	}

}
