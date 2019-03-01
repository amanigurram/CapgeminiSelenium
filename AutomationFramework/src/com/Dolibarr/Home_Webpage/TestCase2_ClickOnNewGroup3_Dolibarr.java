package com.Dolibarr.Home_Webpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class TestCase2_ClickOnNewGroup3_Dolibarr
{
	@FindBy(linkText="New group")
	private WebElement newGroup;
	
	public TestCase2_ClickOnNewGroup3_Dolibarr()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickOnNewGroup()
	{
		newGroup.click();
	}

}
