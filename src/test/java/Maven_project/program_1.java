package Maven_project;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class program_1 {
	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium folder\\geckodriver.exe");
		// String p=System.getProperty("user.dir");
		// System.out.println(p);
		
	 WebDriverManager.firefoxdriver().setup();
		 
		 
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
	}

}
