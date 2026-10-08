package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static Object[][] getCellData(String filepath, String sheetname) throws IOException
	{
		//FileInputStream f=new FileInputStream("");
		FileInputStream f=new FileInputStream(filepath); //to read file path
		XSSFWorkbook wb=new XSSFWorkbook(f); //to get excel workbook
		XSSFSheet sh=wb.getSheet(sheetname); //to get excel sheet
		int row=sh.getLastRowNum();
		System.out.println("row count="+row);
		int cell=sh.getRow(0).getLastCellNum();
		System.out.println("column count="+cell);
		Object[][] data=new Object[row][cell];
		DataFormatter formatter=new DataFormatter();
		for(int i=1;i<=row;i++) 
		{
			for(int j=0;j<cell;j++)
			{
				data[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
				System.out.println(data[i-1][j]);
			}
		}
		wb.close();
		f.close();
		return data;
		
	}

}
