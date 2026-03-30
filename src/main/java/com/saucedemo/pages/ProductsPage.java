package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{
	public ProductsPage(WebDriver driver) {
		super(driver);
	}

	private By productsHeader = By.xpath("//span[text()='Products']");
	
	public boolean isProductsHeaderDIsplayed() {
		return find(productsHeader).isDisplayed();
	}
}
