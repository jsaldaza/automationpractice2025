package co.com.automationpractice2025.tasks.login;

import co.com.automationpractice2025.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class EnterCredentials implements Task {

    private final String email;
    private final String password;

    public EnterCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static EnterCredentials with(String email, String password) {
        return Tasks.instrumented(EnterCredentials.class, email, password);
    }

    public static Task openLoginPage() {
        return Task.where("{0} opens the login page",
                Open.browserOn().the(LoginPage.class),
                Click.on(LoginPage.SIGN_IN_LINK)
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(LoginPage.EMAIL_INPUT),
                Enter.theValue(password).into(LoginPage.PASSWORD_INPUT),
                Click.on(LoginPage.SIGN_IN_BUTTON)
        );
    }
}
