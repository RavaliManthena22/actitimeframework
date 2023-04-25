

package Maven_project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.Baseclass;

@Listeners(Data_utility.Listener_class.class)
public class Testcase01 extends Baseclass {
		@Test
		public void executeuser() {
			driver.findElement(By.xpath("//div[@id='container_users']")).click();
			//Assert.fail();
		
		 
	}
	}

 