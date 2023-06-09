package hooksDemo;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\featureWithHooks\\hooks.feature",glue={"hooksDemo"},
monochrome = true,
plugin = {"pretty","json:target/JSONreport/report.json"
,"junit:target/JUnitreport/report.xml"
,"html:target/HtmlReport.html"}
)

public class HookRunner {

}
