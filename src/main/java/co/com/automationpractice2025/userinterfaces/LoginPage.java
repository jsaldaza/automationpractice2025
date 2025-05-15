package co.com.automationpractice2025.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class LoginPage extends PageObject {

    public static final Target SIGN_IN_BUTTON = Target.the("Sign in button")
            .located(By.className("login"));

    public static final Target EMAIL_CREATE_FIELD = Target.the("email create field")
            .located(By.id("email_create"));

    public static final Target CREATE_ACCOUNT_BUTTON = Target.the("Create an account button")
            .located(By.id("SubmitCreate"));

    public static final Target EMAIL_INPUT = Target.the("email input field")
            .located(By.id("email"));

    public static final Target PASSWORD_INPUT = Target.the("password input field")
            .located(By.id("passwd"));

    public static final Target SUBMIT_BUTTON = Target.the("sign in submit button")
            .located(By.id("SubmitLogin"));

    public static final Target ACCOUNT_HEADERI = Target.the("account dashboard header")
            .located(By.cssSelector("h1"));

    public static final Target ACCOUNT_HEADER = Target.the("account validation")
            .locatedBy("//h1[normalize-space()='Create an account']");
    //h1[normalize-space()='Create an account']
}
