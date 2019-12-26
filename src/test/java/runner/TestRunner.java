package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Features", // path to feature files
glue = { "stepDefinitions" }, // path to step definitions 
tags = {"@SDET-7"}, // tags to run on feature level or scenario level
dryRun = false, // if false: check if all the steps in feature file has steps in step definitions
monochrome = true, // display the console output in readable way
strict = false, // if set to false will fail if there are pending or undefined steps.
format = {
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun.txt"
},plugin = "json:target/cucumber-reports/CucumberTestReport.json")


public class TestRunner {
	
	
	
	
	//This is the first GIT changes
	
	
	
	
	
	
	
	

}
