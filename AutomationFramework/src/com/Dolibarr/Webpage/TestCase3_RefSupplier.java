package com.Dolibarr.Webpage;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import com.vTiger.UtilLibrary.SuperTestScript;

public class TestCase3_RefSupplier 
{

	@FindBy(name="facnumber")
	private WebElement refSupplierTextField;
	
	
	@FindBy(id="reButton")
	private WebElement invoiceDateButton;
	
	//@FindBy(xpath="//input[@onmouseover='dpHighlightDay(2019,2,24,tradMonths)']")
	//private WebElement selectDateButton;
	
	@FindBy(xpath="//td[@onmouseover='dpHighlightDay(2019,2,28,tradMonths)']")
	private WebElement selectDateButton;
	
	@FindBy(name="bouton")
	private WebElement createDraftButton;

	public TestCase3_RefSupplier()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void enterRefSuplliername(String refSupplier)
	{
		refSupplierTextField.sendKeys(refSupplier);
	}
	 public void clickOninvoiceDateButton()
	 {
		 invoiceDateButton.click();
	 }
	public void selectWindow()
	{
		  Set<String> s1 = SuperTestScript.driver.getWindowHandles();
		    java.util.Iterator<String> i1 = s1.iterator();
		  String w1 = i1.next();
		   String w2 = i1.next();
		   SuperTestScript.driver.switchTo().window(w2);	
	}
		public void clickOnSelectDate()
		{
			selectDateButton.click();
		}
	public void clickOnCreateDraftButton()
	{
		createDraftButton.click();
	}
	
}
