package com.ecommerce.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ecommerce.generic.BasePage;

public class HomePage extends BasePage {

	@FindBy(css = "h2")
	private WebElement verifyHomeTitle;

	@FindBy(linkText = "MOBILE")
	private WebElement mobile;

	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div[1]/div[1]")
	private WebElement verifyMobileTitle;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void verifyHomeTitle(String eText) {
		verifyText(verifyHomeTitle, eText);

	}

	public void verifyText(WebElement e1, String eText) {
		String aText = e1.getText();
		Assert.assertEquals(aText, eText);
	}

	public void clickMobile() {
		mobile.click();
	}

	public void verifyMobileTitle(String e1Text) {
		verifyText1(verifyMobileTitle, e1Text);
	}

	public void verifyText1(WebElement e1, String e1Text) {
		String a1Text = e1.getText();
		Assert.assertEquals(a1Text, e1Text);
	}

}
