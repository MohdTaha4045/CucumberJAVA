package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureWithBackground\\background.feature",
glue={"stepDefinition"},
monochrome = true,
plugin = {"pretty","json:target/JSONreport/report.json"
,"junit:target/JUnitreport/report.xml"
,"html:target/HtmlReport.html"}
)

public class backgroundRunner {

}
