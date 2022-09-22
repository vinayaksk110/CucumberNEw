package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_steps_signup {

	WebDriver driver = null;

	@Given("user is on homepage")
	public void user_is_on_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// implicitly wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// open website
		driver.get("https://www.remotepc.com/");
		System.out.println("Test 1 signup user is on home page pass");
	}

	@When("user clicks on signup page")
	public void user_clicks_on_signup_page() {
		// click on Sign Up link
		driver.findElement(By.linkText("Sign Up")).click();
		System.out.println("Test 2 signup changes user clicks on Sign Up page pass");
	}

	@When("enters all the required data")
	public void enters_all_the_required_data() {
		
	}

	@When("clicks on signup")
	public void clicks_on_signup() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("account should be signed up")
	public void account_should_be_signed_up() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
