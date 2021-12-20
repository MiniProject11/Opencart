package com.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.utility.BaseClass;
import com.opencsv.exceptions.CsvValidationException;
import com.pages.EditPage;
import com.pages.LoginPage;
import com.pages.checkoutPage;

public class checkout extends BaseClass{
	@Test (priority=1)		

	public void CheckoutToOpenCart() {
		logger = extent.createTest("Checkout without login");

		checkoutPage cp = PageFactory.initElements(driver, checkoutPage.class);
		cp.withoutLogin();
		Assert.assertTrue(verifycheckoutTittle(), "Home page title doesn't match");		
	}

	@Test (priority=2)		

	public void EditDetails() throws CsvValidationException, IOException {
		logger = extent.createTest("Edit details of already Register User");

		LoginPage loginpage =PageFactory.initElements(driver, LoginPage.class);
		loginpage.loginToOpencart("0111opencart@gmail.com", "mini");
		EditPage editpage = PageFactory.initElements(driver, EditPage.class);
		editpage.EditToApplication("Aashi", "Rathore", "rathore123@gmail.com", "2345671");

	}

}
