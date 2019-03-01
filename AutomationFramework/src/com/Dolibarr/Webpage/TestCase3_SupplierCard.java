package com.Dolibarr.Webpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class TestCase3_SupplierCard 
{
@FindBy(linkText="Add invoice or credit note")
private WebElement addInvoiceButton;

public TestCase3_SupplierCard()
{
	PageFactory.initElements(SuperTestScript.driver, this);
}
	public void clickOnAddInvoiceButton()
	{
		addInvoiceButton.click();
	}
}
