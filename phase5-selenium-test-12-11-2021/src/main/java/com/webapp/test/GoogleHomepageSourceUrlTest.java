package com.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomepageSourceUrlTest {

	public static void main(String[] args) {
		// step 1: formulate a test url
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/chromedriver";
		
		
		// step 2: set a selenuim system properties
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		// step 3: instantiate selenium web-driver
		WebDriver driver = new ChromeDriver();
		
		// step 4: launch browser
		driver.get(siteUrl);
		
		// step 5: evaluate test
		
		
		String expectedTitle = "Googleeeeee";
		String actualTitle = driver.getTitle();
		
		if(siteUrl.equals(driver.getCurrentUrl())) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		System.out.println("siteUrl: "+siteUrl);
		System.out.println("driver.getCurrentUrl(): "+driver.getCurrentUrl());
		// step 6: close driver
		driver.close();

	}

}
