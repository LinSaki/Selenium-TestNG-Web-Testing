package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demoqa.pages.forms.FormsPage;
import com.saucedemo.pages.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private By formsCard = By.xpath("//div[@id='root']//h5[text()='Forms']");
	
	public FormsPage goToForms() {
		click(formsCard);
		return new FormsPage(driver);
	}

}
