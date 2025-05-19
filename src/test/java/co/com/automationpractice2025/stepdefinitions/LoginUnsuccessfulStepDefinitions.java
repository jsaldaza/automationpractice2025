package co.com.automationpractice2025.stepdefinitions;

import co.com.automationpractice2025.interactions.OpenBrowser;
import co.com.automationpractice2025.questions.LoginErrorMessage;
import co.com.automationpractice2025.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginUnsuccessfulStepDefinitions {

    private final Actor juan = OnStage.theActorInTheSpotlight();

    @Given("that Juan wants to access the Automation Practice page")
    public void openLoginPage() {
        juan.attemptsTo(OpenBrowser.onAutomationPracticeHomePage());
    }

    @When("he logs in with invalid credentials")
    public void performLoginWithInvalidCredentials() {
        juan.attemptsTo(Login.withCredentials("invalid_user@mail.com", "wrongpassword"));
    }

    @Then("he should see an authentication error")
    public void shouldSeeAuthenticationError() {
        juan.should(
                seeThat(LoginErrorMessage.content(), equalTo("Authentication failed."))
        );
    }
}
