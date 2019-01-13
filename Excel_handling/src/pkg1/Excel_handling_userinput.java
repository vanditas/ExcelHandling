package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.*;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;



public class Excel_handling_userinput {
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException 
	{
		File f = new File("C:\\Users\\Abhishek\\Desktop\\Excel_Handling_userinput.xls");
		WritableWorkbook wb = Workbook.createWorkbook(f);
		WritableSheet ws=wb.createSheet("Data",0);
		System.out.println("Enter the text");
		Scanner s=new Scanner(System.in);
		String data;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				data=s.nextLine();
				Label l = new Label(j,i,data);
				ws.addCell(l);
				
			}
		}
	wb.write();
	wb.close();
	
	}

}
