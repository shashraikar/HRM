package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel 
{
	public static String getCellValue(String PATH,String Sheet,int row,int cell)
	{
		String v = "";
		try
		{
			FileInputStream FIS=new FileInputStream(PATH);
			Workbook wb=WorkbookFactory.create(FIS);
			Cell c = wb.getSheet(Sheet).getRow(row).getCell(cell);
			v=c.toString();
		}
		catch(Exception e)
		{
			Reporter.log("Path is invalid",true);
		}
		return v;
	}

}
