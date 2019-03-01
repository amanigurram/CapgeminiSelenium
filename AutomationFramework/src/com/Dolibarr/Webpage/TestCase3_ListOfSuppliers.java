package com.Dolibarr.Webpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class TestCase3_ListOfSuppliers
{

	@FindBy(linkText="haritha")
	private WebElement supplierName;
	
	public TestCase3_ListOfSuppliers()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void clickOnSupplierName()
	{
		supplierName.click();
	}
}
