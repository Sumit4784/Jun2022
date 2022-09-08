package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Zerodha_Test {			

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumit\\eclipse-workspace\\Automation\\Browser\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification");
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://kite.zerodha.com/");

		Zerodha_1 kite1 = new Zerodha_1(driver);
		kite1.UserID();
		kite1.Password();
		kite1.Log_In();
		Thread.sleep(2000);
		
		Zerodha_2 kite2 = new Zerodha_2(driver);
		kite2.Pin();
		kite2.Submit();
		Thread.sleep(3000);
		
		Zerodha_Position kitep = new Zerodha_Position(driver);
		kitep.MyPosition();
		Thread.sleep(3000);
		
		Zerodha_4 kiteh = new Zerodha_4(driver);
		kiteh.My_Id();
		kiteh.LogOut();
		Thread.sleep(2000);
		
		driver.quit();		
	}
}