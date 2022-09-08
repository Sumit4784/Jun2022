package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://parivahan.gov.in/parivahan//en/content/vehicle-related-services");

		driver.manage().window().maximize();

		WebElement States = driver.findElement(By.xpath("//select[@class='select-css']"));

		Select s = new Select(States);

		// System.out.println(s.getOptions().size());

		List<WebElement> StateName = s.getOptions();
		int size = StateName.size();
		System.out.println(size);

		for(WebElement SN:StateName) {
		System.out.println(SN.getText());
		}
		driver.quit();
	}
}
