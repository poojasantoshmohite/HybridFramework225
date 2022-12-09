package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo2 {
	
	@Test
	public void test011()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		System.out.println("Test...2");
	}

}
