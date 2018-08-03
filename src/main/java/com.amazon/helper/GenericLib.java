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

	

}
