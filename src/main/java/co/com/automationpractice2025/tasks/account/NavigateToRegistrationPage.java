package co.com.automationpractice2025.tasks.account;

import co.com.automationpractice2025.interactions.OpenBrowser;
import co.com.automationpractice2025.models.UserModel;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.ACCOUNT_FORM;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.CREATE_ACCOUNT_BUTTON;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.EMAIL_CREATE_FIELD;
import static co.com.automationpractice2025.userinterfaces.LoginPage.SIGN_IN_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateToRegistrationPage {
    public static Performable using(UserModel user) {
        return Task.where("{0} navigates to the registration page and submits email",
                OpenBrowser.onAutomationPracticeHomePage(),
                Click.on(SIGN_IN_BUTTON),
                Enter.theValue(user.getEmail()).into(EMAIL_CREATE_FIELD),
                Click.on(CREATE_ACCOUNT_BUTTON),
                WaitUntil.the(ACCOUNT_FORM, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
