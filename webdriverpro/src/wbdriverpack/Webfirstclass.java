package wbdriverpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webfirstclass 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "‪D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
	}

}
