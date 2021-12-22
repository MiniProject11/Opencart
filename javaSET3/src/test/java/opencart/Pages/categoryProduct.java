package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class categoryProduct {

	WebDriver driver;

	public categoryProduct(WebDriver ldriver) {

		this.driver=ldriver;
	}
	
	@FindBy(xpath="/html/body/div[2]/ul/li[1]/a/i") WebElement home;
	@FindBy(xpath="/html/body/div[1]/nav/div[2]") WebElement view;
	
	public void checkCategory() {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		home.click();
		view.isDisplayed();
	}


}
