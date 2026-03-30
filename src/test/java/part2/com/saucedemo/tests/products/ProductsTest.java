package part2.com.saucedemo.tests.products;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.ProductsPage;

import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {
	@Test
	public void testProductsHeaderIsDisplayed() { //use convenience method
		ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
	Assert.assertTrue(productsPage.isProductsHeaderDIsplayed(), "\n Products Header is NOT displayed \n ");
	}
}
