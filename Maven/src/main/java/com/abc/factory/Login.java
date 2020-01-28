
package com.abc.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")WebElement username;
	@FindBy(id="pass")WebElement pass;
	@FindBy(id="send2")WebElement login;
//	By pwd=By.id("pass");
//	By login=By.id("send2");
	public void typeEmail(String email1)
	{
		username.sendKeys(email1);
	}
	public void typePassword(String password)
	{
		pass.sendKeys(password);
	}
	public void clickOnLogin()
	{
		login.click();
	}
}