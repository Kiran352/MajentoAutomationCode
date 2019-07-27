package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver chrome;

	By email = By.id("email");
	By password = By.id("pass");
	By login = By.id("send2");

	public Login(WebDriver chrome) {
		this.chrome = chrome;
	}

	public void typeEmail(String emailData) {
		chrome.findElement(email).sendKeys(emailData);
	}

	public void typePassword(String passwordData) {
		chrome.findElement(password).sendKeys(passwordData);
	}

	public void clickOnLogin() {
		chrome.findElement(login).click();
	}

}
