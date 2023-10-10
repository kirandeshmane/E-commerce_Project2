package Module1_RegisterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tutorialsninja_HomePageforRegister
{
	@FindBy(xpath="//span[text()='My Account']") WebElement myaccountBtn;
	@FindBy(xpath="//a[text()='Register']") WebElement registerbtn;
	
	
	public tutorialsninja_HomePageforRegister(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void ClickOnMyaccount()
	{
		myaccountBtn.click();
	}
	
	public void ClicOnRegisterBtn()
	{
		registerbtn.click();
	}
	
}
