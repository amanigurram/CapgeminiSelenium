package com.Dolibarr.ThirdParty_Scripts;

import org.testng.annotations.Test;

import com.Dolibarr.Thirdparty_WebPage.CreateCustomer;
import com.Dolibarr.Thirdparty_WebPage.CustomerCard;
import com.Dolibarr.Thirdparty_WebPage.DolibarTirdParties;
import com.Dolibarr.Thirdparty_WebPage.Dolibarsetup;
import com.Dolibarr.Webpage.VTigerLoginPage;
import com.vTiger.UtilLibrary.ExcelOperation;
import com.vTiger.UtilLibrary.SuperTestScript;
import com.vTiger.UtilLibrary.ValidationOperation;

public class DolibarNewCustomerTC_02 extends SuperTestScript
{
@Test	
public void testDolibarNewCustomerTC_02()
{
	//step 1:- fetch all the necessary data 
	String username =ExcelOperation.readData("dolibarr", 1, 1);
	String password =ExcelOperation.readData("dolibarr", 1, 2);
	String un   =ExcelOperation.readData("TC_2", 1, 0);
	String expectedResult =ExcelOperation.readData("TC_2", 1, 1);

//step 2:- create all necessary page objects
	VTigerLoginPage lp = new VTigerLoginPage();
	Dolibarsetup d1 = new Dolibarsetup();
	DolibarTirdParties t1= new DolibarTirdParties();
	CreateCustomer c1 = new CreateCustomer();
	CustomerCard cc = new CustomerCard();
//step 3:- convert test case into testscript
	lp.enterUserName(username);
	lp.enterPassword(password);
	lp.clickOnLoginButton();
	d1.clickparty();
	t1.clickOnNewCustomerButton();
	c1.enterThirdPartyname(un);
	c1.clickOnCreateButton();
	System.out.println("amani");
	String actualResult =cc.retrieveText();
	System.out.println(actualResult);
//step 4:- validate  test script
String status=	ValidationOperation.verify(expectedResult, actualResult);
System.out.println(status);
//step 5:- write data into excel
	ExcelOperation.writeData("TC_2", 1, 2, actualResult);
	ExcelOperation.writeData("TC_2", 1, 3, status);
	lp.clickOnLogoutButton();
	
}
}
