package ListBox;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Parivahan {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://parivahan.gov.in/parivahan//en/content/vehicle-related-services");

		driver.manage().window().maximize();


		WebElement StateName = driver.findElement(By.xpath("//select[@class='select-css']"));
		//WebElement StateName = driver.findElement(By.xpath("//option[text()=' ---Select State Name --- ']"));
		
		 Thread.sleep(2000);

		Select s = new Select(StateName);

		//s.selectByValue("MH");
		// s.selectByIndex(11);
		// s.selectByVisibleText("Goa");
		
		boolean result = s.isMultiple();
		System.out.println(result);
		
		List<WebElement> states = s.getOptions();
		
		 HashSet<String> HS = new HashSet<String>();
		
		for (WebElement list : states) {
			String abc = list.getText();
			HS.add(abc);
		}
		Iterator<String> kk = HS.iterator();
		while (kk.hasNext()) {
		System.out.println(	kk.next());
		}	
		Thread.sleep(5000);
		driver.quit();
	}
}