package Module1_RegisterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tutorialsninja_SucessPageforRegister 
{
  @FindBy(xpath="(//div[@id='content'])//h1") private WebElement registerSucess;
  
 public  tutorialsninja_SucessPageforRegister (WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public WebElement RegisterSucessful()
 {
	return  registerSucess;
 }
}
