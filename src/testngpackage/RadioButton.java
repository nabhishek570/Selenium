package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButton {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void radio()
	{
		boolean r=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[9]/div/label[1]/input")).isSelected();
		if(r)
		{
			System.out.println("Element is selected");
		}
		else
		{
			System.out.println("Element is not selected");
		}
	}
}

