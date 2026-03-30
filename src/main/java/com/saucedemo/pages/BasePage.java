package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage { //make abstract later so it will be the parent to all page object classes

	public static WebDriver driver; //so all the page object classes can access the driver
	
	public void setDriver(WebDriver driver) {
		BasePage.driver = driver;
	}
	
	//find element - protected because we only want to reuse this in our BASE PAGE and all of our PO classes
	protected WebElement find(By locator) {
		return driver.findElement(locator);
	}
	
	//PO classes will click element and set data TO an element
	protected void set(By locator, String text) {
		find(locator).clear(); //clear the data if data in it
		find(locator).sendKeys(text);
	}
	
	//
	protected void click(By locator) {
		find(locator).click();
	}
}
