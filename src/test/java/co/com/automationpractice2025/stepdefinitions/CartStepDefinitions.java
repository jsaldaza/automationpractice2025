package co.com.automationpractice2025.stepdefinitions;

import co.com.automationpractice2025.questions.cart.CartConfirmationMessage;
import co.com.automationpractice2025.tasks.cart.AddFirstProductToCart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class CartStepDefinitions {

    private final Actor juan = OnStage.theActorInTheSpotlight();

    @Given("that Juan is on the home page")
    public void openHomePage() {
        juan.wasAbleTo(net.serenitybdd.screenplay.actions.Open.url("http://automationpractice.pl/index.php")

        );
    }

    @When("he adds the first product to the cart")
    public void addProductToCart() {
        juan.attemptsTo(AddFirstProductToCart.untilProductIsReady());
    }

    @Then("he should see a confirmation message containing {string}")
    public void verifySuccessMessage(String expectedMessage) {
        juan.should(seeThat(CartConfirmationMessage.value(), containsString(expectedMessage)));
    }
}
