package com.datanomist.stepdefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.datanomist.utils.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class StepDefinationForFacebook extends BaseClass {
	private WebDriver driver;

	@Given("^Open Facebook login page$")
	public void open_Facebook_login_page() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	@Then("^verify title of login page$")
	public void verify_title_of_login_page() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals("Facebook – log in or sign up", title);

	}

	@Then("^validate all the values present in Year dropdown$")
	public void validate_all_the_values_present_in_Year_dropdown() throws Throwable {
		WebElement yearDropDown = (driver.findElement(By.xpath("//select[@name='birthday_year']")));
		highlight(driver, yearDropDown);
		Select select = new Select(yearDropDown);
		List<WebElement> allValues = select.getOptions();
		System.out.println(allValues.size());

		for (int i = 0; i < allValues.size(); i++) {
			System.out.println(allValues.get(i).getText());
		}

	}

	@Then("^Verify that \"([^\"]*)\" is available or not if yes select it$")
	public void verify_that_is_available_or_not_if_yes_select_it(String year) throws Throwable {
		WebElement yearDropDown = (driver.findElement(By.xpath("//select[@name='birthday_year']")));
		yearDropDown.click();
		Select select = new Select(yearDropDown);
		List<WebElement> allValues = select.getOptions();
		System.out.println(allValues.size());

		for (int i = 0; i < allValues.size(); i++) {
			if (allValues.get(i).getText().equals(year)) {
				System.out.println(year + "is present in year dropdown");
				select.selectByVisibleText(year);
				highlight(driver, yearDropDown);
				Thread.sleep(4000);
				System.out.println(year + "value is selected");
				takeScreenshot(driver, year + "Value selected");
				yearDropDown.click();

			}

		}
		driver.close();
	}

}
