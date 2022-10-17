package TestBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	public WebDriver driver;
	public static int IMPLISIT_WAIT=20;
	public static int PAGELOAD_TIME=40;

	public void initialization(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		System.out.println("============================");
		System.out.println("Project will run in:");
		System.out.println("Brower: " + browser.toUpperCase());
		System.out.println("============================");
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(PAGELOAD_TIME, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(IMPLISIT_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	public void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		System.out.println("============================");
		System.out.println("Project will run in:");
		System.out.println("Brower: CHROME");
		System.out.println("============================");
		driver.manage().window().maximize();
	}
	
	public void getScreenShot() throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("");
		FileUtils.copyFile(src, dest);
	}
	
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
