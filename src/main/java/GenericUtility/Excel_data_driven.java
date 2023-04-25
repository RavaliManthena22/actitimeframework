package GenericUtility;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_data_driven {
public String GetData(String SheetName,int RowNo,int CellNo) throws Exception{
	FileInputStream fis=new FileInputStream("E:\\Selenium\\multiple_exceldata.xlsx");
	
	Workbook wb=WorkbookFactory.create(fis);
    Sheet sh=wb.getSheet(SheetName);
    DataFormatter d=new DataFormatter();
    String value= d.formatCellValue(sh.getRow(RowNo).getCell(CellNo));
    return value;

}
}
