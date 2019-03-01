package com.Dolibarr.Thirdparty_WebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;


public class CustomerCard 
{
    @FindBy(className="nobordernopadding")
	private WebElement displayName;
    
public CustomerCard ()
	
	{
		PageFactory.initElements(SuperTestScript.driver, this);

	}
    
    public String retrieveText()
    {
    	String namedisplay= displayName.getText();
    	return namedisplay;
    }
	
	
}
