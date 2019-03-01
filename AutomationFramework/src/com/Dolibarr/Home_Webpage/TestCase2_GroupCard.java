package com.Dolibarr.Home_Webpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class TestCase2_GroupCard
{
	@FindBy(name="nom")
	private WebElement groupNameTextField;
	
	@FindBy(xpath="//input[@value='Create group']")
    private WebElement createGroup;
    
	
	public TestCase2_GroupCard() 
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
		
		 public void enterGroupName(String gName)
		    {
			 groupNameTextField.sendKeys(gName);
		    }
		 public void clickOnCreateGroupButton()
		 {
			 createGroup.click();
		 }
    
}

