package com.amazon.config;
import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestConfig {
	static WebDriver amazonWeb;
	public static AppiumDriver<WebElement> getDriver() throws MalformedURLException{
		    System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "OnePlus6");
			caps.setCapability("udid", "2927f3e7");
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "8.1.0");
			caps.setCapability("appPackage", "in.amazon.mShop.android.shopping");
			caps.setCapability("appActivity", "com.amazon.mShop.home.web.MShopWebGatewayActivity");
			caps.setCapability("noReset", true);
			caps.setCapability("recreateChromeDriverSessions", true);
			AppiumDriver<WebElement> amazon = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			amazon.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return amazon;
	}
}
		

