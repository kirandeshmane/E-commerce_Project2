package Moduel3_SearchProduct_Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibarayFiles.BaseClass;
import LibarayFiles.UtilityClass;
import Module2_LoginPage.Tutorialsninja_LoginPage;
import Module2_LoginPage.tutorialsninja_HomePage;
import Module3_SearchProduct.Tutorialsninja_onSerachPage_LogoutPage;
import Module3_SearchProduct.tutorialsninja_AccountPage_searchProduct;
import Module3_SearchProduct.tutorialsninja_SearchProducPage;

public class tutorialsninja_SearchProduct_Test extends BaseClass
{
	tutorialsninja_HomePage homepage ;
	 Tutorialsninja_LoginPage login;
	 tutorialsninja_AccountPage_searchProduct account;
	 Tutorialsninja_onSerachPage_LogoutPage logout;
	 tutorialsninja_SearchProducPage  search;
	 int TCID;
	@BeforeClass()
		   public void OpenBrowser() throws IOException
		   {
			  initializeBrowser();
			  
			   homepage = new tutorialsninja_HomePage(driver);
			   login = new Tutorialsninja_LoginPage(driver);
			   account = new tutorialsninja_AccountPage_searchProduct(driver);
			   search = new tutorialsninja_SearchProducPage (driver);
			   logout = new Tutorialsninja_onSerachPage_LogoutPage (driver);
		   }
	
	 @BeforeMethod
	  public void LoginApp() throws IOException
	  {
		  homepage.ClickOnMyaccount();
		   homepage.ClicOnLoginBtn();
		   
		  login.EnterEmail(UtilityClass .getdata("UN"));
		   login.EnterPassword(UtilityClass .getdata("PSW"));
		   login.ClickLoginBtn();
	  }
	 
		
	  @Test
	  public void SearchtheProduct() throws InterruptedException
	  {
		  TCID=101;
		  account.EnterTheCharcterInSeachBox("imac");
		  account.ClickOnSeachBtn();
		  
		  String act= "iMac";
		  String exp = search.ProdutPageMatchList().getText();
		  System.out.println(exp);
		  Thread.sleep(3000);
		  Assert.assertEquals(act, exp);
		  
		  
		  
	  }
	  @Test
	  public void productnotavailable() throws InterruptedException
	  {
		  TCID=102;
		  account.EnterTheCharcterInSeachBox("ipad");
		  account.ClickOnSeachBtn();
		  
		  String act= "iMac";
		  String exp = search.ProdutPagenotMatchList().getText();
		  System.out.println(exp);
		  Thread.sleep(3000);
		  Assert.assertEquals(act, exp);
		  
	  }
	 
	  @AfterMethod
	  public void LogoutApp(ITestResult result) throws IOException 
	  {
		  if(result.getStatus()==ITestResult.FAILURE)
		  {
			  UtilityClass .CaptureScreenShot(driver, TCID);
		  }
	   logout.ClickOnMyaccount();
	   logout.ClicOnLogoutBtn();
	   
	  }
	  @AfterClass
	  public void closebrowser() throws InterruptedException
	  {
		  Thread.sleep(3000);
		  driver.quit();
	  }
}
