package com.ecommerce.page;

import com.ecommerce.generic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerifyErrorMessagePage extends BasePage {

	@FindBy(linkText = "MOBILE")
	private WebElement mobile;

	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/button/span/span")
	private WebElement addCart;

	@FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")
	private WebElement qty;
	// *[@id="shopping-cart-table"]/tbody/tr/td[4]/input

	@FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button/span/span")
	private WebElement update;
	// *[@id="shopping-cart-table"]/tbody/tr/td[4]/button/span/span

	@FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p")
	private WebElement errMSG;
	// *[@id="shopping-cart-table"]/tbody/tr/td[2]/p

	@FindBy(xpath = "//*[@id=\"empty_cart_button\"]/span/span")
	private WebElement emptyCart;
	// *[@id="empty_cart_button"]/span/span

	@FindBy(xpath = "//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[1]/h1")
	private WebElement shoppingCartEmpty;
	// *[@id="empty_cart_button"]/span/span

	public VerifyErrorMessagePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void clickMobile1() {
		mobile.click();

	}

	public void addToCart() {
		addCart.click();

	}

	public void addQty(String number) {
		qty.sendKeys(number);

	}

	public void updateCart() {
		update.click();

	}

	public String errorMessage() {
		return errMSG.getText();
	}

	public void emptyCart() {
		emptyCart.click();

	}

	public String shoppingCartMessage() {
		return shoppingCartEmpty.getText();
	}
}
