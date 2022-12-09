package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashBoradPage;
import com.pages.LoginPage;

public class LoginTest {  
	 WebDriver driver=null;
	LoginPage lp=null;
	DashBoradPage dp=null;
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");	
		lp = new LoginPage(driver);
		
	}
	@Test
	public void test01() {
		dp = lp.validLogin();
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
	}
	@Test
	public void test02(){
	String actHeading=dp.getHeader();
	Assert.assertEquals(actHeading, "Java By Kiran");

	}
	
	@Test
	public void test03()
	{
		dp.clickuser();
	
	}
	
	
	
	
	
	
	

}
