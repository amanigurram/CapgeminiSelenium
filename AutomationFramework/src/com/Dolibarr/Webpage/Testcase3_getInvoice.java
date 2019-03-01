package com.Dolibarr.Webpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class Testcase3_getInvoice 
{

	@FindBy(linkText="haritha")
	private WebElement invoiceName;
	
	public Testcase3_getInvoice()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public String getSupplierName()
	{
	String supName=	invoiceName.getText();
	return supName;
		
	}
}

