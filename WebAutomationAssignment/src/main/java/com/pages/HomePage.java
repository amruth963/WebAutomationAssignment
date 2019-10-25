package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.commonutils.BrowserUtils;
import com.pageobjects.HomePageObjects;

public class HomePage extends BrowserUtils {

	public HomePageObjects homePageObjects = new HomePageObjects();

	public HomePage() {
		PageFactory.initElements(driver, homePageObjects);
	}



	public boolean selectPhoneFromElectronicsOption() {
		try {
			//			Thread.sleep(4000);
			if(homePageObjects.flipkartelectronicsOption.isDisplayed()) {
				homePageObjects.flipkartelectronicsOption.click();
				Thread.sleep(4000);
				//				if(homePageObjects.flipkartpixelPhone.isDisplayed()) {
				//					homePageObjects.flipkartpixelPhone.click();
				//				}
				//			mouseHover("//span[contains(text(),'Electronics')]", "//ul[@class='QPOmNK']/li[11]/a[contains(text(),'Pixel 3a | 3a XL')]");
				Actions action = new Actions(driver);
				action.moveToElement(homePageObjects.flipkartpixelPhone).click().build().perform();
			}
			return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean selectPhone() {
		WebElement phone = homePageObjects.flipkartgooglePixelPhone;
		try {
			Thread.sleep(4000);
			if(phone.isDisplayed()) {
				Thread.sleep(4000);
				phone.click();
				switchTab();
			}
			return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}


	public boolean clickOnAddToCartBtn() {
		WebElement cartBtn = homePageObjects.flipkartaddToCartBtn;
		try {
			if(cartBtn.isDisplayed()) {
				cartBtn.click();
				Thread.sleep(4000);
			}
			return true;
		}catch(Exception e) {
			e.getMessage();
			return false;
		}
	}

	public boolean searchiPhoneOnAmamzon() {
		try {
			WebElement iphoneSearch = homePageObjects.amazonSearchTxtField;
			WebElement searchBtn = homePageObjects.amazonSearchBtn;
			if(iphoneSearch.isDisplayed()) {
				Thread.sleep(4000);
				iphoneSearch.sendKeys("​iPhone 6 32 gb(black)");
				if(searchBtn.isDisplayed()) {
					searchBtn.click();
				}
			}
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	public boolean searchiPhoneOnFlipkart() {
		try {
			WebElement iphoneSearch = homePageObjects.flipkartsearchTxtField;
			WebElement searchBtn = homePageObjects.flipkartSearchBtn;
			if(iphoneSearch.isDisplayed()) {
				Thread.sleep(4000);
				iphoneSearch.sendKeys("​iPhone 6s 32 gb(black)");
				iphoneSearch.click();
				if(searchBtn.isDisplayed()) {
					Thread.sleep(4000);
					searchBtn.click();
				}
			}
			return true;
		}catch(Exception e) {
			return false;
		}
	}


	public boolean selectiPhoneOnAmazon() {
		try {
			WebElement selectiPhone = homePageObjects.amazoniPhone6SSpaceGreyPhone;
			if(selectiPhone.isDisplayed()) {
				selectiPhone.click();
				switchTab();
			}
			return true;
		}catch (Exception e) {
			return false;
		}
	}


	public boolean selectiPhoneOnFlipkart() {
		try {
			WebElement selectiPhone = homePageObjects.flipkartiPhone6SSpaceGreyPhone;
			Thread.sleep(4000);
			if(selectiPhone.isDisplayed()) {
				Thread.sleep(4000);
				selectiPhone.click();
			}
			return true;
		}catch (Exception e) {
			return false;
		}
	}











}
