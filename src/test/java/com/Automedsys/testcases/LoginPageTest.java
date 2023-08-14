/**
 * 
 */
package com.Automedsys.testcases;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Automedsys.base.BaseClass;
import com.Automedsys.pages.HomePage;
import com.Automedsys.pages.LoginPage;

/**
 * 
 * Author: Ayodeji Date: 2023
 */
public class LoginPageTest extends BaseClass {

	HomePage homepage;
	LoginPage loginpage;
	
	@BeforeTest
	public void initializeLoginPage() {
       loginpage = new LoginPage(driver); // Initialize the LoginPage object
	    }
	 
	@Test
	public void verifyLogo() {

		boolean flag = loginpage.validateLogo();
		Assert.assertTrue(flag);
	}


	@Test
	   public void Login() {
		homepage = loginpage.Login("deji", "P@rfect2", "aaal20201001");
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://dev-ehrpm.automedsys.net/";
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Assert.assertEquals(actualUrl, expectedUrl);

	}
}
