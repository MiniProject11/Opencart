package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.utility.BaseClass;
import com.pages.RegisterPage;

public class RegisterTest extends BaseClass {

	 @Test (priority=1)	

	public void RegisterAppliction() {
	        logger = extent.createTest("Register To Application");

		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.RegisterToOpenCart("MYmini", "project", "1667opencart@gmail.com", "mini", "mini", "123445");
		Assert.assertTrue(verifyLoginTitle(), "Home page title doesn't match");

	}
	
	 
}
