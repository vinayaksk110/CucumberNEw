package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestBase.Testbase;

public class LoginPage extends Testbase {
//	private WebDriver driver;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id= "email") 
	private WebElement txtBox_Username;
	
	@FindBy(id= "password")
	private WebElement txtBox_Password;
	
	@FindBy(id="loginButton")
	private WebElement btn_Login;
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	public void enterUsername(String user) {
//		String user = "vinayak.kumbar+ent_at@idrive.com";
		txtBox_Username.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
//		String pass = "test12";
		txtBox_Password.sendKeys(pass);
	}
	
	public void ClickLogin() {
		btn_Login.click();
	}

}
