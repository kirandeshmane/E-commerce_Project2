package Module2_LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tutorialsninja_AccountPage 
{
   @FindBy(xpath="//a[text()='Edit your account information']") private WebElement accountPage;
   @FindBy(xpath="//div[@id='content']//h2[1]") private  WebElement MyaccountPage;
   
   public tutorialsninja_AccountPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   
      public WebElement editaccountBtn()
      {
    	 return accountPage;
      }
      public WebElement myaccount()
      {
    	 return MyaccountPage;
      }
}
