package Module3_SearchProduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tutorialsninja_SearchProducPage 
{
  @FindBy(xpath="(//div[@class='caption'])//h4//a") WebElement seachproductmatch;
  @FindBy(xpath="//p[text()='There is no product that matches the search criteria.']")  WebElement seachproductnotmatch;

 
  
  public tutorialsninja_SearchProducPage (WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public WebElement ProdutPageMatchList()
  {
	  return seachproductmatch;
  }
  
  public WebElement ProdutPagenotMatchList()
  {
	  return seachproductnotmatch;
  }
 
  
}
