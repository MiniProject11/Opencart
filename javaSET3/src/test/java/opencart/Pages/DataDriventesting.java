package opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataDriventesting {
	
	WebDriver driver;

	public DataDriventesting(WebDriver ldriver) {

		this.driver=ldriver;
	}
	
	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[2]/a/span[1]") WebElement MyAccountClick;
	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a") WebElement LoginClick;
	@FindBy(xpath="//*[@id=\"input-email\"]") WebElement LoginInsert;
	@FindBy(xpath="//*[@id=\"input-password\"]") WebElement PassWordInsert;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/input") WebElement LoginbtnClick;
	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a") WebElement LogoutClick;
	
	public void ddtApproach(String loginName, String PassWord) throws InterruptedException
	{
		Thread.sleep(2000);
		MyAccountClick.click();
		LoginClick.click();
		if((loginName.equals("Sud@gmail.com") && PassWord.equals("1234"))||(loginName.equals("JohnRambo@gmail.com") && PassWord.equals("John09675"))) {
		LoginInsert.sendKeys(loginName);
		PassWordInsert.sendKeys(PassWord);
		LoginbtnClick.click();
		MyAccountClick.click();
		LogoutClick.click();
	}
		else
		{
			LoginInsert.sendKeys(loginName);
			PassWordInsert.sendKeys(PassWord);
			LoginbtnClick.click();
		}
		
	}
			


}
