package ListBox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sort_listbox_by_TreeSet   {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		Select s = new Select(month);
		
		//s.selectByIndex(0);
		//s.selectByValue("12");
		//s.selectByVisibleText("Feb");
		Thread.sleep(1000);

		List<WebElement> list = s.getOptions();

		TreeSet<String> TS = new TreeSet<String>();

		for (WebElement ll : list) {
			String sp = ll.getText();
			TS.add(sp);					//added list in TreeSet
		}
		for (Object sort : TS) {
			System.out.println(sort);
		}
		driver.quit();
	}
}