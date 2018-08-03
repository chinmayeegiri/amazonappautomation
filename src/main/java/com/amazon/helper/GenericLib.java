package com.amazon.helper;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class GenericLib {
	public static void changeToNativeView(AppiumDriver<WebElement> loopDriver){
		Set<String> contextHandles = loopDriver.getContextHandles();
		for (String s : contextHandles) {
			System.out.println("Context : " + s);
			if (s.contains("NATIVE")) {
				System.out.println("Start context change");
				loopDriver.context(s);
				System.out.println("Context changed");
			}	
		}
	}
	
	public static void changeToWebView(AppiumDriver<WebElement> loopDriver){
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
	public static void dropDown(WebElement locator, String value){
		Select dd = new Select(locator);
		dd.selectByValue(value);
		//dd.selectByVisibleText(value);
	}
	
    public static void mouseSendData(WebDriver driver, WebElement locator, String value){
    	Actions ac = new Actions(driver);
    	ac.moveToElement(locator).click().perform();
    	ac.sendKeys(value).perform();	
    }
    
    public static void mouseClick(WebDriver driver, WebElement locator){
    	Actions ac = new Actions(driver);
    	ac.moveToElement(locator).click().perform();
    }
	

}
