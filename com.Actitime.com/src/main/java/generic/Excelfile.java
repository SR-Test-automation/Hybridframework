package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excelfile implements AutoConstant{
	
	public static String getexceldata(String sheetname,int rownum,int cellnum)
	{
		String s=null;
		try {
		FileInputStream f=new FileInputStream(excelfilepath);
		Workbook wb = WorkbookFactory.create(f);
		s=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		}
		catch(Exception e)
		{
		Reporter.log("data from excel not taken",true);	
		}
		return s;
		
		
	}

}
