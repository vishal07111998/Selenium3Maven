import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(strict = true,
        features = {"src/test/resources/feature/webUI"},
        glue = "com.test.stepDefinitions",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports"},
        monochrome = true)
public class UITestRunner extends AbstractTestNGCucumberTests {
}
