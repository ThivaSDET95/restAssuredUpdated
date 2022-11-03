package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constantProperties.constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverInitiate {

	private static WebDriver driver;



	public static WebDriver getDriver() {
		return driver;
	}

	public static void launchBrowser() {

		switch (constants.browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
		}

	}

}
