package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.utility.BaseClass;
import com.pages.NevigationPage;
import com.pages.ValidationPage;

public class validation extends BaseClass{

	@Test (priority=1)		

	public void NevigationToHomePage() {
		logger = extent.createTest("Nevigation To HomePage");
		NevigationPage nevigation = PageFactory.initElements(driver, NevigationPage.class);
		nevigation.NevigationToOpenCart();

	}

	@Test (priority=2)		

	public void validationError() {
		logger = extent.createTest("Validation of mandatory fields");
		ValidationPage vp = PageFactory.initElements(driver, ValidationPage.class);
		vp.ValidationToOpenCart("MYmini", "project", "  ", "mini", "mini", "123445");

	}


}
