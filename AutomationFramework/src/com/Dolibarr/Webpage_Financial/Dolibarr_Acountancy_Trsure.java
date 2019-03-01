package com.Dolibarr.Webpage_Financial;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class Dolibarr_Acountancy_Trsure
{
	@FindBy(xpath="//a[@href='/dolibarr-3.1.1/htdocs/fourn/facture/fiche.php?action=create']")
	private WebElement newInvoiceSupplier;
	
	public Dolibarr_Acountancy_Trsure()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}

	public void clickOnSupplierNewInvoice()
	{
		newInvoiceSupplier.click();
	}
}
