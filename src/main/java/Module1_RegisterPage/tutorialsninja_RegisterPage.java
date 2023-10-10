package Module1_RegisterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class tutorialsninja_RegisterPage 
{
	@FindBy(xpath="//input[@name='firstname']") WebElement firstName;
	@FindBy(xpath="//input[@name='lastname']") WebElement lastName;
	@FindBy(xpath="//input[@name='email']") WebElement Email;
	@FindBy(xpath="//input[@name='telephone']") WebElement Telephone;
	@FindBy(xpath="//input[@name='password']") WebElement Password;
	@FindBy(xpath="//input[@name='confirm']") WebElement confirmPassword;
	@FindBy(xpath="//input[@name='agree']") WebElement privacyconfirm;
	@FindBy(xpath="//input[@value='Continue']") WebElement continueBtn;
	@FindBy(xpath="(//div[@class='alert alert-danger alert-dismissible'])//i") WebElement unsucessful;
	
	public tutorialsninja_RegisterPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void EnetrFirstName(String firstname)
	{
		firstName.sendKeys(firstname);
	}
	
	public void EnetrLastName(String lasttname)
	{
		lastName.sendKeys(lasttname);
	}
    
	public void EnetrEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void EnetrTelephone(String telephone)
	{
		Telephone.sendKeys(telephone);
	}
	public void Enetrpassword(String password)
	{
		Password.sendKeys(password);
	}
	public void EnetrConfirmPassword(String confirmpassword)
	{
		confirmPassword.sendKeys(confirmpassword);
	}
	
	public void ClickPrivacyPolicy()
	{
		privacyconfirm.click();
	}
	
	public void ClickContinueBtn()
	{
		continueBtn.click();
	}
	
	public WebElement aldreadyaccout()
	{
		return unsucessful;
	}
}
