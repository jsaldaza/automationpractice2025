package co.com.automationpractice2025.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static co.com.automationpractice2025.userinterfaces.MyAccountPage.MY_ACCOUNT_HEADING;

public class ValidateMyAccount {

    public static Question<String> title() {
        return actor -> TextContent.of(MY_ACCOUNT_HEADING).answeredBy(actor);
    }
}
