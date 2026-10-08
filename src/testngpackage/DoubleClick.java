package testngpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClick {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void doubleClick()
	{
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));

		Actions act=new Actions(driver);
		act.doubleClick(doubleclick).perform();
		Alert alert=driver.switchTo().alert();
		String alerttext=alert.getText();
		System.out.println("Alerttext="+alerttext);
		alert.accept();
		
        act.contextClick(rightclick).perform();
        driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
        driver.switchTo().alert().accept();


	}

}
