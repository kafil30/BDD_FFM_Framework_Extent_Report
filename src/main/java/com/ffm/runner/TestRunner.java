package com.ffm.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src\\main\\java\\com\\ffm\\features",//The path of the features files
		
		glue = {"com\\ffm\\stepDefinitions"}, //The path of the step definitions classes
		
		monochrome = true,//Boolean type, it displays the console output in a proper readable format	
		
		strict = true,//It will check if any step is missing	
		
		dryRun = false,//To check the mapping is proper between feature files and step definition classes
		
		plugin = {"pretty","json:SimpleReporting/cucumber.json"}//It will generate a simple report on json format
						
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
