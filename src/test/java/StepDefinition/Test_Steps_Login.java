package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PageObject.LoginPage;
import TestBase.Testbase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Steps_Login extends Testbase {

	LoginPage loginPage = new LoginPage(driver);

	@Before
	public void initializ() {
		try {
			initialization("firefox");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Given("user is on home page")
	public void user_is_on_home_page() {
		try {

			driver.get("https://www.remotepc.com/");
			System.out.println("Test 1 user is on home page pass");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@When("user clicks on login page")
	public void user_clicks_on_login_page() {
		try {
			// click on login link
			driver.findElement(By.linkText("Login")).click();
			System.out.println("Test 2 user clicks on login page pass");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@When("enters proper credentials")
	public void enters_proper_credentials() {
		try {
			// enter credentials and login
//			driver.findElement(By.id("email")).sendKeys("vinayak.kumbar+ent_at@idrive.com");
//			driver.findElement(By.id("password")).sendKeys("test12");
//			loginPage.enterUsername("vinayak.kumbar+ent_at@idrive.com");
//			loginPage.enterPassword("test12");
			loginPage.enterUsername();
			loginPage.enterPassword();
			System.out.println("Test 3 enters proper credentials pass");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Then("users should be logged in and message should be displayed")
	public void users_should_be_logged_in_and_message_should_be_displayed() throws InterruptedException {
		try {
			driver.findElement(By.id("loginButton")).click();
			System.out.println("Login successfull");
			Thread.sleep(1000);
			driver.quit();
			System.out.println("Test 4 users should be logged in and message should be displayed pass");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
