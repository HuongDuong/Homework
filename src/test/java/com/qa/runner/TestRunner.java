package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty", "html:target/cucumber" ,
				"json:target/cucumber.json"},
		features= {"src/test/java/com/qa/features"}
		,glue={"com/qa/steps"},
		tags={"@createanaccount"}
		)

public class TestRunner {
	

}
