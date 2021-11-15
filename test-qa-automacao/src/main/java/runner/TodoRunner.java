package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/todo.cadastrar.feature",
        glue = {"steps"},
        monochrome = true,
        plugin = {"pretty", "html:target/reports/todo_report.html"}

)
public class TodoRunner {
}
