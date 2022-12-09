package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoradPage {
	
	WebDriver driver=null;
	@FindBy(xpath = "//b[ text()='Java By Kiran']")
    WebElement Heading;
	@FindBy(xpath = "//span[text()='Users']")
	WebElement userBtn;
	
	public DashBoradPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public UserPage clickuser() {
		userBtn.click();
		return new UserPage(driver);
	}
	public String getHeader() {

		return Heading.getText();
		}
	}


