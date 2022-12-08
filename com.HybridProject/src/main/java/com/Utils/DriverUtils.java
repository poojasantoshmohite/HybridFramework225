package com.Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.Baseclass;

public class DriverUtils extends Baseclass{
	
	public static String getScreenshot(String name) throws Exception {
		
		TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
		File src =  takesScreenshot.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"Screenshots"+name+".jpg";
	    File dest = new File(path);
	    FileUtils.copyFile(src, dest);
		
		return path;
		
	}

}
