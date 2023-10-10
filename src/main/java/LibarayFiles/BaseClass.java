package LibarayFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass 
{
public WebDriver driver;
	public void  initializeBrowser() throws IOException
	{
		String Browsername="chrome";
		
		if (Browsername.equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
		}
		
		else if(Browsername.equalsIgnoreCase("Firebox"))
			
		{
			driver = new FirefoxDriver();
		}
		
        else if(Browsername.equalsIgnoreCase("edge"))
			
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.get(UtilityClass .getdata("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}
	
}
