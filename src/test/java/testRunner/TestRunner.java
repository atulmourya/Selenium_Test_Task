package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/Feature"
				,glue={"stepDefination"},
				//monochrome = true,
				plugin = {"pretty","html:target/Html-Reports/"},
				strict = true
				)
 
public class TestRunner {
 
}