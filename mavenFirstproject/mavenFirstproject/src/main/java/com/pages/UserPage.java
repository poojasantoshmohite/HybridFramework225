package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class UserPage {
	WebDriver driver=null;
	@FindBy(xpath = "//span[text()='Users']")
	WebElement userBtn;


public UserPage(WebDriver driver) {
	this.driver=driver;
}
public void getHeader()
{
	 userBtn.click();
	 
}
}