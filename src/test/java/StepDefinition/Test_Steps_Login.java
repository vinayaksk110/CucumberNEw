package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PageObject.LoginPage;
import TestBase.Testbase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Steps_Login extends Testbase {
	
	LoginPage loginPage = new LoginPage(driver, wait);
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
//		initialization("firefox");
		initialization();
		driver.get("https://www.remotepc.com/");
		System.out.println("Test 1 user is on home page pass");
	}

	@When("user clicks on login page")
	public void user_clicks_on_login_page() {
		// click on login link
		driver.findElement(By.linkText("Login")).click();
		System.out.println("Test 2 user clicks on login page pass");
	}

	@When("enters proper credentials")
	public void enters_proper_credentials() {
		// enter credentials and login
//		driver.findElement(By.id("email")).sendKeys("vinayak.kumbar+ent_at@idrive.com");
//		driver.findElement(By.id("password")).sendKeys("test12");
		loginPage.enterUsername("vinayak.kumbar+ent_at@idrive.com");
		loginPage.enterPassword("test12");
		System.out.println("Test 3 enters proper credentials pass");
		
	}

	@Then("users should be logged in and message should be displayed")
	public void users_should_be_logged_in_and_message_should_be_displayed() {
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Login successfull");
		driver.quit();
		System.out.println("Test 4 users should be logged in and message should be displayed pass");
	}

}
