package com.testcases;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.CartPage;
import com.pages.LoginPage;
import com.pages.homePage;

import com.base.utility.BaseClass;
public class TestCases extends BaseClass{
	
	@Test (priority=1) //Verifying the product availability option
	 public  void productavailTest() {
		logger = extent.createTest("ProductavailTest");
		//Select the product
		homePage prodclick =PageFactory.initElements(driver, homePage.class);
		prodclick.clickonProduct();
		//check product's availability
		assertThat(driver.findElement(By.cssSelector(".col-sm-4 li:nth-child(4)")).getText(), is("Availability: In Stock"));
	}
	 @Test (priority=2) //verifying the product's brand name
	 public  void BrandNameTest() {
		logger = extent.createTest("BrandNameTest");
		//Select the product
		homePage prodclick =PageFactory.initElements(driver, homePage.class);
		prodclick.clickonProduct();
		//check product's Brand name
		assertThat(driver.findElement(By.linkText("Canon")).getText(), is("Canon"));
		

	}
	 @Test (priority=3) //Verifying whether related products are shown 
	 public  void ReletedProductTest() {
		logger = extent.createTest("RelatedProductTest");
		//Select the product
		homePage prodclick =PageFactory.initElements(driver, homePage.class);
		prodclick.clickonProduct();
		//find the related product
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		assertThat(driver.findElement(By.cssSelector("#content > h3")).getText(), is("Related Products"));
	}
	 @Test (priority=4) //Verifying whether the add to cart button is present 
	 public  void CartButtonPresentTest() {
		logger = extent.createTest("CartButtonPresentTest"); 
		//Select the product
		homePage prodclick =PageFactory.initElements(driver, homePage.class);
		prodclick.clickonProduct();
		//check the add to cart button
		List<WebElement> elements = driver.findElements(By.id("button-cart"));
	    assert(elements.size() > 0);
	}
	@Test(priority=5) // Verifying whether the search functionality is working properly 
		public void SearchProductsTest() {
			logger = extent.createTest("SearchProductsTest"); 
			//click on search Bar
			homePage search =PageFactory.initElements(driver, homePage.class);
			//give search input
			search.setTextInSearchBox("phone");
			//click on the search button
			search.clickSearchButton();
		}
	@Test(priority=6) //Verifying whether the filter functionality is applying
		public void ApplyFilterTest() {
			logger = extent.createTest("ApplyFilterTest"); 
			homePage filterobj =PageFactory.initElements(driver, homePage.class);
			//Select Category
			filterobj.clickonCategory();
			//Select SubCategory
			filterobj.clickonSuBCategory();
			//Select Filter
			filterobj.SelectFilter();
			//Check the products according to the filter
			assertThat(driver.findElement(By.linkText("iMac")).getText(), is("iMac"));
		}
	 @Test(priority=7) // Verifying whether more than one product can be add to cart
		public void AddMorethan1toCart() {
		 	logger = extent.createTest("AddMorethan1toCart"); 
		 	//Login to the user account
			LoginPage loginpage =PageFactory.initElements(driver, LoginPage.class);
			loginpage.loginToOpencart("MiniProject2511@GMail.Com", "ProjectMini@2511");
			//Select the product
			homePage prod2click =PageFactory.initElements(driver, homePage.class);
			prod2click.clickonProduct2();
			//add more than one products to cart
			CartPage addtocart =PageFactory.initElements(driver, CartPage.class);
			addtocart.addMoreThan1();
			//go to the cart & check the quantity of the products
			assertThat(driver.findElement(By.cssSelector("thead .text-left:nth-child(4)")).getText(), is("Quantity"));    
			    
			    
		}
		@Test(priority=8) //Verifying whether the cart total option is shown
		public void CartTotal() {
			logger = extent.createTest("CartTotal"); 
			//select a product
			homePage prod2click =PageFactory.initElements(driver, homePage.class);
			prod2click.clickonProduct2();
			//add it to cart 
			CartPage addtocart =PageFactory.initElements(driver, CartPage.class);
			addtocart.addMoreThan1();
			//go to the cart & check total amount of the products
			assertThat(driver.findElement(By.cssSelector(".col-sm-4 tr:nth-child(4) strong")).getText(), is("Total:"));
		    
		} 


}
