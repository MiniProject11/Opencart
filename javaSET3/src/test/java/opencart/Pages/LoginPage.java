package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {

		this.driver=ldriver;
	}

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]") WebElement MyAccount;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a") WebElement log;

	@FindBy(name="email")WebElement uname;

	@FindBy(name="password") WebElement pass;

	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input") WebElement Loginbtn;

	@FindBy(xpath="/html/body/div[2]/ul/li[1]/a/i") WebElement Home;

	public void LogintoOpencart(String userName, String passWord)
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		MyAccount.click();
		log.click();
		uname.sendKeys(userName);
		pass.sendKeys(passWord);
		Loginbtn.click();
		Home.click();
	}

}
