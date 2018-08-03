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
		protected static AppiumDriver<WebElement> loopDriver;		
		@BeforeTest(alwaysRun=true)
		public abstract void beforeTest();		
		@BeforeSuite(alwaysRun=true)
		public void setup() throws MalformedURLException{
			loopDriver = TestConfig.getDriver();
			Set<String> contextHandles = loopDriver.getContextHandles();
			for (String s : contextHandles) {
				System.out.println("Context : " + s);
				if (s.contains("WEBVIEW")) {
					System.out.println("Start context change");
					loopDriver.context(s);
					System.out.println("Context changed");
				}	
			}
		}
		@AfterSuite(alwaysRun=true)
		public void destroy(){
			//driver.close();
		}
	}