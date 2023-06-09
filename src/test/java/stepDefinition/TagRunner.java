package stepDefinition;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features="src/test/resources/featureWithTags/tags.feature",
					glue={"stepDefinition"},
					plugin = {"json:target/cucumber.json"},
					tags = "@smoke or @regression"

				)
public class TagRunner {

}
