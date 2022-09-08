package DDF_POM_TestNG_base_utility_class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base  {
	static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void browserOpen() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumit\\eclipse-workspace\\Automation\\Browser\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(Utility.getPropertiesFileData("URL"));
	}

}
