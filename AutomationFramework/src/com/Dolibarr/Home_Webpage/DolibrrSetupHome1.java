package com.Dolibarr.Home_Webpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class DolibrrSetupHome1 
{
	@FindBy(linkText="Users & Groups")
	private WebElement userAndGroups;
	
	@FindBy(linkText="Projects")
	private WebElement projectsButton;

	
	public DolibrrSetupHome1()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickOnUserAndGroupsButton()
	
	{
		userAndGroups.click();
	}
	
	public void clickOnProjectsButton()
	{
		projectsButton.click();
	}
	

}
