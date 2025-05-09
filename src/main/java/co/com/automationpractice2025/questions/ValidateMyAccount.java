package co.com.automationpractice2025.questions;

import co.com.automationpractice2025.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidateMyAccount {

    public static Question<String> title() {
        return new Question<String>() {
            @Override
            public String answeredBy(Actor actor) {
                String text = TextContent.of(LoginPage.ACCOUNT_HEADER).answeredBy(actor);
                System.out.println("[DEBUG] Texto capturado en h1: " + text);
                return text;
            }
        };
    }
}
