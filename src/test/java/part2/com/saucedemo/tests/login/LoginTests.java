package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTests extends BaseTest {
	
	@Test
	public void testLoginErrorMessage() { //test if error message shows from Login Page when invalid password is entered
		loginPage.setUsername("standard_user");
		loginPage.setPassword("abc123"); //wrong password
		loginPage.clickLoginButton();
		String actualMessage = loginPage.getErrorMessage();
		Assert.assertTrue(actualMessage.contains("Epic sadface:"));
	}
}
