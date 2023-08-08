/**
 * 
 */
package com.Automedsys.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Automedsys.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * Author: Ayodeji Date: 2023
 */
public class BaseClass {
	public WebDriver driver;
	public LoginPage loginpage;

	@BeforeMethod
	public void setup() {
		driver = WebDriverManager.chromedriver().create();
		driver = new ChromeDriver();
		driver.get("https://dev-ehrpm.automedsys.net/");
		driver.manage().window().maximize();;
		loginpage = new LoginPage(driver);
	}

	@AfterMethod
	public void tearDown() {
     driver.close();
	}

}
