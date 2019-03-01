package com.Dolibarr.Home_Webpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class DoilbarrHome2
{

	@FindBy(linkText="New user")
	private WebElement newUser;
	
	public DoilbarrHome2()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickOnNewUSer()
	{
		newUser.click();
	}
}
