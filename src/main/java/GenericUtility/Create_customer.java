package GenericUtility;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_customer {
	
	@FindBy(xpath=("(//input[@type='text'])[68]"))
	private WebElement productlinename;
	
	@FindBy(xpath = "(//textarea[@class='textarea'])[9]")
	private WebElement description;
	
	@FindBy(xpath = "(//div[@class='components_button_label'])[17]")
	private WebElement createcustomer;
	
	public Create_customer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}


	public WebElement getProductlinename() {
		return productlinename;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getCreatecustomer() {
		return createcustomer;
	}
	
	public void performcreate(String productName, String Desc) throws Exception {
	
	
		productlinename.sendKeys(productName);
		description.sendKeys(Desc);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		createcustomer.click();
	}
	

}
