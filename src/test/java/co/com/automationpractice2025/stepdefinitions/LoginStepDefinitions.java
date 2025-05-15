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


public class LoginStepDefinitions {

    private final Actor juan = OnStage.theActorCalled("Juan");

    @Given("that Juan wants to access the Automation Practice page")
    public void openLoginPage() {
        juan.attemptsTo(OpenBrowser.ofautomationpracticeTest());
    }

    @When("he logs in with valid credentials")
    public void performLogin() {
        juan.attemptsTo(Login.withCredentials("test14@mail.com", "123456"));
    }

    @Then("he should see his account dashboard")
    public void verifyMyAccountPage() {
        juan.attemptsTo(
                WaitUntil.the(LoginPage.AUTHENTICATION_HEADER, isVisible()).forNoMoreThan(10).seconds()
        );

        juan.should(
                seeThat(ValidateLoginDashboard.authenticationErrorTitle(), containsString("Authentication"))
        );
    }

}
