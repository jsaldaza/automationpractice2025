import co.com.automationpractice2025.utils.Utilities;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

@RunWith(SerenityRunner.class)
public class HelloWorldOpenBrowserTest {

    private Actor juan;

    @Before
    public void setUp() {
        WebDriver driver = getWebdriverManager().getWebdriver(Utilities.getDriver());
        OnStage.setTheStage(new Cast());
        juan = OnStage.theActorCalled("Juan");
        juan.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void openGooglePage() {
        juan.attemptsTo(Open.url("https://www.google.com"));
    }
}
