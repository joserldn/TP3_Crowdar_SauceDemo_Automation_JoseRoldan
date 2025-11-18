@Smoke
@carrito
Feature: Gestión del carrito de compras


  Como usuario autenticado en SauceDemo
  Quiero agregar y eliminar productos del carrito
  Para gestionar correctamente mi compra

  Background:
    Given que el usuario navega a la página de login de SauceDemo
    And el usuario ingresa el nombre de usuario "standard_user"
    And el usuario ingresa la contraseña "secret_sauce"
    And el usuario hace clic en el botón de login
    And se muestra la página de productos

  @agregar
  Scenario: Agregar un producto al carrito
    When el usuario agrega el producto "Sauce Labs Backpack" al carrito
    Then el contador del carrito debe mostrar "1"

  @eliminar
  Scenario: Eliminar un producto del carrito
    Given el usuario agrega el producto "Sauce Labs Backpack" al carrito
    And el contador del carrito debe mostrar "1"
    When el usuario elimina el producto "Sauce Labs Backpack" del carrito
    Then el contador del carrito no debe mostrarse
    # Alternativa si tu profe prefiere:
    # Then el contador del carrito debe estar vacío
