package com.Dolibarr.Thirdparty_WebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class DeleteCustomerPage_5 
{

@FindBy(id="action-delete")
private WebElement deleteCustomerButton;


@FindBy(xpath="//button[@type='button']")
private WebElement yesButton;

public  DeleteCustomerPage_5()
{
	PageFactory.initElements(SuperTestScript.driver, this);
}

public void clickOnDeleteCustomer()
{
	deleteCustomerButton.click();
	
}
public void clickOnyesButton()
{
	yesButton.click();
}




	
}
