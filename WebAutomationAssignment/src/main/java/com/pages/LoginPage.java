package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.commonutils.BrowserUtils;
import com.pageobjects.LoginPageObjects;



public class LoginPage extends BrowserUtils {

	public LoginPageObjects loginPageObjects = new LoginPageObjects();

	public LoginPage() {
		PageFactory.initElements(driver, loginPageObjects);
	}


	public boolean launchFlipkartUrl() {
		try {
			driver.get("https://www.flipkart.com/");
			return true;
		}catch(Exception e) {
			e.getMessage();
			return false;
		}
	}

	public boolean launchAmazonUrl() {
		try {
			driver.get("https://www.amazon.in");
			return true;
		}catch(Exception e) {
			e.getMessage();
			return false;
		}
	}

	public boolean clickOnXButtonOnLoginModalWindow() throws Exception {
		WebElement xBtn = loginPageObjects.flipkartxButtonOnLoginModalScreen;
		if(xBtn.isDisplayed()) {
			Thread.sleep(8000);
			xBtn.click();
			return true;
		}else {
			return false;
		}
	} 





}
