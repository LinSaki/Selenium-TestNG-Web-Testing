package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	private By usernameField = By.id("user-name");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login-button");
	private By errorMessage = By.cssSelector("#login_button_container h3"); //XPath (XML Path Language) is an expression and query language developed by the W3C 
																	  //used to navigate, select, and manipulate nodes (elements, attributes, text, etc.) 
																	  //in XML and HTML documents.
	public void setUsername(String username) {
		set(usernameField,username);
	}
	
	public void setPassword(String password) {
		set(passwordField, password);
	}
	
	public ProductsPage clickLoginButton() { //transition method, should NOT be void, it redirects you somewhere
		click(loginButton);
		return new ProductsPage(driver);
	}
	
	public ProductsPage logIntoApplication(String username, String password) { //convenience method - combines setting user & pass & login button 
		setUsername(username);
		setPassword(password);
		return clickLoginButton();
	}
	
	public String getErrorMessage() {
		return find(errorMessage).getText();
	}
}
