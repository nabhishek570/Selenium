package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Anagha%20Anilkumar/Documents/html.html");
	}
	
	@Test
	public void alertHandling()
	{
		driver.findElement(By.xpath("//input[@value=\"Display alert box\"]")).click();
		Alert a=driver.switchTo().alert();
		String alertText=a.getText();
		a.accept();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Nambradath");
		driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
	}

	private void switchto() {
		// TODO Auto-generated method stub
		
	}
	

}
