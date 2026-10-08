package testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePick {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void datePick()
	{
		driver.get("https://demo.automationtesting.in/Datepicker.html#google_vignette");
		driver.findElement(By.id("datepicker1")).click();
		while(true)
		{
			String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			String expectedmonth="December 2026";
			
			if(month.equals(expectedmonth))
			{
				System.out.println("Month selected");
			    break;
			}
			else 
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
			}
		}
		List<WebElement> datelist=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		for(WebElement dateelement:datelist)
		{
			String date=dateelement.getText();
			if(date.equals("25"))
			{
				dateelement.click();
				break;
			}
		}
	}
	

}
