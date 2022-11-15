package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.Testbase;

public class SignupPage extends Testbase {

	public SignupPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//label[@for='416-FT']")
	WebElement chkbox_plan;

	@FindBy(id = "fname")
	WebElement txtBox_firstname;

	@FindBy(id = "lname")
	WebElement txtBox_lastname;

	@FindBy(id = "email")
	WebElement txtBox_email;

	@FindBy(id = "pwd")
	WebElement txtbox_password;

	@FindBy(id = "countryCode")
	WebElement select_country;

	@FindBy(id = "phone")
	WebElement txtbox_phone;

	@FindBy(id = "promocode")
	WebElement txtbox_promo;
	
	@FindBy(id="terms_check")
	WebElement chkBox_terms;
	
	@FindBy(id="submit-signup")
	WebElement button_createMyAccount;

	public void planselect() {
		chkbox_plan.click();
	}

	public void enterfname() {
		String firstName = "Vinayak";
		txtBox_firstname.sendKeys(firstName);
	}

	public void enterlname() {
		String lastName = "Kumbar";
		txtBox_lastname.sendKeys(lastName);
	}

	public void enteremail() {
		String email = "vinayak.kumbar+1910@idrive.com";
		txtBox_email.sendKeys(email);
	}

	public void enterpass() {
		String pass = "test12";
		txtbox_password.sendKeys(pass);
	}
	
	public void selectCountry() {
		Select select = new Select(select_country);
		select.selectByVisibleText("India +91");
	}
	
	public void enterNumber() {
		String num = "9999999999";
		txtbox_password.sendKeys(num);
	}
	
	public void selectTerms() {
		chkBox_terms.click();
	}
	
	public void buttonSignup() {
		button_createMyAccount.click();
	}
	
	

}
