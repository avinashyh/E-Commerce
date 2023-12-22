package com.ecommerce.test;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ecommerce.generic.BaseTest;
import com.ecommerce.page.HomePage;
import com.ecommerce.page.SonyXperiaMobilePage;

public class SonyXperiaMobilePageTest extends BaseTest {
	@Test (priority = 2)
	public void testSonyXperiaMobilePage() throws Exception {

		SonyXperiaMobilePage sxm = new SonyXperiaMobilePage(driver);

		sxm.clickMobile1();
		// System.out.println(sxm.getListPrice());

		sxm.clickSonyXperiaDetail();
		// System.out.println(sxm.getDetailtPrice());

		try {
			assertEquals((sxm.getListPrice()), (sxm.getDetailtPrice()));
			Reporter.log("PASS : List Price is Equl to Display Price ", true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
