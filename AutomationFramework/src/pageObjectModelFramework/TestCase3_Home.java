package pageObjectModelFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.UtilLibrary.SuperTestScript;

public class TestCase3_Home
{
	@FindBy(xpath="//span[@className='mainmenuaspan']")
	private WebElement thirdParties;
	
	public TestCase3_Home()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickOnThirdParties()
	{
		thirdParties.click();
	}

}
