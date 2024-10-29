package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By tf_username = By.xpath("//input[@title='Email']");
	By tf_password = By.xpath("//input[@title='Password']");
	By btn_signin = By.xpath("(//button[@name='send']//span)[1]");
	
	
	public void verifyLogin(String Username, String Password) {
		driver.findElement(tf_username).sendKeys(Username);
		driver.findElement(tf_password).sendKeys(Password);
		driver.findElement(btn_signin).click();
	}
	
}
