package GenericUtility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_new {
	
	@FindBy(xpath=("//div[@id='container_tasks']"))
	private WebElement task;
	
	@FindBy(xpath = "//div[@class='addNewButton']")
	private WebElement addnew;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newcustomer;
	
	
	public Add_new(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}

	public WebElement getTask() {
		return task;
	}

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}
	
	public void operation() {
		task.click();
		addnew.click();
		newcustomer.click();
		
		
	}

}