package com.Dolibarr.Home_Scripts;

import org.testng.annotations.Test;

import com.Dolibarr.Home_Webpage.DolibrrSetupHome1;
import com.Dolibarr.Home_Webpage.TestCase2_ClickOnNewGroup3_Dolibarr;
import com.Dolibarr.Home_Webpage.TestCase2_GroupCard;
import com.Dolibarr.Home_Webpage.TestCase2_ShowGroupName;
import com.Dolibarr.Webpage.VTigerLoginPage;
import com.vTiger.UtilLibrary.ExcelOperation;
import com.vTiger.UtilLibrary.SuperTestScript;
import com.vTiger.UtilLibrary.ValidationOperation;

public class CreateGroupTC_04 extends SuperTestScript

{
	@Test
	public void testCreateGroupTC_04()
	{
		String username =ExcelOperation.readData("dolibarr", 1, 1);
		String password =ExcelOperation.readData("dolibarr", 1, 2);
		String groupName = ExcelOperation.readData("TC_04",1 , 0);
		
		String expectedResult = ExcelOperation.readData("TC_04",1 ,1 );
		
		VTigerLoginPage lp = new VTigerLoginPage();
		DolibrrSetupHome1 rv1 = new DolibrrSetupHome1();
		TestCase2_ClickOnNewGroup3_Dolibarr tcd = new TestCase2_ClickOnNewGroup3_Dolibarr();
		TestCase2_GroupCard  gd = new TestCase2_GroupCard();
		TestCase2_ShowGroupName sg = new TestCase2_ShowGroupName();
		
		lp.enterUserName(username);
		lp.enterPassword(password);
		lp.clickOnLoginButton();
		rv1.clickOnUserAndGroupsButton();
		tcd.clickOnNewGroup();
		gd.enterGroupName(groupName);
		gd.clickOnCreateGroupButton();
		String actualResult=sg.getGroupName();
		
		String status=	ValidationOperation.verify(expectedResult, actualResult);
		   
		   //step 5:- write data into excel
		    	ExcelOperation.writeData("TC_04", 1,2 , actualResult);
		    	ExcelOperation.writeData("TC_04", 1,3 , status);
		    	lp.clickOnLogoutButton();
		
		
		
		
		
		
		
		
		
	}
}
