package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class imageDis {
	
	WebDriver driver;

	public imageDis(WebDriver ldriver) {

		this.driver=ldriver;
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[1]/a/img") WebElement image1;
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div/div[1]/a/img") WebElement image2;
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[3]/div/div[1]/a/img") WebElement image3;
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[4]/div/div[1]/a/img") WebElement image4;
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[1]/div/div[3]/img") WebElement slideshow;
	
	public void Display() {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		image1.isDisplayed();
		image2.isDisplayed();
		image3.isDisplayed();
		image4.isDisplayed();
		slideshow.isDisplayed();
	}
}
