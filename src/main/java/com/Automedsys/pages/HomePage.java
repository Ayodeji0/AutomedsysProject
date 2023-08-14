/**
 * 
 */
package com.Automedsys.pages;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Automedsys.base.BaseClass;

/**
 * 
 *Author: Ayodeji
  * Date: 2023
 */
public class HomePage extends BaseClass {
    @FindBy(xpath = "//img[@alt='patient']")
    WebElement patientbtn;

    public HomePage(WebDriver driver) { 
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public PatientManagementPage addpatientbtn() {
        // Wait for the button to be clickable
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(patientbtn));
//        String pageSource = driver.getPageSource();
//        System.out.println(pageSource);
        patientbtn.click();
        return new PatientManagementPage();
    }
}
