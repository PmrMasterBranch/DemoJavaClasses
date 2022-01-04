package DemoPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
	

	public static String getExcelData(String Sheet, int row, int Cell) {
		// TODO Auto-generated method stub
		String retval=null;
		try {
			
			FileInputStream fis = new FileInputStream("D:\\Java_New\\ExcelData.xlsx");
			Workbook wb =WorkbookFactory.create(fis);
			Sheet s =wb.getSheet(Sheet);
			Row r =s.getRow(row);
			Cell c =r.getCell(Cell);
			retval = c.getStringCellValue();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retval;
		
	}
	
	public int lastRow(String Sheet)
	{
		FileInputStream fis;
		int rowval = 0;
		try {
			fis = new FileInputStream("D:\\Java_New\\ExcelData.xlsx");
			Workbook wb =WorkbookFactory.create(fis);
			Sheet s =wb.getSheet(Sheet);
			rowval = s.getLastRowNum();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowval;
		
		
	}

}
