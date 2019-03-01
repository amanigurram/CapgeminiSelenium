package com.Dolibarr.ThirdParty_Scripts;

import org.testng.annotations.Test;

import com.Dolibarr.Thirdparty_WebPage.DeleteCustomerPage_5;
import com.Dolibarr.Thirdparty_WebPage.DolibarTirdParties;
import com.Dolibarr.Thirdparty_WebPage.Dolibarsetup;
import com.Dolibarr.Thirdparty_WebPage.SelectCustomerPage_5;
import com.Dolibarr.Thirdparty_WebPage.SuccessMessagePage_5;
import com.Dolibarr.Webpage.VTigerLoginPage;
import com.vTiger.UtilLibrary.ExcelOperation;
import com.vTiger.UtilLibrary.SuperTestScript;
import com.vTiger.UtilLibrary.ValidationOperation;

public class DeleteCustomerDB_01 extends SuperTestScript
{
    @Test
	public void testDeleteCustomerDB_01()
	{
    	String username =ExcelOperation.readData("dolibarr", 1, 1);
    	String password =ExcelOperation.readData("dolibarr", 1, 2);
    	String customerName  =ExcelOperation.readData("DB_01", 1, 0);
    	String expectedResult= ExcelOperation.readData("DB_01", 1, 1);
    	
    	VTigerLoginPage lp = new VTigerLoginPage();
    	Dolibarsetup d1 = new Dolibarsetup();
    	DolibarTirdParties t1= new DolibarTirdParties();
    	SelectCustomerPage_5 scp = new SelectCustomerPage_5();
    	 DeleteCustomerPage_5 dcp= new  DeleteCustomerPage_5();
    	 SuccessMessagePage_5 smp = new SuccessMessagePage_5();
    	 
    	 lp.enterUserName(username);
    	 lp.enterPassword(password);
    	 lp.clickOnLoginButton();
    	 d1.clickparty();
    	 t1.clickOnListOfCustomer();
    	 scp.clickOnSelectCustomer(customerName);
    	 dcp.clickOnDeleteCustomer();
    	 dcp.clickOnyesButton();
    	String actualResult = smp.getSuccessMessgeText();
    	String status=	ValidationOperation.verify(expectedResult, actualResult);
    	System.out.println(status);
    	//step 5:- write data into excel
    		ExcelOperation.writeData("DB_01", 1, 2, actualResult);
    		ExcelOperation.writeData("DB_01", 1,3, status);
    		lp.clickOnLogoutButton();
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 

	}
}
