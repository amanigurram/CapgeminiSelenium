package com.Dolibarr.Home_Webpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class UserCard4
{
 @FindBy(xpath="//td[text()='radha1']")
 private WebElement showName;
 
 public UserCard4()
 {
	 PageFactory.initElements(SuperTestScript.driver, this);
 }
  public String getName() 
  {
	  String namegiven = showName.getText();
	  return namegiven;
  }
 
}
