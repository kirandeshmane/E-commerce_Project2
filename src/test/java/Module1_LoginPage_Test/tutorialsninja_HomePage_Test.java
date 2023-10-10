package Module1_LoginPage_Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibarayFiles.BaseClass;
import LibarayFiles.UtilityClass;
import Module2_LoginPage.Tutorialsninja_LoginPage;
import Module2_LoginPage.Tutorialsninja_LogoutPage;
import Module2_LoginPage.tutorialsninja_AccountPage;
import Module2_LoginPage.tutorialsninja_HomePage;

public class tutorialsninja_HomePage_Test extends BaseClass 
{
	 tutorialsninja_HomePage homepage ;
	 Tutorialsninja_LoginPage login;
	 tutorialsninja_AccountPage account;
	 Tutorialsninja_LogoutPage logout;
	 
  @BeforeClass()
   public void OpenBrowser() throws IOException
   {
	  initializeBrowser();
	  
	   homepage = new tutorialsninja_HomePage(driver);
	   login = new Tutorialsninja_LoginPage(driver);
	   account = new tutorialsninja_AccountPage(driver);
	   logout = new Tutorialsninja_LogoutPage (driver);
	   
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
  public void verifyaccount()
  {
	  String act="Edit your account information";
	   String exp = account.editaccountBtn().getText();
	   Assert.assertEquals(act, exp);
	   
	   
	  String value = account.myaccount().getText();
	  System.out.println("This is"+" "+value);
  
  }
  
  @AfterMethod
  public void LogoutApp()
  {
	  logout.ClicOnLoginBtn();
  }
  @AfterClass
  public void closebrowser() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.quit();
  }
  

	
}
