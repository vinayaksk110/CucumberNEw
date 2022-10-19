package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestBase.Testbase;

public class LoginPage extends Testbase {
	//public WebDriver driver;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email") 
	WebElement txtBox_Username;
	
	@FindBy(id="password")
	WebElement txtBox_Password;
	
	@FindBy(id="loginButton")
	WebElement btn_Login;
	
	
	public void enterUsername() {
//		String user=prop.getProperty("username");
		//WebElement username = Testbase.driver.findElement(By.id("email"));
//		String user = "vinayak.kumbar+ent_at@idrive.com";
//		System.out.println("tesdfdffsdf"+txtBox_Username);
		txtBox_Username.sendKeys("vinayak.kumbar+ent_at@idrive.com");
	}
	
	public void enterPassword() {
//		String pass=prop.getProperty("password");
		String pass = "test12";
		txtBox_Password.sendKeys(pass);
	}
	
	public void ClickLogin() {
		btn_Login.click();
	}

}
