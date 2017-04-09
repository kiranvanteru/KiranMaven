package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

public class Exceldata {
	public static String[][] GetExcelData(String path, int SheetName){
		File filepath=null;
		FileInputStream fis=null;
		Workbook wb=null;
		Sheet s=null;
		String [][] TestData=null;
		
		try {
			filepath=new File(path);
			fis=new FileInputStream(filepath);
			wb=Workbook.getWorkbook(fis);
			s=wb.getSheet(SheetName);
			
			int rows=s.getRows();
			int column=s.getColumns();
			
			TestData=new String[rows-1][column];
			
			for (int i=1;i<rows;i++){
				for (int j=0; j<column;j++){
					TestData[i-1][j]=(s.getCell(j, i)).getContents();;
					//System.out.println("data is "+TestData);
				}
			}
			
		} catch (Exception e) {
			System.out.println("exception is "+e.getMessage());
		}
		
		return TestData;
	}
	
		public static void main(String[] args){
		Object[][] obj = GetExcelData("D:\\TestData1.xls", 0);
		
		for(int i=0; i<obj.length; i++){
			for(int j=0; j<obj[i].length;j++){
				System.out.println(obj[i][j]);
			}
			
		}
		
		
			
		
		
	}
}