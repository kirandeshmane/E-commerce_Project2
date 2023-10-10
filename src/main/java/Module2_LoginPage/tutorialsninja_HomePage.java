package Module2_LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tutorialsninja_HomePage 
{
 
	@FindBy(xpath="//span[text()='My Account']") WebElement myaccountBtn;
	@FindBy(xpath="//a[text()='Login']") WebElement loginbtn;
	
	
	public tutorialsninja_HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void ClickOnMyaccount()
	{
		myaccountBtn.click();
	}
	
	public void ClicOnLoginBtn()
	{
		loginbtn.click();
	}
}
