package co.com.automationpractice2025.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser {

    public static Performable onAutomationPracticeHomePage() {
        return Open.url("http://www.automationpractice.pl/index.php");
    }
}
