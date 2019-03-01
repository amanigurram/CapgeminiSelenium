package com.Dolibarr.ThirdParty_Scripts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Dolibarr.Thirdparty_WebPage.DolibarTirdParties;
import com.Dolibarr.Thirdparty_WebPage.Dolibarsetup;
import com.Dolibarr.Thirdparty_WebPage.SupplierCreatePage;
import com.Dolibarr.Webpage.VTigerLoginPage;
import com.vTiger.UtilLibrary.ExcelOperation;
import com.vTiger.UtilLibrary.SuperTestScript;

public class CreateSupplier extends SuperTestScript 
{
@Test()
public void testCreateSupplier()
{
	String username=ExcelOperation.readData("dolibarr", 1, 1);
	String password=ExcelOperation.readData("dolibarr", 1, 2);
	String ThirdPartyName =ExcelOperation.readData("dolibarr", 4, 1);

	
	VTigerLoginPage lp = new VTigerLoginPage();
	Dolibarsetup d1 = new Dolibarsetup();
	DolibarTirdParties dtp = new DolibarTirdParties();
	SupplierCreatePage scp = new SupplierCreatePage();
	lp.enterUserName(username);
	lp.enterPassword(password);
	lp.clickOnLoginButton();
	dtp.clickOnNewSupplierButton();
	scp.enterThirdPartyName(ThirdPartyName);
	scp.clickOnAddThirdPartyButton();
	

    
}
}












