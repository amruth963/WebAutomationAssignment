package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {

	@FindBy(xpath="//input[@class='LM6RPg']")
	public WebElement flipkartsearchTxtField;

	@FindBy(xpath="//button[@class='vh79eN']")
	public WebElement flipkartSearchBtn;

	@FindBy(xpath="//span[contains(text(),'Electronics')]")
	public WebElement flipkartelectronicsOption;

	@FindBy(xpath="//ul[@class='QPOmNK']/li[11]/a[contains(text(),'Pixel 3a | 3a XL')]")
	public WebElement flipkartpixelPhone;

	@FindBy(xpath="//div[contains(text(),'Google Pixel 3a (Just Black, 64 GB)')]")
	public WebElement flipkartgooglePixelPhone;

	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	public WebElement flipkartaddToCartBtn;

	@FindBy(id="twotabsearchtextbox")
	public WebElement amazonSearchTxtField;

	@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']")
	public WebElement amazonSearchBtn;

	@FindBy(xpath="//span[contains(text(),'Apple iPhone 6s (32GB) - Space Grey')]")
	public WebElement amazoniPhone6SSpaceGreyPhone;

	@FindBy(xpath="//*[contains(text(),'Apple iPhone 6s (Space Grey, 32 GB)')]")
	public WebElement flipkartiPhone6SSpaceGreyPhone;

}
