package pkg1;

import java.io.File;
import java.io.IOException;


import jxl.*;
import jxl.read.biff.BiffException;

public class excel_handling {
	
public static void main(String[] args) throws BiffException, IOException 
{
	File f = new File("C:\\Users\\Abhishek\\Desktop\\Excel_Handling.xls");
	Workbook wk = Workbook.getWorkbook(f);
	Sheet ws = wk.getSheet(0);
	int r = ws.getRows();
	int c= ws.getColumns();
	
	for(int i=0; i<r;i++)
	{
		for (int j=0; j<c;j++)
		{
			Cell c1=ws.getCell(j,i);
			System.out.println(c1.getContents());
		}
	}
	
}
}
