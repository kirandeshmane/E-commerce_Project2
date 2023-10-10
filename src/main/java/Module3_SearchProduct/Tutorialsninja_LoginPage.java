package Module3_SearchProduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tutorialsninja_LoginPage
{

	@FindBy(xpath="//input[@name='email']") WebElement enterEmailID;
	@FindBy(xpath="//input[@name='password']") WebElement enterpassword;
	@FindBy(xpath="//input[@value='Login']") WebElement clickLoginBtn;
	
	public Tutorialsninja_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterEmail(String email)
	{
		enterEmailID.sendKeys(email);
	}
	
	public void EnterPassword(String password)
	{
		enterpassword.sendKeys(password);
	}
	
	public void ClickLoginBtn()
	{
		clickLoginBtn.click();
	}
}
