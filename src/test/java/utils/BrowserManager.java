package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class BrowserManager {
	
	public static WebDriver getDriver(String browserType, String url)
	{
		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
		WebDriver driver = null;
		if(browserType.equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("firefox"))
		{
			//call firefox driver
		}
		else if(browserType.equalsIgnoreCase("IE 11"))
		{
			//call IE 11 driver
		}
		else
		{
			Assert.assertTrue("No browser sent", false);
		
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}
	
	

}
