package com.Dolibarr.Webpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class VTigerLoginPage 
{
    @FindBy(id="username")
	private WebElement userNameTextField;
    
    @FindBy(id="password")
    private WebElement passwordTextField;

    @FindBy(className="button")
    private WebElement loginButton;
    
    @FindBy(xpath="//img[@alt='Logout']")
    private WebElement logoutButton;
    
    
    public VTigerLoginPage()
    {
    	PageFactory.initElements(SuperTestScript.driver, this);
    }

    public void enterUserName(String username)
    {
    	userNameTextField.sendKeys(username);
    }

    public void enterPassword(String password)
    {
    	passwordTextField.sendKeys(password);
    }

    public void clickOnLoginButton()
    {
    	loginButton.click();
	
}
    public void clickOnLogoutButton()
    {
    	logoutButton.click();
    }
}
