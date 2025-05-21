package co.com.automationpractice2025.stepdefinitions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

    @Before(order = 0)
    public void setTheStage() {
        OnStage.setTheStage(Cast.ofStandardActors());

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ThucydidesWebDriverSupport.useDriver(driver);

        Actor juan = OnStage.theActorCalled("Juan");
        juan.can(BrowseTheWeb.with(driver)); // ✅ Asignar la habilidad correctamente
    }

}
