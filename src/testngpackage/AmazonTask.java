package testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTask {

	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void amazon() throws Exception
	{
		Thread.sleep(2000);
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Phones",Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]")).click();
		Set<String>allwindows=driver.getWindowHandles();
		for(String window:allwindows)
		{
			if(!window.equals(parentwindow)) {
				driver.switchTo().window(window);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[5]/div[1]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[17]")).click();

			}
		}
		System.out.println("Phone added Successfully");
		
	}
	
}
