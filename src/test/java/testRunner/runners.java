package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/main/resources/Feature",

        glue = {"stepDefs"},

        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

//            tags = "@smoke"

        monochrome = true
)

public class runners extends AbstractTestNGCucumberTests {
}
