@Smoke
@compra
Feature: Compra completa


  Como usuario autenticado en SauceDemo
  Quiero realizar una compra completa
  Para validar que los datos de productos y del cliente sean correctos

  Background:
    Given que el usuario navega a la página de login de SauceDemo
    And el usuario ingresa el nombre de usuario "standard_user"
    And el usuario ingresa la contraseña "secret_sauce"
    And el usuario hace clic en el botón de login
    And se muestra la página de productos

  @checkout @outline
  Scenario Outline: Compra completa de dos productos y validación en Overview
    When el usuario agrega el producto "<producto1>" al carrito
    And el usuario agrega el producto "<producto2>" al carrito
    And el usuario accede al carrito de compras
    And el usuario inicia el proceso de checkout
    And el usuario completa el formulario de checkout con nombre "<nombre>", apellido "<apellido>" y código postal "<codigoPostal>"
    And el usuario continúa al resumen de la compra
    Then se visualiza en la página de Overview el producto "<producto1>" con el precio "<precio1>"
    And se visualiza en la página de Overview el producto "<producto2>" con el precio "<precio2>"
    When el usuario finaliza la compra
    Then se muestra el mensaje de confirmación "THANK YOU FOR YOUR ORDER"

    Examples:
      | producto1             | precio1 | producto2                 | precio2 | nombre  | apellido | codigoPostal |
      | Sauce Labs Backpack   | $29.99  | Sauce Labs Bike Light     | $9.99   | José    | Roldan   | 1414         |
      # Podés agregar más filas si querés probar otros datos
