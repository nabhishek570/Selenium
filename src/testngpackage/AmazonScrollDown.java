package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonScrollDown {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@Test
	public void scrollDown()
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		By sellLink=By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[1]/a");
		WebElement link=wait.until(ExpectedConditions.presenceOfElementLocated(sellLink));
		js.executeScript("arguments[0].scrollIntoView({block:'center'});",link);
		wait.until(ExpectedConditions.elementToBeClickable(sellLink)).click();
		}
}
