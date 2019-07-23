import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", strict =true, dryRun = false
                 , format = {"pretty", "html:target/Reports"} )
public class Run {
}
