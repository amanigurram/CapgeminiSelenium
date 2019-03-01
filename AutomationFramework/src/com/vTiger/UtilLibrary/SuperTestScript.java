package com.vTiger.UtilLibrary;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(FrameWorkListener.class)
public class SuperTestScript 
{
	public static WebDriver driver;
	
	@BeforeTest
	public void preConfig()
	{
		String browser = ExcelOperation.readData("preconfig", 1, 0);
		String url = ExcelOperation.readData("preconfig", 1, 1);
		if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",".\\src\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",".\\src\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.out.println("Invalid Browser ");
		}
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@AfterTest
	public void postConfig()
	{
		driver.close();
	}
	
}
