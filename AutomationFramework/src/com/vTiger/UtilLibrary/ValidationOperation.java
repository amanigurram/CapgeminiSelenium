package com.vTiger.UtilLibrary;

import org.testng.Assert;

public class ValidationOperation 
{
	public static String verify(String expectedResult, String actualResult)
	{
	try
	{
		Assert.assertEquals(expectedResult, actualResult);
		return "pass";
	}
	catch(AssertionError e)
	{
		return "fail";
	}
	}

}
