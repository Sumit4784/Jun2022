package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodha_2 {

	@FindBy(xpath = "//input[@id='pin']")
	private WebElement pin;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Continue;

	public Zerodha_2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Pin() {
		pin.sendKeys("988142");
	}
	public void Submit() {
		Continue.click();
	}
	
}
