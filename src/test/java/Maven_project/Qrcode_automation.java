package Maven_project;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;
import java.io.IOException;

import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;

public class Qrcode_automation {
	
	@Test
	public void testqrcode() throws IOException, NotFoundException  {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium folder\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.qrcodechimp.com/");
		
		String qrcoodeurl= driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println(qrcoodeurl);
		
		URL urlofimage=new URL(qrcoodeurl);
		BufferedImage B=ImageIO.read(urlofimage);
		
	
		
		
		
		
		
		
	}

}
