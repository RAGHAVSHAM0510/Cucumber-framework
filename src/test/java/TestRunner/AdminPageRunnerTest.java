package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
			(
			features = "src/test/java/Features/TC_002_OrangeHRM_AdminPageFunctionality.feature", 
			glue = "Steps"
			)

public class AdminPageRunnerTest extends AbstractTestNGCucumberTests {

}
