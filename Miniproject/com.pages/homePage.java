package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	WebDriver driver;
    By product = By.linkText("Canon EOS 5D");
    By textbox_search =By.name("search");
    By button_search = By.cssSelector(".fa-search");
    By category = By.linkText("Desktops");
    By SuBcategory = By.linkText("Show All Desktops");
    By filter = By.linkText("Mac (1)");
    By product2 = By.linkText("MacBook");
	public homePage(WebDriver driver) {
	this.driver = driver;
	}
	public void clickonProduct() {
		driver.findElement(product).click();
	}
	
	public void clickonProduct2() {
		driver.findElement(product2).click();
	}
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
		
	}
	public void clickSearchButton() {
		driver.findElement(button_search).click();
	}
	public void clickonCategory()
	{
		driver.findElement(category).click();
	}
	public void clickonSuBCategory()
	{
		driver.findElement(SuBcategory).click();
	}
	public void SelectFilter()
	{
		driver.findElement(filter).click();
	}
	
	
	
	
}