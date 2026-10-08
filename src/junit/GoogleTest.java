package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
 
	ChromeDriver driver;
	
	@BeforeEach
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void search()
	{
		driver.findElement(By.name("q")).sendKeys("Cristiano Ronaldo", Keys.ENTER);
	}
	
}
