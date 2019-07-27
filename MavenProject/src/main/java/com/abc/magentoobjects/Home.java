package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author nitin
 * 
 *         It stores the information of Login page of magentoApplication
 *
 */
public class Home {

	WebDriver chrome;

	/**
	 * Stores the locator information in myAccount variable
	 */
	By myAccount = By.linkText("My Account");

	/**
	 * @param chrome 
	 * It accepts the chrome browser reference from the caller
	 */
	public Home(WebDriver chrome) {
		this.chrome = chrome;
	}

	/**
	 * @return Nothing
	 * @since version=1.8 
	 * This method perfroms the click operation on webElement
	 * called myAccount
	 */
	public void clickOnMyAccount() {
		chrome.findElement(myAccount).click();

	}

}
