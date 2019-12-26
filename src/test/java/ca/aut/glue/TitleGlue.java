package ca.aut.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.formatter.model.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by Shoby on 2019-12-25
 **/

public class TitleGlue {

    @Given("launch the webpage")
    public void launch(){
         StepHooks.driver.get("http://127.0.0.1:8000/");
        StepHooks.driver.manage().window().maximize();
    }
    @Then("validate the title '(.*)'")
    public void validateTitle(String title){
        Assert.assertEquals(title, StepHooks.driver.getTitle());
    }
}
