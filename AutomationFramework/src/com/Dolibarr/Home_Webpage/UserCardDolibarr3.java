package com.Dolibarr.Home_Webpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class UserCardDolibarr3
{
    @FindBy(name="nom")
	private WebElement lastNameTextField;
    
    @FindBy(name="prenom")
    private WebElement nameTextField;
    
    @FindBy(name="login")
    private WebElement loginTextField;
    
    @FindBy(name="email")
    private WebElement emailTextField;
    
    @FindBy(xpath="//input[@value='Create user']")
    private WebElement createUser;
    
    public  UserCardDolibarr3()
    {
    	PageFactory.initElements(SuperTestScript.driver, this);
    }
    
    public void enterLastName(String lastName)
    {
    	lastNameTextField.sendKeys(lastName);
    }
    public void enterName(String name)
    {
    	nameTextField.sendKeys(name);
    }
    public void enterLoginName(String loginName)
    {
    	loginTextField.sendKeys(loginName);
    }
    public void enterEmail(String emailName)
    {
    	emailTextField.sendKeys(emailName);
    }
    public void clickOnCreateButton()
    {
    	createUser.click();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
