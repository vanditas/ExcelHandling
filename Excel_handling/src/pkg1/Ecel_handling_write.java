package pkg1;

import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Ecel_handling_write 
{
  public static void main(String[] args) throws IOException, RowsExceededException, WriteException 
  {
	File f = new File ("C:\\Users\\Abhishek\\Desktop\\Excel_Handling1.xls");
	WritableWorkbook wk= Workbook.createWorkbook(f);
	WritableSheet ws= wk.createSheet("Data",0);
	
	for(int i=0; i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			Label l = new Label(j,i,"Vandita");
			ws.addCell(l);
			
		}
	}
	wk.write();
	wk.close();
	}
}
