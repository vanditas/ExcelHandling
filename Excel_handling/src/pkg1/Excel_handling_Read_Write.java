package pkg1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel_handling_Read_Write {
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException 
	{
		File f = new File("C:\\Users\\Abhishek\\Desktop\\Excel_Handling.xls");
		Workbook wb= Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		int r= ws.getRows();
		int c = ws.getColumns();
		
		File f1 = new File ("C:\\Users\\Abhishek\\Desktop\\Excel_Handling2.xls");
		WritableWorkbook wk= Workbook.createWorkbook(f1);
		WritableSheet ws1= wk.createSheet("Data",0);
		
		for (int i=0; i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				Cell c1= ws.getCell(j,i);
				Label l = new Label(j,i,c1.getContents());
				ws1.addCell(l);
			}

		}
		wk.write();
		wk.close();
	}

}
