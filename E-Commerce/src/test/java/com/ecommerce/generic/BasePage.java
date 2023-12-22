package com.ecommerce.generic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePage implements IAutoConstant {
	public void verifyPageIsDisplayed(WebDriver driver, String eResult) {
		String sETO = AutoUtil.getProperty(CONFIG_PATH, "ETO");

		long ETO = Long.parseLong(sETO);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ETO));
		try {
			wait.until(ExpectedConditions.titleIs(eResult));
			Reporter.log("PASS : Expected Page is Displayed ", true);

		} catch (Exception e) {
			Reporter.log("FAIL : Expected Page is not Displayed ", true);

			Assert.fail();
		}
	}

}
