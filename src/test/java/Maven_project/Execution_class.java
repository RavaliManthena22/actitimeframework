package Maven_project;

import org.testng.annotations.Test;

import GenericUtility.Add_new;
import GenericUtility.Baseclass;
import GenericUtility.Create_customer;
import GenericUtility.Excel_data_driven;

public class Execution_class extends Baseclass {

	
	@Test
	public void Execution() throws Exception
	{
		Add_new a=new Add_new(driver);
		a.operation();
		Create_customer c=new Create_customer(driver);
		Excel_data_driven e=new Excel_data_driven();
		
		c.performcreate(e.GetData("Sheet1",0,0),e.GetData("Sheet1", 0, 1));
	}
	@Test
	public void demo()
	{
		System.out.println("edfgb");
	}
}
