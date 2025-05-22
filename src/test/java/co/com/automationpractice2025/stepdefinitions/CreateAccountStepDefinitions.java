package co.com.automationpractice2025.stepdefinitions;

import co.com.automationpractice2025.builders.UserBuilder;
import co.com.automationpractice2025.models.UserModel;
import co.com.automationpractice2025.tasks.account.FillOutPersonalInfo;
import co.com.automationpractice2025.tasks.account.NavigateToRegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.automationpractice2025.questions.ValidateMyAccount.title;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class CreateAccountStepDefinitions {

    private UserModel user;

    @Given("that Juan wants to create a new account using {string}")
    public void createUserFromProfile(String profileKey) {
        Actor juan = OnStage.theActorInTheSpotlight();

        if ("randomUser".equalsIgnoreCase(profileKey)) {
            user = UserBuilder.defaultUser().build();
        } else {
            user = co.com.automationpractice2025.utils.UserDataReader.getUser(profileKey);
        }

        juan.attemptsTo(NavigateToRegistrationPage.using(user), FillOutPersonalInfo.using(user));
    }

    @Given("that Juan creates a new account")
    public void createDefaultUser() {
        Actor juan = OnStage.theActorInTheSpotlight();
        user = UserBuilder.defaultUser().build();

        juan.attemptsTo(NavigateToRegistrationPage.using(user), FillOutPersonalInfo.using(user));
    }

    @Then("he should see the My Account dashboard")
    public void shouldSeeAccountPage() {
        Actor juan = OnStage.theActorInTheSpotlight();
        juan.should(seeThat(title(), equalToIgnoringCase("MY ACCOUNT")));
    }
}
