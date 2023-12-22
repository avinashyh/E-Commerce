package com.ecommerce.page;

import com.ecommerce.generic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SonyXperiaMobilePage extends BasePage {

	@FindBy(linkText = "MOBILE")
	private WebElement mobile;

	@FindBy(css = "#product-price-1 > span.price")
	private WebElement listPagePrice;

	// cssSelector("#product-price-1 > span.price"))

	@FindBy(id = "product-collection-image-1")
	private WebElement SonyXperiaDetail;
	// id("product-collection-image-1")

	@FindBy(css = "span.price")
	private WebElement detailPagePrice;
	// cssSelector("span.price")

	public SonyXperiaMobilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void clickMobile1() {
		mobile.click();

	}

	public String getListPrice() {
		return listPagePrice.getText();

	}

	public void clickSonyXperiaDetail() {
		SonyXperiaDetail.click();
	}

	public String getDetailtPrice() {
		return detailPagePrice.getText();
	}

}
