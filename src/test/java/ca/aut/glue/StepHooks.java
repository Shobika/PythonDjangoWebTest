package ca.aut.glue;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by Shoby on 2019-12-25
 **/

public class StepHooks {
    public static WebDriver driver;

    @Before
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void quitBrowser() {
        driver.quit();
    }
}