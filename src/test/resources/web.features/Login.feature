@Smoke
@login
Feature: Login de usuarios en SauceDemo


  Como usuario de SauceDemo
  Quiero iniciar sesión en la aplicación
  Para poder acceder a la lista de productos

  Background:
    Given que el usuario navega a la página de login de SauceDemo

  @positivo @smoke
  Scenario: Login exitoso con usuario estándar
    When el usuario ingresa el nombre de usuario "standard_user"
    And el usuario ingresa la contraseña "secret_sauce"
    And el usuario hace clic en el botón de login
    Then se muestra la página de productos
    And el título de la página de productos es "Products"

  @negativo @bloqueado
  Scenario: Login fallido con usuario bloqueado
    When el usuario ingresa el nombre de usuario "locked_out_user"
    And el usuario ingresa la contraseña "secret_sauce"
    And el usuario hace clic en el botón de login
    Then se muestra el mensaje de error "Epic sadface: Sorry, this user has been locked out."
