
# 🧪 Automation Practice 2025

![Java](https://img.shields.io/badge/language-Java-blue.svg)
![Gradle](https://img.shields.io/badge/build-Gradle-green)
![SerenityBDD](https://img.shields.io/badge/framework-Serenity%20BDD-yellow)
![Screenplay](https://img.shields.io/badge/pattern-Screenplay-blueviolet)
![Status](https://img.shields.io/badge/status-In_Progress-orange)

Proyecto de automatización profesional basado en **Java + Serenity BDD + Cucumber + Screenplay Pattern**, estructurado para pruebas funcionales en la plataforma [AutomationPractice](http://automationpractice.pl/index.php).

---

## 🛠 Tecnologías y herramientas utilizadas

- ☕ Java 17
- 🧪 Serenity BDD `4.2.22`
- 🎭 Screenplay Pattern
- 🥒 Cucumber + Gherkin
- 🌐 Selenium WebDriver `4.32.0`
- 🧱 Lombok `1.18.38`
- 🧰 WebDriverManager `6.1.0`
- 📦 Gradle
- 🔎 SLF4J + Logback
- ✅ JUnit
- 🧪 JSON Databinding (Jackson)

---

## 🧱 Estructura del Proyecto

```
src/
├── main/
│   ├── java/co/com/automationpractice2025/
│   │   ├── tasks/
│   │   │   ├── account/              → Registro de usuarios
│   │   │   ├── login/                → Inicios de sesión
│   │   │   └── common/               → Tareas reutilizables futuras
│   │   ├── models/                   → Modelos como UserModel
│   │   ├── builders/                 → Generadores de datos como UserBuilder
│   │   ├── userinterfaces/           → PageObjects
│   │   └── utils/                    → Utilidades como UserDataReader
│
├── test/
│   ├── java/co/com/automationpractice2025/
│   │   ├── stepdefinitions/          → Glue de Cucumber
│   │   ├── runners/                  → Clases Runner
│   │   └── hooks/                    → Hooks @Before para actores y WebDriver
│   └── resources/features/          → Escenarios Gherkin
```

---

## 🚀 Ejecución

```bash
./gradlew clean test
```

El reporte se genera automáticamente al finalizar en:  
📁 `target/site/serenity/index.html`

---

## 🔧 Configuración de drivers

Los drivers son gestionados automáticamente por **WebDriverManager**.

---

## 📈 Reportes

Este proyecto utiliza el plugin de reportes de Serenity para generar un resumen HTML de los escenarios ejecutados.

---

## 📦 Gestión de versiones

Las versiones de las dependencias clave están centralizadas en el archivo `gradle.properties`.

---

## 📌 Próximas funcionalidades a automatizar

- 🔐 Login de usuarios válidos e inválidos
- 🛒 Agregar productos al carrito
- 💳 Checkout y flujo de compra
- 📋 Validación de historial de pedidos
- ⚠️ Escenarios negativos (campos obligatorios, errores visuales)
- 📥 Exportación de resultados / integración con CI (GitHub Actions)

---

## 🙌 Autor

**Juan Andrés Saldarriaga Z.**  
QA Automation Engineer | Serenity • Java • Screenplay  
[LinkedIn](https://www.linkedin.com/in/jsaldaza) | jsaldaza@gmail.com

---

¿Listo para automatizar con elegancia? 🎯
