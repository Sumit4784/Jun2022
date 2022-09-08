package DDF_POM_TestNG_base_utility_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static String getPropertiesFileData(String key) throws IOException {
		Properties obj = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\url.properties");
		obj.load(file);
		String value = obj.getProperty(key);
		return value;
		

	}

	public static String getTestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\sumit\\eclipse-workspace\\Automation\\Files\\InputCredential.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Kite");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;

	}

	public static void captureScreenShot(WebDriver driver, int TCID) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\sumit\\eclipse-workspace\\Automation\\Screenshots\\screenshot_" + TCID + ".jpeg");

		FileHandler.copy(src, dest);

	}

}
