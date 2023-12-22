
package com.ecommerce.test;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ecommerce.generic.BaseTest;
import com.ecommerce.page.HomePage;
import com.ecommerce.page.VerifyErrorMessagePage;

public class VerifyErrorMessagePageTest extends BaseTest {
	@Test(priority = 3)
	public void testVerifyMessagePage() throws Exception {

		VerifyErrorMessagePage vmp = new VerifyErrorMessagePage(driver);

		vmp.clickMobile1();
		vmp.addToCart();
		//vmp.clearQty();
		vmp.addQty("1000");
		vmp.updateCart();
		vmp.errorMessage();
		String errorMessage1 = "* The maximum quantity allowed for purchase is 500";

		// * The maximum quantity allowed for purchase is 500.
		vmp.emptyCart();
		vmp.shoppingCartMessage();
		String ShoppingCartMessage = "SHOPPING CART IS EMPTY";

		try {
			assertEquals(vmp.errorMessage(), errorMessage1);
			Reporter.log("PASS : ", true);

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			assertEquals(vmp.shoppingCartMessage(), ShoppingCartMessage);
			Reporter.log("PASS : ", true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
