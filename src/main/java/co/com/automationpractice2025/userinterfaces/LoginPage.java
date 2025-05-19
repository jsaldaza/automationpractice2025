package co.com.automationpractice2025.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class LoginPage extends PageObject {

    public static final Target SIGN_IN_BUTTON = Target.the("Sign in button")
            .located(By.className("login"));

    public static final Target EMAIL_INPUT = Target.the("email input field")
            .located(By.id("email"));

    public static final Target PASSWORD_INPUT = Target.the("password input field")
            .located(By.id("passwd"));

    public static final Target SUBMIT_BUTTON = Target.the("sign in submit button")
            .located(By.id("SubmitLogin"));

    public static final Target ERROR_MESSAGE = Target.the("authentication error message")
            .located(By.cssSelector(".alert.alert-danger li"));


}
