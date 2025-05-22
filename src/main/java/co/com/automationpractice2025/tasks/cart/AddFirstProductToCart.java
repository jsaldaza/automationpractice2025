package co.com.automationpractice2025.tasks.cart;

import co.com.automationpractice2025.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AddFirstProductToCart implements Task {

    public static AddFirstProductToCart untilProductIsReady() {
        return Tasks.instrumented(AddFirstProductToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CartPage.WOMEN_MENU, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CartPage.WOMEN_MENU),
                WaitUntil.the(CartPage.BLOUSE_PRODUCT_IMAGE, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CartPage.BLOUSE_PRODUCT_IMAGE),
                Click.on(CartPage.PRODUCT_WHITE_OPTION), // Espera removida para simplificar
                WaitUntil.the(CartPage.ADD_TO_CART_BUTTON, isClickable()).forNoMoreThan(15).seconds(),
                Click.on(CartPage.ADD_TO_CART_BUTTON)
        );
    }
}
