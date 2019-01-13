package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class rowncolumninput {
	public static void main(String[] args) throws BiffException, IOException 
	{
		String str;
		System.out.println("Enter the value of row and column");
		Scanner s= new Scanner(System.in);
		int r= s.nextInt();
		int c= s.nextInt();
		rowncolumninput rc= new rowncolumninput();
		str=rc.rowcolumn(r,c);
		System.out.println("Value is"+" "+str);
		
	}

	 String rowcolumn(int r, int c) throws BiffException, IOException {
		 File f = new File ("C:\\Users\\Abhishek\\Desktop\\Excel_Handling.xls");
			Workbook wb = Workbook.getWorkbook(f);
			Sheet ws= wb.getSheet(0);
	
			Cell c1= ws.getCell(c,r);
		String st=(c1.getContents());
			
			
		return st;
	}

}
