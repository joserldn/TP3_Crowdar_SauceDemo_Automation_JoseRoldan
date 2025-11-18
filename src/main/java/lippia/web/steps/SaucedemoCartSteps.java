package lippia.web.steps;

import io.cucumber.java.en.*;
import lippia.web.services.SaucedemoProductsService;
import lippia.web.services.SaucedemoCartService;

public class SaucedemoCartSteps {

    @When("el usuario agrega el producto {string} al carrito")
    public void addProduct(String productName) {
        SaucedemoProductsService.addProductToCart(productName);
    }

    @When("el usuario elimina el producto {string} del carrito")
    public void removeProduct(String productName) {
        SaucedemoProductsService.removeProductFromCart(productName);
    }

    @And("el usuario accede al carrito de compras")
    public void goToCart() {
        SaucedemoCartService.goToCart();
    }

    @Then("el contador del carrito debe mostrar {string}")
    public void assertCartCount(String count) {
        SaucedemoCartService.assertCartCounterEquals(count);
    }

    @Then("el contador del carrito no debe mostrarse")
    public void assertCartNotVisible() {
        SaucedemoCartService.assertCartCounterNotVisible();
    }
}
