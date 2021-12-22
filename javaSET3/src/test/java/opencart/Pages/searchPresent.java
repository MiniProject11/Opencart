package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchPresent {

	WebDriver driver;

	public searchPresent(WebDriver ldriver)
	{
		this.driver=ldriver;
	}

	@FindBy(xpath="//*[@id=\"search\"]/span/button") WebElement search_1;
	@FindBy(xpath="//*[@id=\"search\"]/input") WebElement search;


	public void validateSearch() {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		search_1.isDisplayed();
		search.isDisplayed();

	}

}
