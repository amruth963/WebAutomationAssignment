package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.commonutils.BrowserUtils;
import com.pageobjects.CartPageObjects;

public class CartPage extends BrowserUtils{


	public CartPageObjects cartPageObjects = new CartPageObjects();
	
	public CartPage() {
		PageFactory.initElements(driver, cartPageObjects);
	}

	public boolean increaseQuantity() {
		WebElement plusBtn = cartPageObjects.flipkartplusButton;
		try {
			//			Thread.sleep(4000);
			if(plusBtn.isDisplayed()) {
				plusBtn.click();
				Thread.sleep(4000);
			}
			return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public String getPrice() {
		String productPrice = null;
		WebElement priceDetails = cartPageObjects.flipkartpriceDetails;
		if(priceDetails.isDisplayed()) {
			productPrice = priceDetails.getText();
		}
		return productPrice;
	}

	public String getPriceOfiPhoneOnAmazon() {
		String iphoneAmazonPrice = null;
		WebElement iphonePrice = cartPageObjects.amazonpriceDetails;
		if(iphonePrice.isDisplayed()) {
			iphoneAmazonPrice = iphonePrice.getText();
		}
		return iphoneAmazonPrice;
	}

	public String getPriceOfiPhoneOnFlipkart() throws Exception{
		String iphoneFlipkartPrice = null;
		WebElement iphonePrice = cartPageObjects.flipkartiPhonePriceDetails;
		//		if(iphonePrice.isDisplayed()) {
		Thread.sleep(4000);
		iphoneFlipkartPrice = iphonePrice.getText();
		//		}
		return iphoneFlipkartPrice;
	}

}
