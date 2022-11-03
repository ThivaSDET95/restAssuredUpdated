package stepDefinitions;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import commonUtils.utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import webDriver.WebDriverInitiate;

public class CommonBrowserOperations {


	@Test
	public void browserLaunch() throws IOException {
		utils.getUtils().loadProperties();
		if (WebDriverInitiate.getDriver()==null) {
			WebDriverInitiate.launchBrowser();
		}
	}

	@AfterSuite
	public void tearDown() {
		WebDriverInitiate.getDriver().quit();
	}


}
