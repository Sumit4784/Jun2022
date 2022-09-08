package DDF_POM_TestNG_base_utility_class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zerodha_Test extends Base {

	Zerodha_1 kite1;
	Zerodha_2 kite2;
	Zerodha_3 kite3;
	Zerodha_logout_Page kite_logout;

	@BeforeClass
	public void openBrowser() throws IOException {
		browserOpen();
		kite1 = new Zerodha_1(driver);
		kite2 = new Zerodha_2(driver);
		kite3 = new Zerodha_3(driver);
		kite_logout = new Zerodha_logout_Page(driver);

	}

	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException {
		kite1.Zerodha_login_Username(Utility.getTestData(0, 0));
		kite1.Zerodha_login_Password(Utility.getTestData(0, 1));
		kite1.Zerodha_login_Log_In_btn();

		kite2.Pin(Utility.getTestData(0, 2));
		kite2.Submit();
	}

	@Test
	public void test() throws EncryptedDocumentException, IOException {
		String expResult = Utility.getTestData(0, 3);
		String actResult = kite3.zerodha_homepage_userid();

		Assert.assertEquals(actResult, expResult, "Actual and Excepted result is Different");
	}

	@AfterMethod
	public void logout(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			int TCID = 200;
		Utility.captureScreenShot(driver, TCID);
		}
		
		kite3.My_Id();
		kite_logout.zerodha_logout_Btn();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
