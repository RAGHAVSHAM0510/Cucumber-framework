package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
			(
			features="src/test/java/Features/TC_001_OrangeHRM_PIMPageFunctionality.feature",
			glue="Steps"
					)
public class PIMPageRunnerTest extends AbstractTestNGCucumberTests{

}
