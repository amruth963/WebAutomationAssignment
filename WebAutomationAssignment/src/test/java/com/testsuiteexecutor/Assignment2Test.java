package com.testsuiteexecutor;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.commonutils.BrowserUtils;
import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.LoginPage;

public class Assignment2Test extends BrowserUtils{

	public LoginPage loginPage;
	public HomePage homePage;
	public CartPage cartPage;

	public Assignment2Test() {
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
	public void assignment2TestCase() {
		try {
			loginPage.launchAmazonUrl();
			homePage.searchiPhoneOnAmamzon();
			homePage.selectiPhoneOnAmazon();
			String iphone6sPriceOnAmazon = cartPage.getPriceOfiPhoneOnAmazon();
			String res = iphone6sPriceOnAmazon.replaceAll("[₹,]", "");
			float amzMobilePrice = Float.parseFloat(res);
			loginPage.launchFlipkartUrl();
			loginPage.clickOnXButtonOnLoginModalWindow();
			homePage.searchiPhoneOnFlipkart();
			homePage.selectiPhoneOnFlipkart();
			String iphone6sPriceOnFlipKart = cartPage.getPriceOfiPhoneOnFlipkart();
			float flpMobilePrc = splitAndGetValues(iphone6sPriceOnFlipKart);
			if(amzMobilePrice<flpMobilePrc) {
				System.out.println("iPhone 6S 32GB(Space Grey) price is amazon is lesser than Flipkart");
			}else if(amzMobilePrice>flpMobilePrc) {
				System.out.println("iPhone 6S 32GB(Space Grey) price is flipkart is lesser than amazon");
			}else {
				System.out.println("iPhone 6S 32GB(Space Grey) price in flipkart and amazon is same");
			}
		}catch(Exception e){
			e.getMessage();
		}
	}



	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
