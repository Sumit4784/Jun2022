package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodha_Position {
	
	@FindBy(xpath = "//span[text()='Positions']")
	private WebElement Positions;
	
	public Zerodha_Position(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void handle_popup(WebDriver driver) {
		

	}
	public void MyPosition() {
		Positions.click();
	}
}
