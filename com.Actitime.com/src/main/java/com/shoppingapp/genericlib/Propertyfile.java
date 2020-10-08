package com.shoppingapp.genericlib;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class Propertyfile implements AutoConstant{
	
	public static String getdatapropertyfile(String keyvalue)
	{
		
		Properties p=new Properties();
		try {
		p.load(new FileInputStream(propertyfilepath));
	    p.getProperty(keyvalue);
		}
		catch(Exception e)
		{
			Reporter.log("data is not freteched",true);
		}
		return keyvalue;

	
		
	}
}
