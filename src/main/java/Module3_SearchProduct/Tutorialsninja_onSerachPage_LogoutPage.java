package Module3_SearchProduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tutorialsninja_onSerachPage_LogoutPage 
{
	@FindBy(xpath="//span[text()='My Account']")private WebElement myaccountBtn;
	@FindBy(xpath="//a[text()='Logout']") private WebElement Logoutbtn;
	
	
	public Tutorialsninja_onSerachPage_LogoutPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnMyaccount()
	{
		myaccountBtn.click();
	}
	
	public void ClicOnLogoutBtn()
	{
		Logoutbtn.click();
	}

}
