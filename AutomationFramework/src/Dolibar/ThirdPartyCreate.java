package Dolibar;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vTiger.UtilLibrary.ExcelOperation;
import com.vTiger.UtilLibrary.SuperTestScript;

public class ThirdPartyCreate extends SuperTestScript
{
@Test
public void testThirdPartyCreate()
{
	String un=ExcelOperation.readData("dolibarr", 1, 1);
	String pw=ExcelOperation.readData("dolibarr", 1, 2);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.id("password")).sendKeys(pw);
	driver.findElement(By.className("button")).click();
	driver.findElement(By.className("vsmenu")).click();
}
}
