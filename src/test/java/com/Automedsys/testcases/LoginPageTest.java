/**
 * 
 */
package com.Automedsys.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Automedsys.base.BaseClass;
import com.Automedsys.pages.HomePage;



/**
 * 
 *Author: Ayodeji
  * Date: 2023
 */
public class LoginPageTest extends BaseClass {

	HomePage homepage;
	
@Test
	public void verifyLogo() {
		 boolean flag=loginpage.validateLogo();
		Assert.assertTrue(flag);
	}
	@Test
	public void Login() {
		  homepage = loginpage.Login("deji", "P", "a");
		  String actualUrl = driver.getCurrentUrl();
		  String expectedUrl ="https://dev-ehrpm.automedsys.net/";
		  System.out.println(driver.getCurrentUrl());
		  System.out.println(driver.getTitle());
		  Assert.assertEquals(actualUrl, expectedUrl);
		 
	}
}
