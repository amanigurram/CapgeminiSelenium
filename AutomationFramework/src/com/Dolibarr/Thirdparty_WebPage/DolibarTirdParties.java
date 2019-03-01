package com.Dolibarr.Thirdparty_WebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class DolibarTirdParties 
{
	@FindBy(linkText="New customer")
	private WebElement newCustomer;
	
	@FindBy(linkText="List of customers")
	private WebElement listOfCustomer;
	
	@FindBy(linkText="password")
	private WebElement newSupplierButton;
		
	public DolibarTirdParties()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}


	public void clickOnNewCustomerButton()
	{
		newCustomer.click();
	}
public void clickOnListOfCustomer()
{
	listOfCustomer.click();
}
public void clickOnNewSupplierButton()
{
	newSupplierButton.click();
}

}







