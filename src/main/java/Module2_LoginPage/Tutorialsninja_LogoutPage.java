package Module2_LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tutorialsninja_LogoutPage 
{
	
	@FindBy(xpath="(//a[text()='Logout'])[2]") WebElement Logoutbtn;
	
	
	public Tutorialsninja_LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void ClicOnLoginBtn()
	{
		Logoutbtn.click();
	}

}
