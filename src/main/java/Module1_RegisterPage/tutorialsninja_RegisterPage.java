package Module1_RegisterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class tutorialsninja_RegisterPage 
{
	@FindBy(xpath="//input[@name='firstname']") private WebElement firstName;
	@FindBy(xpath="//input[@name='lastname']") private WebElement lastName;
	@FindBy(xpath="//input[@name='email']") private WebElement Email;
	@FindBy(xpath="//input[@name='telephone']") private WebElement Telephone;
	@FindBy(xpath="//input[@name='password']") private WebElement Password;
	@FindBy(xpath="//input[@name='confirm']") private WebElement confirmPassword;
	@FindBy(xpath="//input[@name='agree']") private WebElement privacyconfirm;
	@FindBy(xpath="//input[@value='Continue']") private WebElement continueBtn;
	@FindBy(xpath="(//div[@class='alert alert-danger alert-dismissible'])//i") private WebElement unsucessful;
	
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
