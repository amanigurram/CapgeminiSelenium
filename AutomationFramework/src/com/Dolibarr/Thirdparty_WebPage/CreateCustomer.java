package com.Dolibarr.Thirdparty_WebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class CreateCustomer 
{
	@FindBy(name="nom")
private WebElement thirdPartyname;

	@FindBy(xpath="//input[@value='Add third party']")
	private WebElement clickOnButton;
	
	public CreateCustomer()
	
	{
		PageFactory.initElements(SuperTestScript.driver, this);

	}
	
	public void enterThirdPartyname(String un)
	{
		thirdPartyname.sendKeys(un);
	}

	public void clickOnCreateButton()
	
	{
		clickOnButton.click();
	}
}
