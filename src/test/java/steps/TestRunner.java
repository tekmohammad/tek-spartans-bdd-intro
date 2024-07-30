package steps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//cucumber-junit 4 implementation
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:feature/MyFirstFeature.feature",
        glue = "steps"
)
public class TestRunner {
}
