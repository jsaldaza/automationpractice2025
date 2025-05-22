package co.com.automationpractice2025.userinterfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@DefaultUrl("http://automationpractice.pl/index.php")
public class LoginPage extends PageObject {
    public static final Target SIGN_IN_BUTTON = Target.the("Sign in button").located(By.xpath("(//span[normalize-space()='Sign in'])[1]"));
    public static final Target SIGN_IN_LINK = Target.the("Sign in link").located(By.xpath("(//a[normalize-space()='Sign in'])[1]"));
    public static final Target EMAIL_INPUT = Target.the("Email input field").located(By.id("email"));
    public static final Target PASSWORD_INPUT = Target.the("Password input field").located(By.id("passwd"));
    public static final Target ACCOUNT_TITLE = Target.the("Account title").located(By.cssSelector("h1"));
    public static final Target ERROR_MESSAGE = Target.the("Authentication failed message").located(By.cssSelector(".alert.alert-danger li"));
}
