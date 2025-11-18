package lippia.web.steps;

import io.cucumber.java.en.*;
import lippia.web.services.SaucedemoLoginService;

public class SaucedemoLoginSteps {

    @Given("que el usuario navega a la página de login de SauceDemo")
    public void navigateToLogin() {
        SaucedemoLoginService.navigateToLogin();
    }

    @When("el usuario ingresa el nombre de usuario {string}")
    public void enterUser(String user) {
        SaucedemoLoginService.setUsername(user);
    }

    @When("el usuario ingresa la contraseña {string}")
    public void enterPassword(String password) {
        SaucedemoLoginService.setPassword(password);
    }

    @When("el usuario hace clic en el botón de login")
    public void clickLogin() {
        SaucedemoLoginService.clickLoginButton();
    }

    @Then("el título de la página de productos es {string}")
    public void assertProductsTitle(String expected) {
        SaucedemoLoginService.assertProductsTitle(expected);
    }

    @Then("el texto del mensaje de error es {string}")
    public void assertErrorMessage(String expected) {
        SaucedemoLoginService.assertLoginErrorMessage(expected);
    }

    @Then("se muestra la página de productos")
    public void se_muestra_la_pagina_de_productos() {
        SaucedemoLoginService.assertProductsTitle("Products");
    }

    @Then("se muestra el mensaje de error {string}")
    public void se_muestra_el_mensaje_de_error(String expected) {
        SaucedemoLoginService.assertLoginErrorMessage(expected);
    }


}
