package com.ecommerce.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements IAutoConstant {
	public WebDriver driver;
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void openApplication() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		
		driver = new FirefoxDriver();
		String appURl = AutoUtil.getProperty(CONFIG_PATH, "appURL");
		driver.get(appURl);

		String sITO = AutoUtil.getProperty(CONFIG_PATH, "ITO");
		long ITO = Long.parseLong(sITO);

		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);

	}

	@AfterMethod

	public void closeApplication(ITestResult r) {
		String testName = r.getName();
		int status = r.getStatus();
		if (status == 2) {
			AutoUtil.getPhoto(driver, IMG_PATH, testName);
		}

		driver.quit();

	}

}
