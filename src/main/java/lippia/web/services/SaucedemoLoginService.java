package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.SaucedemoLoginConstants;
import lippia.web.constants.SaucedemoProductsConstants;
import org.testng.Assert;

public class SaucedemoLoginService {

    public static void navigateToLogin() {
        WebActionManager.navigateTo(SaucedemoLoginConstants.URL);
    }

    public static void setUsername(String user) {
        WebActionManager.setInput(SaucedemoLoginConstants.INPUT_USERNAME_ID, user);
    }

    public static void setPassword(String pass) {
        WebActionManager.setInput(SaucedemoLoginConstants.INPUT_PASSWORD_ID, pass);
    }

    public static void clickLoginButton() {
        WebActionManager.click(SaucedemoLoginConstants.BUTTON_LOGIN_ID);
    }

    public static void assertProductsTitle(String expected) {
        String title = WebActionManager.getText(SaucedemoProductsConstants.LABEL_PRODUCTS_TITLE_CSS);
        Assert.assertEquals(title.trim(), expected);
    }

    public static void assertLoginErrorMessage(String expected) {
        String msg = WebActionManager.getText(SaucedemoLoginConstants.ERROR_MESSAGE_CSS).trim();
        Assert.assertEquals(msg, expected);
    }
}
