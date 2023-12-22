package com.ecommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.ecommerce.generic.BaseTest;
import com.ecommerce.page.HomePage;

public class HomePageTest extends BaseTest {
	@Test (priority = 1)
	public void testHomePage() throws Exception {

		HomePage h = new HomePage(driver);

		h.verifyHomeTitle("THIS IS DEMO SITE FOR   ");
		h.clickMobile();
		h.verifyMobileTitle("MOBILE");
		new Select(driver.findElement(By.cssSelector("select[title=\"Sort By\"]"))).selectByVisibleText("Name");

	}
}
