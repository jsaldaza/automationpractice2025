package co.com.automationpractice2025.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/create_account.feature",
        glue = "co.com.automationpractice2025.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"}
)
public class CreateAccountRunner {
}
