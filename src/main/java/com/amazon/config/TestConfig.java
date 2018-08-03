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
	static WebDriver Loop;
	public static AppiumDriver<WebElement> getDriver() throws MalformedURLException{
	DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "OnePlus3T");
//			caps.setCapability("udid", "61116526");
//			caps.setCapability("platformName", "Android");
//			caps.setCapability("platformVersion", "7.1.1");

	caps.setCapability("appPackage", "com.cavantics.loop");
	caps.setCapability("appActivity", "com.cavantics.loop.MainActivity");
	caps.setCapability("noReset", "true");
	caps.setCapability("recreateChromeDriverSessions", true);
	AppiumDriver<WebElement> loop = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	loop.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	return loop;
	}
}
		

