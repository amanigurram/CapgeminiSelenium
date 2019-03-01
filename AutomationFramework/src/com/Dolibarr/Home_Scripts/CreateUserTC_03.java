package com.Dolibarr.Home_Scripts;

import org.testng.annotations.Test;

import com.Dolibarr.Home_Webpage.DoilbarrHome2;
import com.Dolibarr.Home_Webpage.DolibrrSetupHome1;
import com.Dolibarr.Home_Webpage.UserCard4;
import com.Dolibarr.Home_Webpage.UserCardDolibarr3;
import com.Dolibarr.Webpage.VTigerLoginPage;
import com.vTiger.UtilLibrary.ExcelOperation;
import com.vTiger.UtilLibrary.SuperTestScript;
import com.vTiger.UtilLibrary.ValidationOperation;

public class CreateUserTC_03 extends SuperTestScript
{
 @Test
	public void testCreateUser()
	{
		String username =ExcelOperation.readData("dolibarr", 1, 1);
		String password =ExcelOperation.readData("dolibarr", 1, 2);
		String lastName = ExcelOperation.readData("TC_03",1 , 2);
		String name = ExcelOperation.readData("TC_03",1 , 3);
		String loginName = ExcelOperation.readData("TC_03",1 , 4);
		String emailName = ExcelOperation.readData("TC_03",1 , 5);
		String expectedResult = ExcelOperation.readData("TC_03",1 ,6 );
		
		VTigerLoginPage lp = new VTigerLoginPage();
		DolibrrSetupHome1 rv1 = new DolibrrSetupHome1();
		DoilbarrHome2 rv2 = new DoilbarrHome2();
		UserCardDolibarr3 rv3= new UserCardDolibarr3();
		UserCard4 rv4 = new UserCard4();
		
		lp.enterUserName(username);
		lp.enterPassword(password);
		lp.clickOnLoginButton();
		rv1.clickOnUserAndGroupsButton();
		rv2.clickOnNewUSer();
		rv3.enterLastName(lastName);
		rv3.enterName(name);
rv3.enterLoginName(loginName);
rv3.enterEmail(emailName);
rv3.clickOnCreateButton();
   String actualResult  =rv4.getName();
   System.out.println("got actual result");
   String status=	ValidationOperation.verify(expectedResult, actualResult);
   
   //step 5:- write data into excel
    	ExcelOperation.writeData("TC_03", 1, 7, actualResult);
    	ExcelOperation.writeData("TC_03", 1, 8, status);
    	System.out.println("till logout");
    	lp.clickOnLogoutButton();

	}
}








