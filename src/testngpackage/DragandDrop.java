package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://seleniumbase.io/other/drag_and_drop");
		driver.manage().window().maximize();	
	}
	
	@Test
	public void dragnDrop()
	{
		Actions act= new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"div1\"]"));
		act.dragAndDrop(source, drop).perform();
		
	}
	

}
