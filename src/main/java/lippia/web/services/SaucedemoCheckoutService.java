package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.SaucedemoCheckoutConstants;
import org.testng.Assert;
import java.util.List;

public class SaucedemoCheckoutService {

    public static void clickCheckout() {
        WebActionManager.click(SaucedemoCheckoutConstants.CHECKOUT_BUTTON);
    }

    public static void completeCheckoutForm(String first, String last, String postal) {
        WebActionManager.setInput(SaucedemoCheckoutConstants.INPUT_FIRST_NAME, first);
        WebActionManager.setInput(SaucedemoCheckoutConstants.INPUT_LAST_NAME, last);
        WebActionManager.setInput(SaucedemoCheckoutConstants.INPUT_POSTAL_CODE, postal);
        WebActionManager.click(SaucedemoCheckoutConstants.CONTINUE_BUTTON);

        // Esperar que cargue el overview
        WebActionManager.waitVisibility(SaucedemoCheckoutConstants.PRODUCT_NAME);
    }

    public static void clickContinue() {
        WebActionManager.click(SaucedemoCheckoutConstants.CONTINUE_BUTTON);
    }

    public static void finishPurchase() {
        WebActionManager.click(SaucedemoCheckoutConstants.FINISH_BUTTON);
    }

    public static void assertThankYouMessage() {
        String msg = WebActionManager.getText(SaucedemoCheckoutConstants.COMPLETE_MESSAGE).trim();
        Assert.assertEquals(msg, "Thank you for your order!",
                "El mensaje final de compra no coincide.");
    }

    public static void assertProductsOverview(String expectedName, String expectedPrice) {
        List<String> names = WebActionManager.getElements(SaucedemoCheckoutConstants.PRODUCT_NAME)
                .stream()
                .map(e -> e.getText().trim())
                .toList();

        List<String> prices = WebActionManager.getElements(SaucedemoCheckoutConstants.PRODUCT_PRICE)
                .stream()
                .map(e -> e.getText().trim())
                .toList();

        Assert.assertTrue(
                names.contains(expectedName),
                "El producto no aparece en el Overview: " + expectedName
        );

        Assert.assertTrue(
                prices.contains(expectedPrice),
                "El precio no aparece en el Overview: " + expectedPrice
        );
    }
}
