package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Success\\eclipse-workspace\\cucumberDemo\\"
+"Featurefiles\\CucumberHooks.feature",glue={"org.stepdefinition1","org.hooks"},dryRun=false)
public class StepRunner {

}
