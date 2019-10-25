package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageObjects {


	@FindBy(xpath="//button[@class='wNrY5O'][2]")
	public WebElement flipkartplusButton;

	@FindBy(xpath="//span[@class='pMSy0p XU9vZa']")
	public WebElement flipkartpriceDetails;

	@FindBy(id="priceblock_dealprice")
	public WebElement amazonpriceDetails;

	@FindBy(xpath="//div[@class='_1uv9Cb']")
	public WebElement flipkartiPhonePriceDetails;
}
