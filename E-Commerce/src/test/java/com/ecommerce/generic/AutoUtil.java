package com.ecommerce.generic;

import java.io.File;
import java.util.*;
import java.io.FileInputStream;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class AutoUtil implements IAutoConstant {

	public static String getProperty(String path, String key) {
		String v = " ";
		try {

			Properties p = new Properties();
			p.load(new FileInputStream(path));
			v = p.getProperty(key);

		} catch (Exception e) {

		}
		return v;

	}

	public static void getPhoto(WebDriver driver, String folder, String testName) {

		try {
			String dateTime = new Date().toString().replaceAll(":", "-");
			String path = folder + testName + dateTime + ".png";

			TakesScreenshot t = (TakesScreenshot) driver;
			File srcFile = t.getScreenshotAs(OutputType.FILE);
			File destFile = new File(path);
			FileUtils.copyFile(srcFile, destFile);
		} catch (Exception e) {

		}

	}
}
