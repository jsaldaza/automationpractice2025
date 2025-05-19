package co.com.automationpractice2025.stepdefinitions;

import co.com.automationpractice2025.builders.UserBuilder;
import co.com.automationpractice2025.models.UserModel;
import co.com.automationpractice2025.tasks.CreateAccount;
import co.com.automationpractice2025.utils.UserDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.automationpractice2025.questions.ValidateMyAccount.title;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class CreateAccountStepDefinitions {

    private final Actor juan = OnStage.theActorInTheSpotlight();
    private UserModel user;

    // Opción 1: Desde perfil JSON
    @Given("that Juan wants to create a new account using {string}")
    public void createUserFromProfile(String profileKey) {
        if ("randomUser".equalsIgnoreCase(profileKey)) {
            user = UserBuilder.defaultUser().build(); // correo único dinámico
        } else {
            user = UserDataReader.getUser(profileKey);
        }
        juan.attemptsTo(CreateAccount.registerNewUser(user));
    }

    // Opción 2: Sin parámetro (default user aleatorio)
    @Given("that Juan creates a new account")
    public void createDefaultUser() {
        user = UserBuilder.defaultUser().build();
        juan.attemptsTo(CreateAccount.registerNewUser(user));
    }

    @Then("he should see the My Account dashboard")
    public void shouldSeeAccountPage() {
        juan.should(
                seeThat(title(), equalToIgnoringCase("MY ACCOUNT"))
        );
    }
}
