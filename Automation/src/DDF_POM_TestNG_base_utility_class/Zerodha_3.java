package DDF_POM_TestNG_base_utility_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodha_3 {
	
	@FindBy(xpath = "//span[@class='user-id']")
	private WebElement Id ;
	
	
	public Zerodha_3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String zerodha_homepage_userid()	{
		String actResult = Id.getText();
		return actResult;
	}
	
	public void My_Id() {
		Id.click();
	}
	
}
