package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = "stepdefinitions", dryRun = false, monochrome = false, strict = false, plugin={"pretty","html:target/cucumber","json:target/cucumberOutput/cucumber.json"} )
public class TestRunner {
}
