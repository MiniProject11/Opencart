package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkoutPage  {

	public WebDriver driver;


	public checkoutPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css=".product-layout:nth-child(1) .img-responsive") WebElement product1;
	@FindBy(id="button-cart") WebElement dropdown;
	@FindBy(id="cart-total") WebElement dropopention;
	@FindBy(css="a:nth-child(2) > strong") WebElement cart;
	@FindBy(css=".col-sm-6:nth-child(1) > h2") WebElement homepage;


	public void withoutLogin() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		product1.click();
		dropdown.click();

		dropopention.click();
		cart.click();
		homepage.click();
		homepage.getText();
	}


}
