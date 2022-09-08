package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodha_4 {
	
	@FindBy(xpath = "//span[@class='user-id']")
	private WebElement My_Id ;
	
	@FindBy(xpath = "//a[@target='_self']")
	private WebElement Logout;
	
	public Zerodha_4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void My_Id() {
		My_Id.click();
	}
	public void LogOut() {
		Logout.click();
	}
}
