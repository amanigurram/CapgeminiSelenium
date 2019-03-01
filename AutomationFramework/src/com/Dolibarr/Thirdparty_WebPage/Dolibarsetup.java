package com.Dolibarr.Thirdparty_WebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class Dolibarsetup
{
	
@FindBy(linkText="Third parties")	
private WebElement partyButton;

@FindBy(id="mainmenua_accountancy")
private WebElement financialModuleButton;

public Dolibarsetup()
{

	PageFactory.initElements(SuperTestScript.driver, this);

}

public void clickparty()
{
	partyButton.click();
}
public void clickOnFinancialButton()
{
	financialModuleButton.click();
}
	
}
 