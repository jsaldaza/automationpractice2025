package co.com.automationpractice2025.tasks.account;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.FEMALE_RADIO_BUTTON;
import static co.com.automationpractice2025.userinterfaces.CreateAccountPage.MALE_RADIO_BUTTON;

public class SelectGender {
    public static Performable by(String gender) {
        return Task.where("{0} selects gender",
                "male".equalsIgnoreCase(gender)
                        ? Click.on(MALE_RADIO_BUTTON)
                        : Click.on(FEMALE_RADIO_BUTTON)
        );
    }
}
