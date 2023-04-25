package Maven_project;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import GenericUtility.Baseclass;

public class Testcase02 extends Baseclass {
	
	@Test
	public void executeTask() {
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();	
		
	}
	

}
