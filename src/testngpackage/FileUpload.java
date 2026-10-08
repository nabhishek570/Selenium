package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
	}

	@Test
	public void upload()
	{
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("\"C:\\Users\\Anagha Anilkumar\\Desktop\\java 1\\Firstprogram.class\"");
		driver.findElement(By.xpath("//*[@id=\"emailwindow\"]/form/ul/li/center/span")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
	}
}
