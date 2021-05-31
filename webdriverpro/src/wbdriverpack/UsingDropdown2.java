package wbdriverpack;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDropdown2
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Category to select: ");
		String cat=sc.nextLine();
		System.out.print("Enter Product to select: ");
		String prod=sc.nextLine();
		boolean isExist=false;
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		WebElement dd=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		List<WebElement> items=s.getOptions();
				
		for(WebElement item : items)		
		{
			String webItem=item.getText();
			if(webItem.equalsIgnoreCase(cat)) {
				isExist=true;
				s.selectByVisibleText(webItem);
				
				driver.findElement(By.id("gh-ac")).sendKeys(prod);
				driver.findElement(By.id("gh-btn")).click();
				break;
			}
		}
		
		if(isExist==false)
		{
			System.out.println("Specified category is not avalilable in the dropdown...");
			//driver.close();
		}
	}

}
