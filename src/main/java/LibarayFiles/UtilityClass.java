package LibarayFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{

	public static String getdata(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\KD\\eclipse-workspace\\MVN_DEMO_Project\\src\\main\\java\\LibarayFiles\\data.properties");
	         Properties p = new Properties();
	         p.load(file);
	  String value= p.getProperty(key);
	  return value;
	         
	}
	
	//@AuthorName - Kiran
		//This method use the get The TestData from excel 
		//need to pass 2input - 1_rowindex & 1_cellindex
	
	public static String getTestData(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\KD\\eclipse-workspace\\MVN_DEMO_Project\\TestData\\RegisterAccount_TestData.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
	}
	
	
	public static void CaptureScreenShot(WebDriver driver,int TCIDNumber) throws IOException
	{
	
		       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		       File dec = new File ("C:\\Users\\KD\\eclipse-workspace\\MVN_DEMO_Project\\FailedTestCaseScreenShot"+TCIDNumber+".png");
		       FileHandler.copy(src, dec);
		
	}
}
