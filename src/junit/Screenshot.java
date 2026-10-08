package junit;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	ChromeDriver driver;
	
	@BeforeEach
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anagha%20Anilkumar/Documents/html.html");
	}
	
	@Test
	public void screenshot() throws Exception
	{
		File A=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(A, new File("./Screenshot/pagescreenshot.png"));
		
		WebElement button=driver.findElement(By.xpath("//input[@value=\"Display alert box\"]"));
		File buttonscrshot=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(buttonscrshot, new File("./SCreenshot/button.png"));
	}
}
