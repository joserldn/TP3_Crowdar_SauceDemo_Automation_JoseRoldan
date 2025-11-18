package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.SaucedemoCartConstants;
import org.testng.Assert;

public class SaucedemoCartService {

    public static void assertCartCounterEquals(String expectedCount) {
        String badge = WebActionManager.getText(SaucedemoCartConstants.CART_BADGE_CSS);
        Assert.assertEquals(badge.trim(), expectedCount);
    }

    public static void assertCartCounterNotVisible() {
        boolean exists = WebActionManager.isPresent(SaucedemoCartConstants.CART_BADGE_CSS);
        Assert.assertFalse(exists, "El contador del carrito debería no mostrarse.");
    }

    public static void goToCart() {
        WebActionManager.click(SaucedemoCartConstants.CART_BUTTON_CSS);
    }

}
