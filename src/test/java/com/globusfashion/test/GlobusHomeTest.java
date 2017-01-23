/**
 * 	
 */
package com.globusfashion.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Hardik
 *
 */

public class GlobusHomeTest {

	WebDriver driver;
	public static String baseURL = "http://globusstores.incomenterprise.com/";

	@Test
	public void testHome() {
		try {
			System.setProperty("webdriver.chrome.driver", "E:/Hardik/Automation/GlobusFashion/Jars/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(baseURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			String exceptionMessage = e.getMessage();
			System.out.println("Exception - " + exceptionMessage);
		}
	}
}