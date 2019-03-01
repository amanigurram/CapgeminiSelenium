package com.Dolibarr.ThirdParty_Scripts;

import org.testng.annotations.Test;

import com.Dolibarr.Thirdparty_WebPage.Dolibarsetup;
import com.Dolibarr.Webpage.TestCase3_ListOfSuppliers;
import com.Dolibarr.Webpage.TestCase3_RefSupplier;
import com.Dolibarr.Webpage.TestCase3_SupplierCard;
import com.Dolibarr.Webpage.TestCase3_ThirdPartiesPage;
import com.Dolibarr.Webpage.VTigerLoginPage;
import com.vTiger.UtilLibrary.ExcelOperation;
import com.vTiger.UtilLibrary.SuperTestScript;

public class AddInvoice_TC_05 extends SuperTestScript
{
	@Test
	public void testAddInvoice_TC_05()
	{
		String username =ExcelOperation.readData("dolibarr", 1, 1);
		String password =ExcelOperation.readData("dolibarr", 1, 2);
		String refSupplier=  ExcelOperation.readData("dolibarr", 7, 0);
		
		VTigerLoginPage lp = new VTigerLoginPage();
		Dolibarsetup ds= new Dolibarsetup();
		TestCase3_ThirdPartiesPage ttpp = new TestCase3_ThirdPartiesPage();
		TestCase3_ListOfSuppliers tls = new TestCase3_ListOfSuppliers();
		TestCase3_SupplierCard tsc = new TestCase3_SupplierCard();
		TestCase3_RefSupplier trs= new TestCase3_RefSupplier();
		
		//TestCase3_ListOfSuppliers
		lp.enterUserName(username);
		lp.enterPassword(password);
		lp.clickOnLoginButton();
		ds.clickparty();
		ttpp.clickOnListOfSuppliersButton();
		tls.clickOnSupplierName();
		tsc.clickOnAddInvoiceButton();
		trs.enterRefSuplliername(refSupplier);
		System.out.println(refSupplier);
		trs.clickOninvoiceDateButton();
		trs.clickOnSelectDate();
		trs.clickOnCreateDraftButton();
		
		lp.clickOnLogoutButton();
		//rv1.clickOnUserAndGroupsButton();
	///	tcd.clickOnNewGroup();
		/*8gd.enterGroupName(groupName);
		gd.clickOnCreateGroupButton();
		String actualResult=sg.getGroupName();
		
		String status=	ValidationOperation.verify(expectedResult, actualResult);
		   
		   //step 5:- write data into excel
		    	ExcelOperation.writeData("TC_04", 1,2 , actualResult);
		    	ExcelOperation.writeData("TC_04", 1,3 , status);*/


	}
}
