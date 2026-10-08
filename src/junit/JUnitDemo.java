package junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitDemo {
	
	static ChromeDriver driver;

	
	@BeforeAll
	public static void openUp()
	{
		 driver = new ChromeDriver();

	}
	
	
	
	@BeforeEach
	public void setUp() {
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void titleVerification()
	{
		String actualTitle= driver.getTitle();
		String expectedTitle="Google";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	
	@Test
	public void pageSource()
	{
		String source=driver.getPageSource();
		
		if(source.contains("Gmail"))
		{
			System.out.println("Title is Present");
		}
		else {
			System.out.println("Title is Not Present");
		}
	}
	
	@AfterEach
	public void tearDown() {
    System.out.println("Generate Report");
	}
	
	@AfterAll
	public static void CloseDown()
	{
		driver.quit();
	}
}
