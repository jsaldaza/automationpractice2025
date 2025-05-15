package co.com.automationpractice2025.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.SUCCESS_ALERT;


public class ValidateMyAccount {

    public static Question<String> title() {
        return new Question<String>() {
            @Override
            public String answeredBy(Actor actor) {
                String text = TextContent.of(SUCCESS_ALERT).answeredBy(actor);
                //System.out.println("[DEBUG] Texto capturado en h1: " + text);

                return text;
            }
        };
    }
}
