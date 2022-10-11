package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID, using="email") 
	WebElement txtBox_Username;
	
	@FindBy(how=How.ID, using="password")
	WebElement txtBox_Password;
	
	@FindBy(how=How.ID, using="loginButton")
	WebElement btn_Login;
	
	
	
	public void enterUsername(String uname) {
		txtBox_Username.sendKeys(uname);
	}
	
	public void enterPassword(String pass) {
		txtBox_Password.sendKeys(pass);
	}
	
	public void ClickLogin() {
		btn_Login.click();
	}

}
