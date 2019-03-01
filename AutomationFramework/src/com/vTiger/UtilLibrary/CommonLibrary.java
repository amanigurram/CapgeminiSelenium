package com.vTiger.UtilLibrary;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonLibrary 
{
public static void selectDropdownByIndex(WebElement dropdownAddress, int indexNumber)
{
 	Select s1= new Select(dropdownAddress);
 	s1.selectByIndex(indexNumber);
}

public static void selectDropdownByVisibleText(WebElement dropdownAddress, String visibleText)
{
	Select s1 = new Select(dropdownAddress);
	s1.selectByVisibleText(visibleText);
}
public static void selectDropdownByValue(WebElement dropdownAddress, String value)
{
	Select s1 = new Select(dropdownAddress);
	s1.selectByVisibleText(value);
}
public static void movingTheCursortoDesiredLocation(WebElement elementLocation)
{
	Actions a1 = new Actions(SuperTestScript.driver);
	a1.moveToElement(elementLocation).build().perform();
}
public static void clickOnOkButtonOnAlertPopup()
{
	SuperTestScript.driver.switchTo().alert().accept();
}
public static void clickOnCncelButtonOnAlertPopup()
{
	SuperTestScript.driver.switchTo().alert().accept();
}
public static void getTextFromPopup()
{
	SuperTestScript.driver.switchTo().alert().getText();
}
public static void takeScreenshot(String TestScriptMethodName)
{
	EventFiringWebDriver efw = new EventFiringWebDriver(SuperTestScript.driver);
	  File source = efw.getScreenshotAs(OutputType.FILE);
	  File target = new File("C:\\Users\\sss\\eclipse-workspace\\AutomationFramework\\src\\resources\\failedTestscriptScreenshots//"+ TestScriptMethodName+".jpg");
	 try
	  {
		 FileUtils.moveFile(source, target);
	 }
		catch (Exception e) 
	  {
			// TODO: handle exception
		}  

	  
	 }










}
