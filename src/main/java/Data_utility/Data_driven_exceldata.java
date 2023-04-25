package Data_utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Data_driven_exceldata {
	public String getdatafromexcel(String sheetName,int row,int cell) throws Exception {
		FileInputStream fis=new FileInputStream("E:\\Selenium\\multiple_exceldata.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
       Sheet sh = wb.getSheet("Sheet1");
       DataFormatter df=new DataFormatter();
	   
	  
	    String data= df.formatCellValue(sh.getRow(row).getCell(cell));
	 //  System.out.println(data);
	    return data;
	    
}
}
