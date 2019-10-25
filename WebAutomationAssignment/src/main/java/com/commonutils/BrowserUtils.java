package com.commonutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BrowserUtils {

	public static WebDriver driver;
	public static Properties prop;


	public BrowserUtils() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void launchBrowser() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty(prop.getProperty("ChromeKey"),prop.getProperty("ChromeValue"));
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
	}


	public void scrollup() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,-(Math.max(document.documentElement.scrollHeight),"
				+ "document.body.scrollHeight,document.documentElement.clientHeight));");
	}

	public void mouseHover(String xpath1, String xpath2) {
		try {
			Actions action = new Actions(driver);
			WebElement mainMenu = driver.findElement(By.xpath(xpath1));
			action.moveToElement(mainMenu).moveToElement(driver.findElement(By.xpath(xpath2))).click().build()
			.perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void switchTab() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	public void waitForElement(WebElement waitForEle) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(waitForEle));
	}


	public float splitAndGetValues(String values) {
		String[] priceList = values.split("₹");
		int prcLen = priceList.length;
		String price = null;
		for(int i=0; i<prcLen; i++) {
			price = priceList[1];
		}
		String convertedPrice = price.replace(",", "");
		float mobilePrice = Float.parseFloat(convertedPrice);
		return mobilePrice;
	}





}
