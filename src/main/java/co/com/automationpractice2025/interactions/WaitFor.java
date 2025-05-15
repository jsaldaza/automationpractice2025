package co.com.automationpractice2025.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitFor implements Interaction {

    private final int seconds;

    public WaitFor(int seconds) {
        this.seconds = seconds;
    }

    public static WaitFor seconds(int seconds) {
        return instrumented(WaitFor.class, seconds);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
