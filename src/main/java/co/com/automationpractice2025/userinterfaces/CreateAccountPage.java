package co.com.automationpractice2025.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccountPage {

    public static final Target MALE_RADIO_BUTTON = Target.the("Mr. gender radio button").located(By.id("id_gender1"));
    public static final Target FEMALE_RADIO_BUTTON = Target.the("Mrs. gender radio button").located(By.id("id_gender2"));
    public static final Target ACCOUNT_FORM = Target.the("registration form").located(By.id("account-creation_form"));
    public static final Target FIRST_NAME = Target.the("first name field").located(By.id("customer_firstname"));
    public static final Target LAST_NAME = Target.the("last name field").located(By.id("customer_lastname"));
    public static final Target PASSWORD = Target.the("password field").located(By.id("passwd"));
    public static final Target DAY_DROPDOWN = Target.the("Day of birth dropdown").located(By.id("days"));
    public static final Target MONTH_DROPDOWN = Target.the("Month of birth dropdown").located(By.id("months"));
    public static final Target YEAR_DROPDOWN = Target.the("Year of birth dropdown").located(By.id("years"));
    public static final Target EMAIL_CREATE_FIELD = Target.the("email address field for account creation").located(By.id("email_create"));
    public static final Target CREATE_ACCOUNT_BUTTON = Target.the("Create Account button").located(By.id("SubmitCreate"));
    public static final Target REGISTER_BUTTON = Target.the("Register button").located(By.id("submitAccount"));


}
