package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.SaucedemoCheckoutService;

public class SaucedemoCheckoutSteps extends PageSteps {

    @When("el usuario inicia el proceso de checkout")
    public void startCheckout() {
        SaucedemoCheckoutService.clickCheckout();
    }

    @When("el usuario completa el formulario de checkout con nombre {string}, apellido {string} y código postal {string}")
    public void completeCheckoutForm(String first, String last, String postal) {
        SaucedemoCheckoutService.completeCheckoutForm(first, last, postal);
    }

    @When("el usuario continúa al resumen de la compra")
    public void continueToOverview() {
        // Este step puede no hacer nada porque el botón ya se clickea en completeCheckoutForm
    }


    @Then("se visualiza en la página de Overview el producto {string} con el precio {string}")
    public void verifyProduct(String name, String price) {
        SaucedemoCheckoutService.assertProductsOverview(name, price);
    }

    @When("el usuario finaliza la compra")
    public void finishPurchase() {
        SaucedemoCheckoutService.finishPurchase();
    }

    @Then("se muestra el mensaje de confirmación {string}")
    public void verifyFinalMessage(String expected) {
        SaucedemoCheckoutService.assertThankYouMessage();
    }
}
