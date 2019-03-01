package com.Dolibarr.Thirdparty_WebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class SupplierCreatePage
{
	@FindBy(name="nom")
	private WebElement thirdPartyNameTextField;
	
	@FindBy(className="button")
	private WebElement addThirdPartyButton;
	
	public SupplierCreatePage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void enterThirdPartyName(String ThirdPartyName)
	{
		thirdPartyNameTextField.sendKeys(ThirdPartyName);
	}
	public void clickOnAddThirdPartyButton()
	{
		addThirdPartyButton.click();
		
	}

}
