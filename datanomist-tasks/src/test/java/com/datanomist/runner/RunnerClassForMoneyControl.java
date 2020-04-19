package com.datanomist.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/com/datanomist/feature/MoneyControl.feature", 								
		glue = { "com.datanomist.stepdefinations" },
		format = { "pretty", "html:test-output" }, 
		monochrome = true, 
		strict = true, 
		dryRun = false) 

public class RunnerClassForMoneyControl {

}
