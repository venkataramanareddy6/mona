package wbdriverpack;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElement 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No of links : " + links.size());
		
		System.out.println("The link are: ");
		
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
	}

}
