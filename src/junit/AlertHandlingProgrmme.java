package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingProgrmme {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
	}
	
	@Test
	public void AlterHandlingpgm()
	{
		driver.findElement(By.xpath("//a[@class=\"analystic\"]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		a.accept();
		driver.findElement(By.xpath("//a[@class=\"analystic\"]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]")).click();
		Alert b=driver.switchTo().alert();
		String alerttext1=b.getText();
		b.accept();
		driver.findElement(By.xpath("//a[@class=\"analystic\"]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).sendKeys("Automation Testing user",Keys.ENTER);
		
		
	}
}
