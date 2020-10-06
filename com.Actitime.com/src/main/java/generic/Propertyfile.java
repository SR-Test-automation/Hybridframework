package generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class Propertyfile implements AutoConstant{
	
	public static String getdatapropertyfile(String keyvalue)
	{
		String s=null;
		Properties p=new Properties();
		try {
		p.load(new FileInputStream(propertyfilepath));
		s=p.getProperty(keyvalue);
		}
		catch(Exception e)
		{
			Reporter.log("data is not freteched",true);
		}
		return s;
	
		
	}
}
