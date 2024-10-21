package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features",
        glue = {"StepDefinition"},
        tags = "",
        plugin = {"pretty"},
        publish = true)
public class runner extends AbstractTestNGCucumberTests {

}
