package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class verifyPassLen {

	WebDriver driver;

	public verifyPassLen(WebDriver ldriver) {

		this.driver=ldriver;
	}
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]") WebElement MyAccount;
	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a") WebElement register;
	@FindBy(name="firstname") WebElement fName;
	@FindBy(name="lastname") WebElement lName;
	@FindBy(xpath="/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input") WebElement EmailID;
	@FindBy(xpath="/html/body/div[2]/div/div/form/fieldset[1]/div[5]/div/input") WebElement MobileNumber;
	@FindBy(xpath="/html/body/div[2]/div/div/form/fieldset[2]/div[1]/div/input") WebElement pass;
	@FindBy(xpath="/html/body/div[2]/div/div/form/fieldset[2]/div[2]/div/input") WebElement confirmpass;
	@FindBy(xpath="/html/body/div[2]/div/div/form/div/div/input[1]") WebElement checkBox;
	@FindBy(xpath="/html/body/div[2]/div/div/form/div/div/input[2]") WebElement continueButton;
	@FindBy(xpath="/html/body/div[2]/div/div/form/fieldset[2]/div[1]/div/div") WebElement dangerMessage;
	
	
	public void checklen(String First, String Last, String Email, String Mobile, String passw, String conpass) {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		
		MyAccount.click();
		register.click();
		fName.sendKeys(First);
		lName.sendKeys(Last);
		EmailID.sendKeys(Email);
		MobileNumber.sendKeys(Mobile);
		pass.sendKeys(passw);
		confirmpass.sendKeys(conpass);
		checkBox.click();
		continueButton.click();
		dangerMessage.isDisplayed();
		
	}
}
