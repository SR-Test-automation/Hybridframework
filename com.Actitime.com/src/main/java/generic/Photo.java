package generic;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Photo {
	public static String getphoto(WebDriver driver,String path,String tcname)
	{
		Date d=new Date();
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+d.toString().replace(":","-")+tcname+".png");
		try {
		FileUtils.copyFile(src, dest);
		}
		catch(Exception e)
		{
			Reporter.log("photo not taken",true);
		}
		return tcname;
		
	}

}
