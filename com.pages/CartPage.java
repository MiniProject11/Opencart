package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	WebDriver driver;
	
	@FindBy(id="button-cart") WebElement button;
	
	@FindBy(id="cart-total") WebElement total;
	
	@FindBy(css="a:nth-child(1) > strong") WebElement viewcart;
	public CartPage(WebDriver driver) {
		this.driver = driver;
		}
	public void addMoreThan1(){
		 button.click();
		 button.click();
		 total.click();
		 viewcart.click();
	}
}
