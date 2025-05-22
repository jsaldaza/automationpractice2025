package co.com.automationpractice2025.stepdefinitions;

import co.com.automationpractice2025.questions.ValidateLoginMessage;
import co.com.automationpractice2025.tasks.login.EnterCredentials;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class LoginStepDefinitions {

    private final Actor juan = OnStage.theActorCalled("Juan");

    @Given("that Juan opens the login page")
    public void openLoginPage() {
        juan.wasAbleTo(
                // Aquí puedes navegar directamente al login o reutilizar un método
                EnterCredentials.openLoginPage());
    }

    @When("he enters valid credentials")
    public void entersValidCredentials() {
        juan.attemptsTo(EnterCredentials.with("test14@gmail.com", "123456"));
    }

    @When("he enters invalid credentials")
    public void entersInvalidCredentials() {
        juan.attemptsTo(EnterCredentials.with("fake@email.com", "wrongpass"));
    }

    @Then("he should see his account dashboard")
    public void shouldSeeAccountPage() {
        juan.should(seeThat(ValidateLoginMessage.accountTitle(), equalToIgnoringCase("My account")));
    }

    @Then("he should see an error message indicating login failure")
    public void shouldSeeLoginError() {
        juan.should(seeThat(ValidateLoginMessage.error(), containsString("Authentication failed")));
    }
}
