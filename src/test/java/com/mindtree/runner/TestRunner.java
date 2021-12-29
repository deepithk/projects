package com.mindtree.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "resources",
		glue = "com.mindtree.stepDefinationSteps")
public class TestRunner {

}