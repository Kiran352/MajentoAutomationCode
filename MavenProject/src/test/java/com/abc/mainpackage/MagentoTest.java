package com.abc.mainpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.abc.magentoobjects.Home;
import com.abc.magentoobjects.Login;
import com.abc.magentoobjects.Logout;

public class MagentoTest {

	@Test
	public void magentoLogin() {

		WebDriver fire = new FirefoxDriver();
		fire.manage().window().maximize();
		fire.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String url = "http://www.magento.com";
		fire.get(url);

		Home home = new Home(fire);
		home.clickOnMyAccount();

		String emailData = "nitinmanjunath1991@gmail.com";
		String passwordData = "Welcome123";

		Login login = new Login(fire);
		login.typeEmail(emailData);
		login.typePassword(passwordData);
		login.clickOnLogin();

		Logout logout = new Logout(fire);
		logout.clickOnLogout();

		fire.quit();

	}

}
