package co.com.automationpractice2025.stepdefinitions;

import co.com.automationpractice2025.builders.UserBuilder;
import co.com.automationpractice2025.interactions.WaitForAccountPage;
import co.com.automationpractice2025.models.UserModel;
import co.com.automationpractice2025.questions.ValidateMyAccount;
import co.com.automationpractice2025.tasks.CreateAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class CreateAccountStepDefinitions {

    private final Actor juan = OnStage.theActorCalled("Juan");
    private final UserModel user = UserBuilder.defaultUser().build();

    @Given("that Juan creates a new account")
    public void createNewAccount() {
        juan.attemptsTo(
                CreateAccount.registerNewUser(user)
        );
    }

    @Then("he should see the My Account dashboard")
    public void shouldSeeMyAccountPage() {
        juan.attemptsTo(
                WaitForAccountPage.toLoad()
        );
        juan.should(
                seeThat(ValidateMyAccount.title(), containsString("account"))
        );
    }
}
