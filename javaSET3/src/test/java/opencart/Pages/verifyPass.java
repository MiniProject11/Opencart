package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class verifyPass {
	
	WebDriver driver;

	public verifyPass(WebDriver ldriver) {

		this.driver=ldriver;
	}
	
	@FindBy(xpath="/html/body/div[2]/ul/li[1]/a/i") WebElement homeclick;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]") WebElement MyAccount;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a") WebElement log;

	@FindBy(name="email")WebElement uname;

	@FindBy(name="password") WebElement pass;

	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input") WebElement Loginbtn;
	
	@FindBy(xpath="/html/body/div[2]/div/aside/div/a[3]") WebElement clickPassword;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/fieldset/div[1]/div/input") WebElement pass1;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/fieldset/div[2]/div/input") WebElement pass2;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/div/div[2]/input") WebElement clikContinue;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/fieldset/div[2]/div/div") WebElement dangerError;
	
	
	public void ErrorCheckPass(String nameID, String pASS, String passw1, String passw2)
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		homeclick.click();
		MyAccount.click();
		log.click();
		uname.sendKeys(nameID);
		pass.sendKeys(pASS);
		Loginbtn.click();
		clickPassword.click();
		pass1.sendKeys(passw1);
		pass2.sendKeys(passw2);
		clikContinue.click();
		dangerError.isDisplayed();
		
	}


}
