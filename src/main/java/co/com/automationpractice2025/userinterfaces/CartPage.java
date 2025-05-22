package co.com.automationpractice2025.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target WOMEN_MENU = Target.the("Women menu link").located(By.cssSelector("a[title='Women']"));
    public static final Target BLOUSE_PRODUCT_IMAGE = Target.the("Blouse product image link").located(By.cssSelector("a.product_img_link[title='Blouse']"));
    public static final Target PRODUCT_WHITE_OPTION = Target.the("White blouse color option").located(By.id("color_8"));
    public static final Target ADD_TO_CART_BUTTON = Target.the("Add to cart button").located(By.cssSelector("button[name='Submit']"));
    public static final Target SUCCESS_MESSAGE = Target.the("Confirmation message after adding product to cart").located(By.cssSelector("div#layer_cart h2"));
}
