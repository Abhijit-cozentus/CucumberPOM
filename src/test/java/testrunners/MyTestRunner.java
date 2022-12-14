package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/Features"},
		glue= {"stepdefinitions","AppHooks"},
		plugin={"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/cucumber-reports/cucumber-html-report.html",
				"junit:target/cucumber-reports/report.xml",
				"json:target/cucumber-reports/report.json"}

		)


public class MyTestRunner {

}
