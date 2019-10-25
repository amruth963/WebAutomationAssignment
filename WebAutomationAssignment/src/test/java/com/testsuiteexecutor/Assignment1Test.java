package com.testsuiteexecutor;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.commonutils.BrowserUtils;
import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.LoginPage;

public class Assignment1Test extends BrowserUtils {


	public LoginPage loginPage;
	public HomePage homePage;
	public CartPage cartPage;

	public Assignment1Test() {
		super();
	}

	@BeforeMethod
	public void setUp(){
		launchBrowser();
		loginPage = new LoginPage();
		homePage = new HomePage();
		cartPage = new CartPage();
	}



	@Test
	public void assignment1TestCase() {
		try {
			loginPage.launchFlipkartUrl();
			loginPage.clickOnXButtonOnLoginModalWindow();
			homePage.selectPhoneFromElectronicsOption();
			homePage.selectPhone();
			homePage.clickOnAddToCartBtn();
			cartPage.increaseQuantity();
			cartPage.getPrice();
			System.out.println("The total payable price for Google Pixel 3a (Just Black, 64 GB) is: " +cartPage.getPrice());
		}catch(Exception e){
			e.getMessage();
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}





}
