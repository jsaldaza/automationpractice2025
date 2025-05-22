package co.com.automationpractice2025.questions.cart;

import co.com.automationpractice2025.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CartConfirmationMessage {
    public static Question<String> value() {
        return actor -> Text.of(CartPage.SUCCESS_MESSAGE).answeredBy(actor);
    }
}
