package testCASES;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import opencart.Pages.BaseClass;
import opencart.Pages.DataDriventesting;
import opencart.Pages.LoginPage;
import opencart.Pages.LoginerrorCheck;
import opencart.Pages.NavHome;
import opencart.Pages.categoryProduct;
import opencart.Pages.checkout;
import opencart.Pages.exceedLogin;
import opencart.Pages.imageDis;
import opencart.Pages.logo;
import opencart.Pages.productAvail;
import opencart.Pages.redirectLogo;
import opencart.Pages.reviewClass;
import opencart.Pages.searchPresent;
import opencart.Pages.userProfilepresent;
import opencart.Pages.verifyPass;
import opencart.Pages.verifyPassLen;

public class TestCases extends BaseClass {



	@Test(dataProvider="Credentials")
	void DatadrivenApproach(String username, String password) throws InterruptedException {

		DataDriventesting DataDrive=PageFactory.initElements(driver, DataDriventesting.class);
		DataDrive.ddtApproach(username,password);

		//Assert.assertEquals(driver.getTitle(), "Account Logout");
		//System.out.println("User is able to Login");
	}

	@Test(priority=2)
	public void loginApp() throws Exception{

		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.LogintoOpencart("Sud@gmail.com","1234");


		//ExtentReport
		ExtentTest test = extent.createTest("Verify that home icon is displayed and working after logging or not", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");


	}


	@Test(priority=3)
	public void searchCheck() throws Exception{

		searchPresent Searchpresent=PageFactory.initElements(driver, searchPresent.class);
		Searchpresent.validateSearch();

		//ExtentReport
		ExtentTest test = extent.createTest("Verify that search functionality is present in home page", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");


	}

	@Test(priority=4)
	public void RedirectingPage() throws Exception{

		productAvail Productavail=PageFactory.initElements(driver, productAvail.class);
		Productavail.checkCorrectPage();

		//ExtentReport
		ExtentTest test = extent.createTest("Verify that when user clicks on products, the site should be redirected to the product detail page ", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");

	}

	@Test(priority=5)
	public void ErrorLog() throws Exception{

		LoginerrorCheck loginErrorCheck=PageFactory.initElements(driver, LoginerrorCheck.class);
		loginErrorCheck.CheckError("Mud@gmail.com","1234");

		//ExtentReport
		ExtentTest test = extent.createTest("Verify if login portal displays any error message after login with wrong credentials", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");

	}

	@Test(priority=6)
	public void reviewGive() throws Exception{

		reviewClass ReviewClass=PageFactory.initElements(driver, reviewClass.class);
		ReviewClass.reviewDone("Sudipta Das","The Product iPhone is very good, with good screen and battery backup");


		//ExtentReport
		ExtentTest test = extent.createTest("Verify that user can give reviews on a particular product", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test(priority=7)
	public void CategoryProduct() throws Exception{

		categoryProduct Categoryproduct=PageFactory.initElements(driver, categoryProduct.class);
		Categoryproduct.checkCategory();

		//ExtentReport
		ExtentTest test = extent.createTest("Verify that product displayed on the home page are categorised.", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test(priority=8)
	public void displayCat() throws Exception{

		imageDis ImageDis=PageFactory.initElements(driver, imageDis.class);
		ImageDis.Display();

		//ExtentReport
		ExtentTest test = extent.createTest("Verify that images of the product are displayed correctly", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test(priority=9)
	public void passwordLen() throws Exception{

		verifyPassLen VerifypassLen=PageFactory.initElements(driver, verifyPassLen.class);
		VerifypassLen.checklen("Shandipan", "Seal", "Sandy@gmail.com","9876543210","12","12");

		//ExtentReport
		ExtentTest test = extent.createTest("Verify that entering invalid password length leads to validation error", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test(priority=10)
	public void Navigate() throws Exception{

		NavHome Navhome=PageFactory.initElements(driver, NavHome.class);
		Navhome.redirect();

		//ExtentReport
		ExtentTest test = extent.createTest("Navigate to Home Page after performing various operations", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test(priority=11)
	public void LogCheckOption() throws Exception{

		checkout Checkout=PageFactory.initElements(driver, checkout.class);
		Checkout.checkCash();

		//ExtentReport
		ExtentTest test = extent.createTest("Verify that URL is redirecting to Login/register page while checkout an item without login in", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test(priority=12)
	public void PasswordCheck() throws Exception{

		verifyPass Verifypass=PageFactory.initElements(driver, verifyPass.class);
		Verifypass.ErrorCheckPass("Sud@gmail.com","1234","1234","123");

		//ExtentReport
		ExtentTest test = extent.createTest("Verify if any error message is shown after entering invalid password during password confirmation", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test(priority=13)
	public void profileCHek() throws Exception{

		userProfilepresent Userprofilepresent=PageFactory.initElements(driver, userProfilepresent.class);
		Userprofilepresent.CheckProfile();

		//ExtentReport
		ExtentTest test = extent.createTest("Verify that user profile section is present in home page", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test(priority=14)
	public void exceed() throws Exception{

		exceedLogin login=PageFactory.initElements(driver, exceedLogin.class);
		login.checkExceed("Sud@gmail.com", "4536");

		//ExtentReport
		ExtentTest test = extent.createTest("Verify that error message is displayed after login invalid details multiple times", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test(priority=15)
	public void Validatelogo() throws Exception {

		logo Logo=PageFactory.initElements(driver, logo.class);
		boolean flag=Logo.checkLogo();
		Assert.assertTrue(flag);

		//ExtentReport
		ExtentTest test = extent.createTest("Verify that Logo is present in opencart Home Page ", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test(priority=16)
	public void rediret() throws Exception {

		redirectLogo Logo_1=PageFactory.initElements(driver, redirectLogo.class);
		boolean flag=Logo_1.checkLogo();
		Assert.assertTrue(flag);

		//ExtentReport
		ExtentTest test = extent.createTest("Verify that Logo can redirect to Home Page or not", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}


}
