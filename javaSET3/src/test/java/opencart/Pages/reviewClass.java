package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class reviewClass {
	
	WebDriver driver;

	public reviewClass(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="/html/body/div[2]/ul/li[1]/a/i") WebElement home;
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div/div[1]/a/img") WebElement phoneRev;
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[2]/div[3]/p/a[2]") WebElement clickReviewButton;
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[1]/div/div[2]/form") WebElement ReviewPresent;
	@FindBy(xpath="//*[@id=\"input-name\"]") WebElement writeName;
	@FindBy(xpath="//*[@id=\"input-review\"]") WebElement writeReview;
	@FindBy(xpath="//*[@id=\"form-review\"]/div[4]/div/input[5]") WebElement ratings;
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[1]/div/div[2]/form/div[5]/div/button") WebElement ClickContinueButton;
	@FindBy(xpath="//*[@id=\"form-review\"]/div[2]") WebElement messageDisplay;
	
	public void reviewDone(String NamE, String rev) {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		home.click();
		phoneRev.click();
		clickReviewButton.click();
		ReviewPresent.isDisplayed();
		writeName.sendKeys(NamE);
		writeReview.sendKeys(rev);
		ratings.click();
		ClickContinueButton.click();
		messageDisplay.isDisplayed();
	}
	

}
