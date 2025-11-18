package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.SaucedemoProductsConstants;

public class SaucedemoProductsService {

    public static void addProductToCart(String productName) {
        String key = productName.toLowerCase().replace(" ", "-");
        WebActionManager.click(String.format(SaucedemoProductsConstants.BUTTON_ADD_TO_CART, key));
    }

    public static void removeProductFromCart(String productName) {
        String key = productName.toLowerCase().replace(" ", "-");
        WebActionManager.click(String.format(SaucedemoProductsConstants.BUTTON_REMOVE, key));
    }
}
