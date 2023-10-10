package Module3_SearchProduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tutorialsninja_AccountPage_searchProduct 
{
   @FindBy(xpath="//input[@name='search']") WebElement serachbox;
   @FindBy(xpath="//button[@class='btn btn-default btn-lg']")  WebElement clickonseachbtn;
   
   public tutorialsninja_AccountPage_searchProduct(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   

      public void EnterTheCharcterInSeachBox(String SeachBox)
      {
    	  serachbox.sendKeys(SeachBox);
    	  
       }
      
      public void ClickOnSeachBtn ()
      {
    	  clickonseachbtn.click();
      }
}
