package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,  //more readable console
		plugin = {"pretty",  // step execution details
				"rerun:target/failed_scenarios.txt"
//				"html:target/reports/HtmlReport.html",   //html report
//				"json:target/reports/Report.json",       // json report
//				"usage:target/reports/usageReport",		//usagereport
//				"junit:target/reports/junitreport.xml",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}  	
		)

public class GooglePageRunner {



}
