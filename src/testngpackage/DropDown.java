package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDown {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void dropDown()
	{
		WebElement day=driver.findElement(By.xpath("//select[contains(@name,\'DOB_Day')]"));
		Select dayelement=new Select(day);
		dayelement.selectByValue("31");
		
		WebElement month=driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select monthelement=new Select(month);
		monthelement.selectByVisibleText("MAY");
		
		WebElement year=driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));	
		Select yearelement=new Select(year);
		yearelement.selectByIndex(03);
		
		
	}
}
