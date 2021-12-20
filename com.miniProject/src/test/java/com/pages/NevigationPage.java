package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NevigationPage {
	public WebDriver driver;


	public NevigationPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css=".swiper-slide-active ") WebElement product1;
	@FindBy(id="button-cart") WebElement dropdown;
	@FindBy(id="cart-total") WebElement dropopention;
	@FindBy(css="a:nth-child(1) > strong") WebElement cart;
	@FindBy(css=".fa-home") WebElement homepage;


	public void NevigationToOpenCart() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		product1.click();
		dropdown.click();

		dropopention.click();
		cart.click();
		homepage.click();
	}


}
