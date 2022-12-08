package com.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Utils.PropertyUtils;

public class Baseclass {
	public static WebDriver driver=null;
	
	public void initialization() throws Exception {
		String browserName = PropertyUtils.readProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browserName.equals("Firefox")) {
			System.setProperty("Webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(PropertyUtils.readProperty("url"));
	
	
	
		
	}

}
