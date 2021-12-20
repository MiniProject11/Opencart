package com.testcases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.utility.BaseClass;
import com.pages.LoginPage;

public class LoginTest extends BaseClass {


	LoginPage loginpage =PageFactory.initElements(driver, LoginPage.class);

	@Test (priority=1)		

	public void ApplicationHomePage() {
		logger = extent.createTest("Application Home page");

		driver.manage().window().setSize(new Dimension(1050, 660));
		Assert.assertTrue(verifyBasePageTitle(), "Home page title doesn't match");
	}
	@Test (priority=2)		

	public void LoginApplication() {
		logger = extent.createTest("Login To Application");

		LoginPage loginpage =PageFactory.initElements(driver, LoginPage.class);

		loginpage.loginToOpencart("0991opencart@gmail.com", "mini");
		Assert.assertTrue(verifyLoginTitle(), "Home page title doesn't match");

	}


	@Test (priority=3)	
	public void ValidationIncorrect_Email() {
		logger = extent.createTest("Incorrect Email");

		loginpage.loginToOpencart("MiniProject2511GMail.Com", "ProjectMini@2511");
		Assert.assertTrue(verifyLoginTitle(), "Home page title doesn't match");

	}

	@Test (priority=4)	
	public void Validation_Blankspace() {
		logger = extent.createTest("BlankSpace in Password");

		loginpage.loginToOpencart("MiniProject2511GMail.Com", "  ");
		Assert.assertTrue(verifyLoginTitle(), "Home page title doesn't match");

	}



}

