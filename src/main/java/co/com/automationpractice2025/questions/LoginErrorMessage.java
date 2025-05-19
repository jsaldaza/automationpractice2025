package co.com.automationpractice2025.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static co.com.automationpractice2025.userinterfaces.LoginPage.ERROR_MESSAGE;

public class LoginErrorMessage {

    public static Question<String> content() {
        return Question.about("the login error message")
                .answeredBy(actor -> TextContent.of(ERROR_MESSAGE).answeredBy(actor));
    }
}
