
package co.com.automationpractice2025.questions;

import co.com.automationpractice2025.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateLoginMessage {

    public static Question<String> accountTitle() {
        return Question.about("the account title").answeredBy(
            actor -> Text.of(LoginPage.ACCOUNT_TITLE).answeredBy(actor)
        );
    }

    public static Question<String> error() {
        return Question.about("the login error message").answeredBy(
            actor -> Text.of(LoginPage.ERROR_MESSAGE).answeredBy(actor)
        );
    }
}
