package com.Dolibarr.Home_Webpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class TestCase2_ShowGroupName 
{
	@FindBy(xpath="//td[text()='tamilnadu']")
	private WebElement groupName;
	
	public TestCase2_ShowGroupName()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
public String getGroupName() 
{
	 String ggname = groupName.getText();
	 return ggname;
}
	
}
