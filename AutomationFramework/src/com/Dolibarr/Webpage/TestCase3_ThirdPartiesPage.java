package com.Dolibarr.Webpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class TestCase3_ThirdPartiesPage
{

	@FindBy(linkText="List of suppliers")
	private WebElement listOfSuppliers;
	
	public TestCase3_ThirdPartiesPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
public void clickOnListOfSuppliersButton()
{
	listOfSuppliers.click();
}
}



