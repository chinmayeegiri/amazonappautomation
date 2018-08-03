package com.amazon.pages;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.helper.BasePageObject;
public class LoginPage extends BasePageObject{
	public LoginPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(className="submit-button")
	WebElement submitBtn;
	public void login(String username, String password, Map<String, Object> login){
		this.email.sendKeys(username);
		this.password.sendKeys(password);
		this.submitBtn.click();
	}
}
