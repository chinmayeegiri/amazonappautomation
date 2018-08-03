package com.amazon.test;

import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.amazon.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	LoginPage loginPage;
	@BeforeTest(alwaysRun=true)
	public void beforeTest() {
		loginPage = new LoginPage(amazonDriver);
	}	
	
	@Test(testName="Login Test",description="Performs successful login", 
			priority=1,dataProvider="login")
		public void testLogin(Map<String,Object> login) throws InterruptedException{
		loginPage.login(login.get("email").toString(),login.get("password").toString(),login);
		System.out.println("logged in");
		Thread.sleep(5000);
	}

}
