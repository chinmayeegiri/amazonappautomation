package com.amazon.test;
import java.net.MalformedURLException;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.amazon.config.TestConfig;

import io.appium.java_client.AppiumDriver;
public abstract class BaseTest{
		protected static AppiumDriver<WebElement> amazonDriver;
		@BeforeTest(alwaysRun=true)
		public abstract void beforeTest();		
		@BeforeSuite(alwaysRun=true)
		public void setup() throws MalformedURLException{
			amazonDriver = TestConfig.getDriver();
			Set<String> contextHandles = amazonDriver.getContextHandles();
			for (String s : contextHandles) {
				System.out.println("Context : " + s);
				if (s.contains("WEBVIEW")) {
					amazonDriver.context(s);
				}
			}
		}
		@AfterSuite(alwaysRun=true)
		public void destroy(){
			//driver.close();
		}
	}