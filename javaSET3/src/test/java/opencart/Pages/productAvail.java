package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productAvail {

	WebDriver driver;

	public productAvail(WebDriver ldriver)
	{
		this.driver=ldriver;
	}

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[4]/a") WebElement tabproduct;
	@FindBy(xpath="//*[@id=\"content\"]") WebElement productpage;

	public void checkCorrectPage() {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		tabproduct.click();
		productpage.isDisplayed();

	}
}
