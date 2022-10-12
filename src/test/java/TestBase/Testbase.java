package TestBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	public WebDriver driver = null;
	public FluentWait<WebDriver> wait = null;

	public void initialization(String browser) {
		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
//			FirefoxOptions firefoxOptions = new FirefoxOptions();
//			driver = new FirefoxDriver(firefoxOptions);
			driver = new ChromeDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
//			ChromeOptions chromeOptions = new ChromeOptions();
//			driver = new ChromeDriver(chromeOptions);
			driver = new ChromeDriver();
		}

		System.out.println("============================");
		System.out.println("Project will run in:");
		System.out.println("Brower: " + browser.toUpperCase());
		System.out.println("============================");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void initialization() {
		WebDriverManager.chromedriver().setup();
//			ChromeOptions chromeOptions = new ChromeOptions();
//			driver = new ChromeDriver(chromeOptions);
		driver = new ChromeDriver();

		System.out.println("============================");
		System.out.println("Project will run in:");
		System.out.println("Brower: CHROME");
		System.out.println("============================");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void createFluenttWait(Wait<WebDriver> wait) throws Exception {
		if (wait == null) {
			int timeOut = 30;
			this.wait = new FluentWait<WebDriver>(driver)
					// Timeout time is set to 60
					.withTimeout(Duration.ofSeconds(timeOut))
					// polling interval
					.pollingEvery(Duration.ofMillis(100))
					// ignore the exception
					.ignoring(NoSuchElementException.class, ElementNotInteractableException.class);
			System.out.println("Created wait with browser timeout of " + timeOut + " seconds");
		}
	}

}
