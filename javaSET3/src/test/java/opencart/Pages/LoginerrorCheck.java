package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginerrorCheck {

	WebDriver driver;

	public LoginerrorCheck(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]") WebElement MyAccount;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a") WebElement logout;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a") WebElement log;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input")WebElement uname;
	
	@FindBy(xpath="//*[@id=\"input-password\"]") WebElement pass;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input") WebElement Loginbtn;
	
	@FindBy(xpath="//*[@id=\"account-login\"]/div[1]") WebElement danger;
	
	
	public void CheckError(String userName, String passWord)
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		MyAccount.click();
		logout.click();
		MyAccount.click();
		log.click();
		uname.sendKeys(userName);
		pass.sendKeys(passWord);
		Loginbtn.click();
		danger.isDisplayed();
	}



}
