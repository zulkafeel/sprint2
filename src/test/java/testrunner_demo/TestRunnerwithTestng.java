package testrunner_demo;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"json:target/cucumber.json"},
features="C:\\salenium practice\\com.sprint2.demo\\target\\test-classes\\featurefiles",
glue={"stepdefination_demo"}
//tags={"@unsuccessful_registration1"}
		
)

public class TestRunnerwithTestng extends AbstractTestNGCucumberTests{

}
