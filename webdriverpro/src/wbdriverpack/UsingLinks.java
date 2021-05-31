package wbdriverpack;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinks 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Link to select: ");
		String linkToSelect=sc.nextLine();
		boolean isExist=false;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link : links)
		{
			if(link.getText().equalsIgnoreCase(linkToSelect))
			{
				isExist=true;
				link.click();
				break;
			}
		}
		if (isExist==false)
		{
			System.out.println("Specified link is not available");
			driver.close();
		}
	}

}
