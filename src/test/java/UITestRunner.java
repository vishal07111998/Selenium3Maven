import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(strict = true,
        features = {"src/test/resources/feature/webUI"},
        glue = "com.test.stepDefinitions")
public class UITestRunner extends AbstractTestNGCucumberTests {
}
