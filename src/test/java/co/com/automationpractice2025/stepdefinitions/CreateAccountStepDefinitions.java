package co.com.automationpractice2025.stepdefinitions;

import co.com.automationpractice2025.builders.UserBuilder;
import co.com.automationpractice2025.models.UserModel;
import co.com.automationpractice2025.questions.ValidateMyAccount;
import co.com.automationpractice2025.tasks.CreateAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class CreateAccountStepDefinitions {

    private final Actor juan = OnStage.theActorCalled("Juan");
    private final UserModel user = UserBuilder.defaultUser().build();

    @Given("that Juan wants to create a new user account")
    public void openCreateAccountPage() {
        juan.attemptsTo(CreateAccount.goToRegistrationPage(user));
    }

    @When("he submits the registration form with valid personal information")
    public void fillOutRegistrationForm() {
        juan.attemptsTo(CreateAccount.withPersonalData(user));
    }

    @Then("he should see the My Account dashboard")
    public void shouldSeeMyAccountPage() {
        juan.should(seeThat(ValidateMyAccount.title(), containsString("Your account has been created")));
    }
}
