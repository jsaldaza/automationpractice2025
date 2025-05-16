package co.com.automationpractice2025.stepdefinitions;

import co.com.automationpractice2025.interactions.OpenBrowser;
import co.com.automationpractice2025.questions.ValidateLoginDashboard;
import co.com.automationpractice2025.tasks.Login;
import co.com.automationpractice2025.userinterfaces.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.containsString;

public class LoginUnsuccessfulStepDefinitions {

    private final Actor juan = OnStage.theActorCalled("Juan");

    @Given("that Juan wants to access the Automation Practice page")
    public void openLoginPage() {
        juan.attemptsTo(OpenBrowser.ofautomationpracticeTest());
    }

    @When("he logs in with invalid credentials")
    public void performLoginWithInvalidCredentials() {
        juan.attemptsTo(Login.withCredentials("invalid_user@mail.com", "wrongpassword"));
    }

    @Then("he should see an authentication error")
    public void shouldSeeAuthenticationError() {
        juan.attemptsTo(
                WaitUntil.the(LoginPage.AUTHENTICATION_HEADER, isVisible()).forNoMoreThan(10).seconds()
        );

        juan.should(
                seeThat(ValidateLoginDashboard.authenticationErrorTitle(), containsString("Authentication"))
        );
    }
}
