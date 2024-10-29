package com.tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.utils.ReadXLSdata;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01 {
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
		
		
	}
	
	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="bvtdata")
	public void sheet1(String username, String password) {
		LoginPage login = new LoginPage(driver);
		login.verifyLogin(username, password);
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	
	
}
