package co.com.automationpractice2025.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyAccountPage {

    public static final Target MY_ACCOUNT_HEADING = Target.the("heading of the My Account page")
            .located(By.xpath("//h1[contains(text(),'My account')]"));

}
