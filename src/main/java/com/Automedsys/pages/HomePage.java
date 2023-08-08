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
 *Author: Ayodeji
  * Date: 2023
 */
public class HomePage extends BaseClass {
 @FindBy(xpath="//span[contains(text(),'Patients')]")
 WebElement patientbtn;
 
 
 public HomePage(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }
 
 public PatientManagementPage addpatientbtn() {
	 patientbtn.click();
	 return new PatientManagementPage();
 }
}
