package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class userProfilepresent {
	WebDriver driver;

	public userProfilepresent(WebDriver ldriver) {

		this.driver=ldriver;
	}
	
	@FindBy(xpath="/html/body/div[2]/ul/li[2]/a") WebElement account;
	
	@FindBy(xpath="/html/body/div[2]/div/div") WebElement profile;
	@FindBy(xpath="/html/body/div[2]/div/aside/div/a[13]") WebElement logout;
	
	public void CheckProfile() {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		account.click();
		profile.isDisplayed();
		logout.click();
	}

}
