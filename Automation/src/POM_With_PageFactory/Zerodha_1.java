package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodha_1 {
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement ID;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement Pass;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Login;
	
	public Zerodha_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void UserID() {
		ID.sendKeys("GJZ835");
	}
	public void Password() {
		Pass.sendKeys("sANTOSH@9881");
	}
	public void Log_In() {
		Login.click();
	}
}
