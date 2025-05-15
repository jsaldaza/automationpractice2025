package co.com.automationpractice2025.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static co.com.automationpractice2025.userinterfaces.LoginPage.AUTHENTICATION_HEADER;

public class ValidateLoginDashboard {

    public static Question<String> authenticationErrorTitle() {
        return actor -> TextContent.of(AUTHENTICATION_HEADER).answeredBy(actor);
    }
}
