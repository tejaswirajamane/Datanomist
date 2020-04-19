package com.datanomist.stepdefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.datanomist.utils.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinationsForMoneyControl extends BaseClass {
	private WebDriver driver;

	@Given("^Open money control site\\.$")
	public void open_money_control_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./src/test/resource/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/");
		if (driver.getTitle().contains("Moneycontrol")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title not matched");
		}

	}

	@Then("^click on Most active shares\\.$")
	public void click_on_Most_active_shares() throws Throwable {
		WebElement mostActive = driver.findElement(By.linkText("Most Active"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mostActive);
		highlight(driver, mostActive);

	}

	@Then("^click on see all most Active link$")
	public void click_on_see_all_most_Active_link() throws Throwable {
		WebElement seeAllMostActive_Btn = driver.findElement(By.linkText("See all Most Active »"));
		highlight(driver, seeAllMostActive_Btn);
		seeAllMostActive_Btn.click();
		System.out.println("Clicked on see all Most Active link");
	}

	@Then("^verify it opens most Active stocks screen$")
	public void verify_it_opens_most_Active_stocks_screen() throws Throwable {
		if (driver.getTitle().contains("Most Active Stocks")) {
			System.out.println("Verifed that :User is on Active stock screen");

		} else {
			System.out.println("User is not on Active stock screen");
		}
	}

	@Then("^get data available in Most Actve stockes data table$")
	public void get_data_available_in_Most_Actve_stockes_data_table() throws Throwable {
		List<WebElement> tableValues = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(tableValues.size());
		for (WebElement value : tableValues) {
			System.out.println(value.getText());
		}
		driver.close();
	}
	
}
