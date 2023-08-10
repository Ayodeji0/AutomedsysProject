/**
 * 
 */
package com.Automedsys.testcases;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Automedsys.base.BaseClass;
import com.Automedsys.pages.HomePage;
import com.Automedsys.pages.PatientManagementPage;

/**
 * 
 * Author: Ayodeji Date: 2023
 */
public class HomePageTest extends BaseClass {
	HomePage homepage;

	@Test
	public void addpatientbtn() throws InterruptedException {
		homepage = loginpage.Login("deji@automedsys.com", "P@rfect2", "aal20201001");
		homepage.addpatientbtn();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://dev-ehrpm.automedsys.net/patient";
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	

}
