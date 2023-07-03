package tek.sdet.framework.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@paymentmethod",
		features = ("classpath:features"),
		glue ="tek.sdet.framework",
		dryRun = true,
		// if dryRun = true: Step definition will be ignored
		// if dryRun = False: step definition will be checked. 
		plugin = {
                "pretty",
                "html:target/htmlReports/cucumber-pretty.html",
                "json:target/jsonReports/cucumber.json"
		},
		  snippets = CAMELCASE,
		  monochrome = true
		)


public class TestRunner {
	


}
