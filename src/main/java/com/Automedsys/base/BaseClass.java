/**
 * 
 */
package com.Automedsys.base;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Automedsys.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * Author: Ayodeji Date: 2023
 */


public class BaseClass {
	protected WebDriver driver;
	public static Properties props = new Properties();
	public static FileReader fr;
	LoginPage loginpage;
	// Default constructor
//	    public BaseClass() {
//	        // Empty constructor is needed to tackle the implicit super constructor error
//	    }

//	    public BaseClass(WebDriver driver) {
//	        this.driver = driver; // A constructor of  base class to get it parametarize the driver
//	    } 

	@BeforeTest
	public void setup() throws IOException {

		if (driver == null) {
			 fr = new FileReader(System.getProperty("user.dir") + "\\Configuration\\Config.properties");
			props.load(fr); // This is to read the files from config.properties file
		}

		 String browser = props.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(props.getProperty("testUrl"));
		System.out.println("This is " + browser);
		driver.manage().window().maximize();
//		initializeLoginPage();
	}

//	public void initializeLoginPage() {
//		loginpage = new LoginPage(driver); // Initialize the LoginPage object
//	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Tear down was successful");
	}

}
