package com.Dolibarr.Financial_Scripts;

import org.testng.annotations.Test;

import com.Dolibarr.Thirdparty_WebPage.Dolibarsetup;
import com.Dolibarr.Webpage.VTigerLoginPage;
import com.Dolibarr.Webpage_Financial.Dolibarr_Acountancy_Trsure;
import com.Dolibarr.Webpage_Financial.InvoiceCreationPage;
import com.vTiger.UtilLibrary.ExcelOperation;
import com.vTiger.UtilLibrary.SuperTestScript;

public class AddInvoice_InFinance_DB_06 extends SuperTestScript
{
@Test
public void testAddInvoice_InFinance_DB_06()
{
	String username =ExcelOperation.readData("dolibarr", 1, 1);
	String password =ExcelOperation.readData("dolibarr", 1, 2);
	String  supplierRefName  =ExcelOperation.readData("dolibarr",9 , 0);
	String supplierName= ExcelOperation.readData("dolibarr",9 ,1 );
	ExcelOperation.writeData("dolibarr", 9, 2, "amani");
	ExcelOperation.writeData("dolibarr", 9, 3, "amani1");
	ExcelOperation.writeData("dolibarr", 9, 4, "amani2");
	
	VTigerLoginPage lp = new VTigerLoginPage();
	Dolibarsetup ds = new Dolibarsetup();
	Dolibarr_Acountancy_Trsure dat = new Dolibarr_Acountancy_Trsure();
	InvoiceCreationPage icp = new InvoiceCreationPage();
	
	lp.enterUserName(username);
	lp.enterPassword(password);
	lp.clickOnLoginButton();
	ds.clickOnFinancialButton();
	dat.clickOnSupplierNewInvoice();
	icp.clickOnDropDown(supplierName);
	icp.enterSupplierRefName(supplierRefName);
	icp.clickOnInvoiceDateButton();
	icp.clickOnDesiredDateButton();
	icp.clickOnCreateraftBttonforSupplierInvoice();
	lp.clickOnLogoutButton();



	
	
}
}
