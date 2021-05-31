package wbdriverpack;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingpopUps 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com");
		
		String mainTitle=driver.getTitle();
		String mainWindow=driver.getWindowHandle();
		
		Set<String> winIds=driver.getWindowHandles();
		for(String id : winIds)
		{
			driver.switchTo().window(id);
			
			if (!driver.getTitle().equals(mainTitle))
			{
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
