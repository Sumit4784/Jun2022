package ListBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions_in_AscendingOrder {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(4000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		Select s = new Select(month);
		
		s.selectByIndex(5);

		ArrayList<String> al = new ArrayList<String>();

		List<WebElement> list = s.getOptions();

		for (WebElement ll : list) {
			String ss = ll.getText();
			al.add(ss);
		}
		Collections.sort(al);
		for (String s1 : al) {
			System.out.println(s1);
		}											
		driver.quit();
	}
}