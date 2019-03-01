package com.Dolibarr.Projects_WebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vTiger.UtilLibrary.SuperTestScript;

public class CreateProjectPage6
{
	@FindBy(name="title")
	private WebElement labelTextField;
	
	@FindBy(id="socid")
	private WebElement dropDown;
	
	@FindBy(className="button")
	private WebElement createButton;
	
	public CreateProjectPage6()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void enterLabelName(String labelName)
	{
		labelTextField.sendKeys(labelName);
	}
	
	public void clickOndropDown(String thirdPartyName)
	{
		Select s1 = new Select(dropDown);
		s1.selectByVisibleText(thirdPartyName);
		
	}
	
	public void clickOnCreateButton()
	{
		createButton.click();
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
