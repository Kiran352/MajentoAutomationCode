package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

	WebDriver chrome;

	By logout = By.linkText("Log Out");

	public Logout(WebDriver chrome) {
		this.chrome = chrome;
	}

	public void clickOnLogout() {
		chrome.findElement(logout).click();
	}

}
