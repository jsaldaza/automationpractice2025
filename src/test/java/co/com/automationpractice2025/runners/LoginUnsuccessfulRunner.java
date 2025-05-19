package co.com.automationpractice2025.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login_unsuccessful.feature",
        glue = "co.com.automationpractice2025.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginUnsuccessfulRunner {
}
