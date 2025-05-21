
package co.com.automationpractice2025.stepdefinitions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hook {

    @Before(order = 0)
    public void setTheStage() {
        OnStage.setTheStage(Cast.ofStandardActors());

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        // Detecta si está corriendo en un entorno CI (como GitHub Actions)
        String isCI = System.getenv("CI");

        if ("true".equalsIgnoreCase(isCI)) {
            options.addArguments("--headless=new");
            options.addArguments("--window-size=1920,1080");
        } else {
            options.addArguments("--start-maximized"); // Solo aplica localmente
        }

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");

        WebDriver driver = new ChromeDriver(options);
        ThucydidesWebDriverSupport.useDriver(driver);
        OnStage.theActorCalled("Juan").can(BrowseTheWeb.with(driver));
    }
}
