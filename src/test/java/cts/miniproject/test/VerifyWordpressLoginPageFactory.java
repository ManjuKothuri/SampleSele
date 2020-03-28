package cts.miniproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cts.miniproject.pages.LoginPageWithPageFactory;
import cts.miniproject.utility.BrowseFactory;

public class VerifyWordpressLoginPageFactory {
	@Test
	public void checkValidUser() {
		//This will launch browser and specific URL
		BrowseFactory browsefactory=new BrowseFactory();
		WebDriver driver= browsefactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");

		//Create pageObject using specific URL
		LoginPageWithPageFactory loginpage=PageFactory.initElements(driver, LoginPageWithPageFactory.class);
		loginpage.typeUserNameAndPassword("admin", "demo123");
		loginpage.clickOnLoginButton();

		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://demosite.center/wordpress/wp-admin/", url);

	}
}
