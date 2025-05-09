package co.com.automationpractice2025.interactions;

import co.com.automationpractice2025.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WaitForAccountPage {

    public static Performable toLoad() {
        return WaitUntil.the(LoginPage.ACCOUNT_HEADER, isVisible()).forNoMoreThan(10).seconds();
    }
}
