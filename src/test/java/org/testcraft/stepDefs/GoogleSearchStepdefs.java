package org.testcraft.stepDefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class GoogleSearchStepdefs {

    private WebDriver driver;

    @Given("Im on google main page")
    public void Im_on_google_main_page() {
        driver = Hooks.driver;
        driver.get("http://www.google.co.uk");
    }
}
