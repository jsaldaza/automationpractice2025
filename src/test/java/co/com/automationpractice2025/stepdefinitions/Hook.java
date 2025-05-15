package co.com.automationpractice2025.stepdefinitions;

import co.com.automationpractice2025.utils.Utilities;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

public class Hook {

    @Before
    public void setScenario() {
        System.out.println("[HOOK] Starting browser via Serenity WebDriver Manager...");
        WebDriver driver = getWebdriverManager().getWebdriver(Utilities.getDriver());
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
    }
}
