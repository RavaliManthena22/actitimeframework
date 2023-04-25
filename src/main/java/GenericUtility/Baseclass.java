package GenericUtility;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Data_utility.Data_driven_exceldata;
import Data_utility.Keyword_driven_propertiesfile;

public class Baseclass {
	
	Keyword_driven_propertiesfile k=new Keyword_driven_propertiesfile();
//	public Data_driven_exceldata d=new Data_driven_exceldata();
	
//	Random R=new Random();
//	int num=R.nextInt();
//	public String s="Ravali."+num;
//	
 public static WebDriver driver;

// public static WebDriver sdriver;
	@Parameters("browser")
	@BeforeClass
	public void launchbrowser(String browser) throws Exception {
		
		//String browser=k.getdata("browser");
		if(browser.equals("Chrome"))
		{
		ChromeOptions d=new ChromeOptions();
		d.addArguments("--remote-allow-origins=*");
	   
		driver=new ChromeDriver(d);
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		//sdriver=driver;
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(k.getdata("url"));
		
	}
	
	@BeforeMethod
	public void login() throws Exception {
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(k.getdata("UserName"));
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(k.getdata("PassWord"));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();		
		
	}

	@AfterMethod
	public void logout() {	
	
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	

}


