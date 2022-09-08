package DDF_POM_TestNG_base_utility_class;

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
	public void Zerodha_login_Username(String UserID) {
		ID.sendKeys(UserID);
	}
	public void  Zerodha_login_Password(String Password) {
		Pass.sendKeys(Password);
	}
	public void Zerodha_login_Log_In_btn() {
		Login.click();
	}
}
