package cucumberTest;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature/LoginTest.feature", //path of featues folder
		glue = {"StepDefinition"}, //glue should contain the path of step definition package
//		dryRun = true,  //checks if all the steps in feature file has step definition when set to true
		monochrome = true //makes console output much more readable when set to true
//		tag= {} //tag can be added in feature file to run
		)

public class TestRunner {

}
