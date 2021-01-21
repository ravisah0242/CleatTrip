package com.cleartrip1.generics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty(chrome_key, chrome_value);
		//ChromeOptions option=new ChromeOptions();
		//driver=new ChromeDriver(option);
		//option.addArguments("--disable-notifications");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	@BeforeMethod
	public void closeBrowser()
	{
		
			//driver.quit();
		
	}

}
