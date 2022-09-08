package DDF_POM_TestNG_base_utility_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodha_logout_Page {
	
	@FindBy(xpath = "//a[@target='_self']")
	private WebElement logout_btn;

	public Zerodha_logout_Page(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	
	public void zerodha_logout_Btn() {
		logout_btn.click();
	}
}
