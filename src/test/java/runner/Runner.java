package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",
                 },
        features="src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@test",
        dryRun = false


)
public class Runner {

}
