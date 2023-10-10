package Module2_RegisterPage_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibarayFiles.BaseClass;
import LibarayFiles.UtilityClass;
import Module1_RegisterPage.tutorialsninja_HomePageforRegister;
import Module1_RegisterPage.tutorialsninja_RegisterPage;
import Module1_RegisterPage.tutorialsninja_SucessPageforRegister;
import Module2_LoginPage.Tutorialsninja_LogoutPage;

public class tutorialsninja_RegisterPage_Test extends BaseClass
{
	
	tutorialsninja_HomePageforRegister home1;
	tutorialsninja_RegisterPage  register;
	tutorialsninja_SucessPageforRegister sucess;
	Tutorialsninja_LogoutPage logout;
	boolean value;
	boolean value2;
	
  @BeforeClass
	public void openBrowser() throws IOException
	{
		initializeBrowser();
		
	 home1 = new tutorialsninja_HomePageforRegister(driver);
	 register = new tutorialsninja_RegisterPage (driver);
	 sucess = new tutorialsninja_SucessPageforRegister (driver);
	 logout = new Tutorialsninja_LogoutPage (driver);
		
	}
  
  @BeforeMethod
  public void registeraccountdata() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  home1.ClickOnMyaccount();
		home1.ClicOnRegisterBtn();
		
		register.EnetrFirstName(UtilityClass.getTestData(0, 1));
		register.EnetrLastName(UtilityClass .getTestData(1, 1));
		register.EnetrEmail(UtilityClass .getTestData(2, 1));
		register.EnetrTelephone(UtilityClass .getTestData(3, 1));
		register.Enetrpassword(UtilityClass .getTestData(4, 1));
		register.EnetrConfirmPassword(UtilityClass .getTestData(5, 1));
		register.ClickPrivacyPolicy();
		register.ClickContinueBtn(); 
  }
	
	@Test
	public void verifyRegisteraccountCreated() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		String value = sucess.RegisterSucessful().getText();
				System.out.println(value);
		 String value2 = register.aldreadyaccout().getText();
		 System.out.println(value2);
		
	}
	 @AfterMethod
	  public void LogoutApp()
	  {
		 if(value)
		 { 
		  logout.ClicOnLoginBtn();
		 }
	  }
	
	 @AfterClass
	  public void closebrowser() throws InterruptedException
	  {
		 if(value2)
		  Thread.sleep(3000);
		  driver.quit();
	  }
}
