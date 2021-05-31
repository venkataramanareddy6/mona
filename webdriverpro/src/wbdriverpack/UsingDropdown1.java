package wbdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDropdown1 
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		WebElement dd=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		s.selectByIndex(6);
		//s.selectByIndex(625);
		
		driver.findElement(By.id("gh-ac")).sendKeys("nikon");
		driver.findElement(By.id("gh-btn")).click();
		driver.close();

	}

}
