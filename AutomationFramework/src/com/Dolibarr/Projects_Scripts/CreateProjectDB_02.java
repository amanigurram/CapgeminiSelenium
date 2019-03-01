package com.Dolibarr.Projects_Scripts;

import org.testng.annotations.Test;

import com.Dolibarr.Home_Webpage.DolibrrSetupHome1;
import com.Dolibarr.Projects_WebPage.CreateProjectPage6;
import com.Dolibarr.Projects_WebPage.ProjectDispalyPage;
import com.Dolibarr.Projects_WebPage.ProjectsPage_6;
import com.Dolibarr.Webpage.VTigerLoginPage;
import com.vTiger.UtilLibrary.ExcelOperation;
import com.vTiger.UtilLibrary.SuperTestScript;
import com.vTiger.UtilLibrary.ValidationOperation;

public class CreateProjectDB_02 extends SuperTestScript
{
	@Test
	public void testCreateProjectDB_02()
	{
		String username =ExcelOperation.readData("dolibarr", 1, 1);
    	String password =ExcelOperation.readData("dolibarr", 1, 2);
    	String labelName  =ExcelOperation.readData("DB_02", 1, 0);
        String thirdPartyName   =ExcelOperation.readData("DB_02", 1, 1);
    	String expectedResult= ExcelOperation.readData("DB_02", 1, 2);
    	
    	VTigerLoginPage lp = new VTigerLoginPage();
    	DolibrrSetupHome1 dsh = new DolibrrSetupHome1();
    	ProjectsPage_6 pp = new ProjectsPage_6();
    	 CreateProjectPage6 cpp = new  CreateProjectPage6();
    	 ProjectDispalyPage pdp = new ProjectDispalyPage();
    	 
    	 lp.enterUserName(username);
    	 lp.enterPassword(password);
    	 lp.clickOnLoginButton();
    	 dsh.clickOnProjectsButton();
    	 pp.clickOnNewProject();
    	 cpp.enterLabelName(labelName);
    	 cpp.clickOndropDown(thirdPartyName);
    	 cpp.clickOnCreateButton();
    	 String actualResult= pdp.getCompanyName();
    	 System.out.println(actualResult);
    	 
    	
    	String status=	ValidationOperation.verify(expectedResult, actualResult);
    	System.out.println(status);
    	//step 5:- write data into excel
    		ExcelOperation.writeData("DB_02", 1, 3, actualResult);
    		ExcelOperation.writeData("DB_02", 1,4, status);
    		System.out.println("before logout");
    		lp.clickOnLogoutButton();

	}

}
