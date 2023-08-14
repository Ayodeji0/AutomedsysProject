/**
 * 
 */
package com.Automedsys.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automedsys.base.BaseClass;

/**
 * 
 * Author: Ayodeji Date: 2023
 */
public class LoginPage extends BaseClass {

	@FindBy(xpath = "//input[@id='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='PracticeRefNumber']")
	WebElement practiceId;
	@FindBy(xpath = "//span[@class='MuiButton-label']")
	WebElement loginBtn;
	@FindBy(xpath = "//body//div[@id='root']//div//div//div//div//div//div//img[2]")
	WebElement logo;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
//		super(driver);
		PageFactory.initElements(driver, this);
	}

	public boolean validateLogo() {
		 return logo.isDisplayed();
	}

	public HomePage Login(String uname, String pswd, String pracId) {
		username.sendKeys(uname);
		password.sendKeys(pswd);
		practiceId.sendKeys(pracId);
		loginBtn.click();
		return new HomePage(driver);
	}
}
