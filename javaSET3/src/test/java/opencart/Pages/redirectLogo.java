package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class redirectLogo {
	
	WebDriver driver;

	public redirectLogo(WebDriver ldriver) {

		this.driver=ldriver;
	}
	
	@FindBy(xpath="/html/body/div[1]/nav/div[2]/ul/li[7]/a") WebElement cameraclick;
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[1]/a/img") WebElement clickcamera;
	@FindBy(xpath="/html/body/header/div/div/div[1]/div/a/img") WebElement clickhomelogo;
	@FindBy(xpath="/html/body/div[2]/div/div") WebElement homepage;
	
	public boolean checkLogo() throws InterruptedException {
		Thread.sleep(4000);
		cameraclick.click();
		clickcamera.click();
		clickhomelogo.click();
		homepage.isDisplayed();
		return true;
		
	}

}
