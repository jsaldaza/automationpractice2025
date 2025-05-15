package co.com.automationpractice2025.tasks;

import co.com.automationpractice2025.interactions.OpenBrowser;
import co.com.automationpractice2025.interactions.WaitFor;
import co.com.automationpractice2025.models.UserModel;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.ACCOUNT_FORM;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.CREATE_ACCOUNT_BUTTON;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.DAY_DROPDOWN;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.EMAIL_CREATE_FIELD;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.FEMALE_RADIO_BUTTON;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.FIRST_NAME;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.LAST_NAME;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.MALE_RADIO_BUTTON;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.MONTH_DROPDOWN;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.PASSWORD;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.REGISTER_BUTTON;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.YEAR_DROPDOWN;
import static co.com.automationpractice2025.userinterfaces.LoginPage.SIGN_IN_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateAccount {

    public static Task goToRegistrationPage(UserModel user) {
        return Task.where("{0} opens the registration form",
                OpenBrowser.ofautomationpracticeTest(),
                Click.on(SIGN_IN_BUTTON),
                Enter.theValue(user.getEmail()).into(EMAIL_CREATE_FIELD),
                Click.on(CREATE_ACCOUNT_BUTTON),
                WaitUntil.the(ACCOUNT_FORM, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static Task withPersonalData(UserModel user) {
        return Task.where("{0} fills out the form",
                Task.where("{0} selects gender",
                        actor -> {
                            if (user.getGender().equalsIgnoreCase("male")) {
                                actor.attemptsTo(Click.on(MALE_RADIO_BUTTON));
                            } else {
                                actor.attemptsTo(Click.on(FEMALE_RADIO_BUTTON));
                            }
                        }
                ),
                Enter.theValue(user.getFirstName()).into(FIRST_NAME),
                Enter.theValue(user.getLastName()).into(LAST_NAME),
                Enter.theValue(user.getPassword()).into(PASSWORD),
                SelectFromOptions.byValue(user.getBirthDay()).from(DAY_DROPDOWN),
                SelectFromOptions.byValue(user.getBirthMonth()).from(MONTH_DROPDOWN),
                SelectFromOptions.byValue(user.getBirthYear()).from(YEAR_DROPDOWN),
                Click.on(REGISTER_BUTTON),
                WaitFor.seconds(6)
        );
    }
}
