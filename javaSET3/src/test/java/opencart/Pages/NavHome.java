package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavHome {
	
	WebDriver driver;

	public NavHome(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="/html/body/div[2]/ul/li[1]/a/i") WebElement home;
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div/div[1]/a/img") WebElement phoneRev;
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[2]/div[3]/p/a[2]") WebElement clickReviewButton;
	
	
	public void redirect() {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		home.click();
		phoneRev.click();
		clickReviewButton.click();
		home.click();
	}

}
