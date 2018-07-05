package test.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature/login.Feature",
		plugin = { "pretty", "html:target/cucumber-reports" },
		monochrome = true
	)
                 

public class TestRunner {

}
