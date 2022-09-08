package DDF_POM_TestNG_base_utility_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodha_2 {

	@FindBy(xpath = "//input[@id='pin']")
	private WebElement enterpin;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Continue;

	public Zerodha_2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Pin(String pin) {
		enterpin.sendKeys(pin);
	}
	public void Submit() {
		Continue.click();
	}
	
}
