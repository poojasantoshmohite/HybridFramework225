package com.Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtils {
	public static String readProperty(String key) throws Exception {
	String path=System.getProperty("user.dir")+"/src/main/resources/config.properties";
	Properties pro = new Properties();
	FileInputStream fis = new FileInputStream(path);
	pro.load(fis);
	return pro.getProperty(key);
	
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(readProperty("browser"));
	}
		
	}
	