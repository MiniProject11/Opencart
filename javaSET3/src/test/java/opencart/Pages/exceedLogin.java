package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class exceedLogin {
	
	WebDriver driver;

	public exceedLogin(WebDriver ldriver) {

		this.driver=ldriver;
	}
	
	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[2]/a/span[1]") WebElement clickMyAccount;
	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a") WebElement clickLogin;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input") WebElement enterId;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input") WebElement enterPass;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/input") WebElement clickLgnBtn;
	@FindBy(xpath="/html/body/div[2]/div[1]") WebElement checkDanger;
	
	public void checkExceed(String id, String pass) throws InterruptedException {
		
		Thread.sleep(3000);
		clickMyAccount.click();
		clickLogin.click();
		enterId.sendKeys(id);
		enterPass.sendKeys(pass);
		clickLgnBtn.click();
		checkDanger.isDisplayed();
	}



}
