package testngpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QuestionRishiHerbal {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void rishiHerbal() throws Exception
	{
		Thread.sleep(2000);
		String actualTitle=driver.getTitle();
		System.out.println("Title="+actualTitle);
		Assert.assertEquals(actualTitle, "Rishi Herbal India");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links="+links.size());
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//WebElement sort=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form//select")));
		WebElement sort=driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div[2]/div[3]/div/div[2]/form/select"));
		Select select=new Select(sort);
		select.selectByVisibleText("Most Viewed");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/div/button/span")).click();
		
		driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[3]/div[1]/div/div/button/i")).click();
		
		driver.findElement(By.xpath("//*[@id=\"cart-dropdown\"]/div/div/div[2]/a")).click();
		
		
		
		
	}


}
