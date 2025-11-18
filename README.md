🧪 TP3 – Automatización SauceDemo

Proyecto de automatización de pruebas funcionales utilizando Lippia Web, Java, Selenium, Cucumber y Maven.
Incluye los casos pedidos: Login, Errores, Carrito, Checkout y Validaciones.

📁 Repositorio

https://github.com/joserldn/TP3_Crowdar_SauceDemo_Automation_JoseRoldan

⚙️ Requisitos del sistema

JDK 21 o compatible

Maven 3.9+ instalado y en PATH

IntelliJ IDEA (recomendado)

Google Chrome (Lippia ejecuta con ChromeDriver automáticamente)

📥 Clonar el proyecto
git clone https://github.com/joserldn/TP3_Crowdar_SauceDemo_Automation_JoseRoldan.git
cd TP3_Crowdar_SauceDemo_Automation_JoseRoldan

▶️ Ejecución desde IntelliJ – Configuración de Maven Run

Abrir IntelliJ IDEA

Ir arriba a la derecha → menú RUN

Elegir Edit Configurations…

Presionar + → seleccionar Maven

Completar así:

Name:

SaucedemoTest


Run (Command line):

clean test -DcountFork=0


Working directory:
Debe apuntar al folder raíz del proyecto

.../TP3_Crowdar_SauceDemo_Automation_JoseRoldan


Aceptar con OK

Ejecutar con el botón ▶️

Con eso se ejecutan todos los features usando Chrome.


📦 Estructura del proyecto
src
 ├── main
 │    └── java/lippia/web
 │          ├── constants   → Selectores
 │          ├── services    → Acciones de página
 │          └── steps       → Implementación de Steps
 └── test
      └── resources/web.features
            ├── Login.feature
            ├── CarritoDeCompras.feature
            ├── CompraCompleta.feature
            └── googleSearch.feature (ejemplo base)

🧪 Casos implementados
✔ Login Exitoso

Verifica acceso del usuario standard_user.

✔ Login Fallido

Valida mensaje de error para locked_out_user.

✔ Agregar y eliminar del carrito

Incluye verificación del contador del carrito.

✔ Compra completa

Registra datos, verifica Overview y realiza el checkout.

🌐 Navegador utilizado

El proyecto se ejecuta en Google Chrome, ya que Lippia Web lo utiliza por defecto.

✔ Estado del proyecto

Todos los escenarios pasan correctamente y el proyecto es 100% funcional para corrección.
