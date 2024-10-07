package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/features" ,glue = "stepDefinations" , dryRun = false, tags = "@SIGNIN", plugin = {"html:target/cucumber-html-report"})
public class TestRunner {

}
