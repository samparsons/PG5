package com.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomepageTest {
	public static void main(String[] args) {
		// step 1: formulate a test url
				String siteUrl = "https://www.amazon.com/";
				String driverPath = "drivers/chromedriver";
				
				
				// step 2: set a selenuim system properties
				System.setProperty("webdriver.chrome.driver", driverPath);
				
				// step 3: instantiate selenium web-driver
				WebDriver driver = new ChromeDriver();
				
				// step 4: launch browser
				driver.get(siteUrl);
				
				// step 5: evaluate test
				String expectedTitle = "Amazon.com. Spend less. Smile more.";
				String actualTitle = driver.getTitle();
				
				if(expectedTitle.equals(actualTitle)) {
					System.out.println("Test Pass");
				} else {
					System.out.println("Test Fail, title does not match. Title should match: "+expectedTitle+", however the title on the page is: "+actualTitle);
				}
				System.out.println("expectedTitle: "+expectedTitle);
				System.out.println("actualTitle: "+actualTitle);
				// step 6: close driver
				driver.close();

	}

}
