package com.datanomist.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {

	public void takeScreenshot(WebDriver driver, String filename) {
		try {
			System.out.println("method called");
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./src/test/resource/screenshots/" + filename + ".jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void highlight(WebDriver driver, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='4px solid Red';arguments[0].style.background='pink'", element);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
