package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest{
	
	@Test
	public void verifyLoginUrl()
	{
		LoginPage loginPage = new LoginPage();
		loginPage.loginAppl("Admin", "admin123");

		HomePage homePage = new HomePage();
		String actUrl = homePage.getHomePageUrl();
		String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		Assert.assertEquals(actUrl, expUrl,"Actual Url:" + actUrl+ " does not match with exp Url: " + expUrl);
	}
}
