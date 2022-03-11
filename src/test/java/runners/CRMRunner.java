package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//taggedfeatures",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,  
		plugin = {"html:target/reports/HtmlReport.html"},
		//tags = "@RegressionTest"
		//tags = "@RegressionTest or @SmokeTest"
		//tags = "@RegressionTest and not @SmokeTest"
		//tags = "not @RegressionTest"
		tags = "@PhaseOne and @RegressionTest"
		)

public class CRMRunner {

}
