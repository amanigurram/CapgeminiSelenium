package com.Dolibarr.Thirdparty_WebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class SuccessMessagePage_5
{
    @FindBy(className = "warning")
	private WebElement successMessage;
    
    public SuccessMessagePage_5()
    {
    	PageFactory.initElements(SuperTestScript.driver, this);
    }
    
    public String getSuccessMessgeText()
    {
    	String message = successMessage.getText();
    	return message;
    }
    
}
