package co.com.automationpractice2025.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.SUCCESS_ALERT;

public class ValidateMyAccount {

    public static Question<String> title() {
        return actor -> TextContent.of(SUCCESS_ALERT).answeredBy(actor);
    }
}
