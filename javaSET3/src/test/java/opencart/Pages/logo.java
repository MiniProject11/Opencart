package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logo {
	
	WebDriver driver;

	public logo(WebDriver ldriver) {

		this.driver=ldriver;
	}
	
	@FindBy(xpath="/html/body/header/div/div/div[1]/div/a/img") WebElement verifyLogo;
	
	public boolean checkLogo() throws InterruptedException {
		Thread.sleep(4000);
		verifyLogo.isDisplayed();
		return true;
		
	}


}
