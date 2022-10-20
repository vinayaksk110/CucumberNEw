package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import PageObject.SignupPage;
import TestBase.Testbase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_steps_signup extends Testbase {
	
	public SignupPage signupPage;
	
	@Before
	public void initializ() {
		try {
			initialization("chrome");
			signupPage = new SignupPage();
			
		} catch (Exception e) {
			System.out.println(e);
			Assert.assertTrue(false);
		}
	}

	@SuppressWarnings("deprecation")
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		try {

			driver.get("https://www.remotepc.com/");
			System.out.println("Test 1 signup user is on home page pass-signupTest");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Test failed for following reason : "+ e);
			Assert.assertTrue(false);
		}
		
	}

	@When("user clicks on signup page")
	public void user_clicks_on_signup_page() {
		// click on Sign Up link
		driver.findElement(By.linkText("Sign Up")).click();
		System.out.println("Test 2 signup changes user clicks on Sign Up page pass");
	}

	@When("enters all the required data")
	public void enters_all_the_required_data() {
		try {
			Thread.sleep(5000);
			signupPage.planselect();
			signupPage.enterfname();
			signupPage.enterlname();
			signupPage.enteremail();
			signupPage.enterpass();
			signupPage.selectCountry();
			signupPage.enterNumber();
			signupPage.selectTerms();
			System.out.println("Test 3 signup changes user enters all credentials");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Test failed for following reason : "+ e);
			Assert.assertTrue(false);
		}
		
	}

	@When("clicks on signup")
	public void clicks_on_signup() {
		try {
			Thread.sleep(5000);
			signupPage.buttonSignup();
			System.out.println("Test 4 signup changes user clicks on signup button");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Test failed for following reason : "+ e);
			Assert.assertTrue(false);
		}
	}

	@Then("account should be signed up")
	public void account_should_be_signed_up() {
		
	}

}
