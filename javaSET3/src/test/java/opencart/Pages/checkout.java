package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkout {
	
	WebDriver driver;

	public checkout(WebDriver ldriver) {

		this.driver=ldriver;
	}
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]/span") WebElement addTocart;
	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[5]/a/span") WebElement chekOut;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/div/div/div[2]") WebElement logPage;
	@FindBy(xpath="/html/body/header/div/div/div[3]/div/button")WebElement RemoveProduct;
	@FindBy(xpath="/html/body/header/div/div/div[3]/div/ul/li[1]/table/tbody/tr/td[5]/button") WebElement clickRemove;
	
	public void checkCash() {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		addTocart.click();
		chekOut.click();
		logPage.isDisplayed();
		RemoveProduct.click();
		clickRemove.click();
	}
	
	


}
