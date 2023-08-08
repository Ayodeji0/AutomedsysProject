/**
 * 
 */
package com.Automedsys.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Automedsys.base.BaseClass;

/**
 * 
 *Author: Ayodeji
  * Date: 2023
 */
public class PatientManagementPage extends BaseClass {
	@FindBy(xpath="//img[@alt='COMPANY lOGO']") WebElement companylogo;
	@FindBy(xpath="//div[@class='MuiToolbar-root MuiToolbar-dense MuiToolbar-gutters']") WebElement addbtn;
	
	public PatientManagementPage() {
		PageFactory.initElements(driver, this);
	}
	 public boolean verifyLogo() {
		 companylogo.isDisplayed();
		 return true;
		 
	 }
}
