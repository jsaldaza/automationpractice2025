package co.com.automationpractice2025.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target SIGN_IN_BUTTON = Target.the("sign in button")
            .located(By.className("login"));
    public static final Target EMAIL_INPUT = Target.the("email field")
            .located(By.id("email"));
    public static final Target PASSWORD_INPUT = Target.the("password field")
            .located(By.id("passwd"));
    public static final Target SUBMIT_BUTTON = Target.the("submit login")
            .located(By.id("SubmitLogin"));
    public static final Target ACCOUNT_HEADER = Target.the("account title")
            .located(By.cssSelector("h1"));
}
