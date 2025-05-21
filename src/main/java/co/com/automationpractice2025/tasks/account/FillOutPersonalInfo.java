package co.com.automationpractice2025.tasks.account;

import co.com.automationpractice2025.models.UserModel;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.DAY_DROPDOWN;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.FIRST_NAME;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.LAST_NAME;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.MONTH_DROPDOWN;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.PASSWORD;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.REGISTER_BUTTON;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.YEAR_DROPDOWN;
import static co.com.automationpractice2025.userinterfaces.MyAccountPage.MY_ACCOUNT_HEADING;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillOutPersonalInfo {
    public static Performable using(UserModel user) {
        return Task.where("{0} completes the personal info form",
                SelectGender.by(user.getGender()),
                Enter.theValue(user.getFirstName()).into(FIRST_NAME),
                Enter.theValue(user.getLastName()).into(LAST_NAME),
                Enter.theValue(user.getPassword()).into(PASSWORD),
                SelectFromOptions.byValue(user.getBirthDay()).from(DAY_DROPDOWN),
                SelectFromOptions.byValue(user.getBirthMonth()).from(MONTH_DROPDOWN),
                SelectFromOptions.byValue(user.getBirthYear()).from(YEAR_DROPDOWN),
                Click.on(REGISTER_BUTTON),
                WaitUntil.the(MY_ACCOUNT_HEADING, isVisible()).forNoMoreThan(15).seconds()
        );
    }
}
