package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// implicitlywait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		// open website
		driver.get("https://www.remotepc.com/");

		// click on login link
		driver.findElement(By.linkText("Login")).click();

		// enter credentials and login
		driver.findElement(By.id("email")).sendKeys("vinayak.kumbar+ent_at@idrive.com");
		driver.findElement(By.id("password")).sendKeys("test12");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Login successfull");

		driver.quit();

	}

}
