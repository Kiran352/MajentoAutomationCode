package com.abc.mainpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.abc.magentoobjects.Home;
import com.abc.magentoobjects.Login;
import com.abc.magentoobjects.Logout;

public class MagentoTest {

	@Test
	public void magentoLogin() {

		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String url = "http://www.magento.com";
		chrome.get(url);

		Home home = new Home(chrome);
		home.clickOnMyAccount();

		String emailData = "nitinmanjunath1991@gmail.com";
		String passwordData = "Welcome123";

		Login login = new Login(chrome);
		login.typeEmail(emailData);
		login.typePassword(passwordData);
		login.clickOnLogin();

		Logout logout = new Logout(chrome);
		logout.clickOnLogout();

		chrome.quit();

	}

}
