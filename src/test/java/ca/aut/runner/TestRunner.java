package ca.aut.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * created by Shoby on 2019-12-25
 **/

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "ca.aut.glue")
public class TestRunner {
}
