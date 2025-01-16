# ChangeMon - Convertidor de Divisas

**ChangeMon** es una aplicación **Java** que permite convertir valores entre diferentes divisas utilizando una versión de consola. Este proyecto busca facilitar el acceso a tasas de conversión actualizadas de forma sencilla y rápida.

---

## Características principales

- ✅ **Versión de consola:** Permite interactuar mediante texto, ideal para terminales o entornos sin GUI.
- ✅ **Tasas actualizadas:** Obtiene las tasas de cambio actuales a través de un mecanismo definido en la clase `ConsultarMoneda`.
- ✅ **Soporte para múltiples divisas:** Compatible con más de 160 divisas de todo el mundo.

---

## Tecnologías utilizadas

- **Lenguaje:** Java 8+
- **Bibliotecas estándar:**
    - `javax.swing` para la interfaz gráfica.
    - `java.util` para manejo de colecciones.
    - `java.io` y `java.net` para la posible integración con APIs externas.
- **Frameworks externos:** Ninguno.

---

## Requisitos previos

1. Tener instalado Java JDK 8 o superior.
2. Un entorno de desarrollo como IntelliJ IDEA, Eclipse o NetBeans.
3. Conexión a internet para simular el acceso a tasas de cambio actualizadas.

---

## Instalación y uso

### 1. Clonar el repositorio
```bash
git clone https://github.com/MiguelOn889/ChangeMon.git
cd ChangeMon
```

### 2. Compilar el proyecto
Abre tu terminal y ejecuta:
```bash
javac *.java
```

### 3. Ejecutar la aplicación


#### Opción 1: Versión de consola
Ejecuta el archivo `Principal.java`:
```bash
java Principal
```

---

## Estructura del proyecto

```

├── Principal.java         # Punto de entrada para la versión de consola.
├── Moneda.java            # Clase que modela la conversión de divisas.
├── Menu.java              # Menú para la selección de divisas en consola.
├── Divisas.java           # Mapeo de divisas disponibles.
├── ConsultarMoneda.java   # Lógica de conversión entre divisas.
├── README.md              # Documentación del proyecto.
```

---

## Ejemplo de uso


### Consola
Sigue las instrucciones que aparecen en la terminal para seleccionar las divisas y cantidad. Ejemplo:
```plaintext
************ Bienvenido al convertidor de divisas ChangeMon ************
1    AED    UAE Dirham    United Arab Emirates
2    AFN    Afghan Afghani    Afghanistan
...
Por favor, escoja la divisa de base: 1
Ahora por favor escoja la divisa a la cual quiere saber el equivalente: 43
Por favor introduzca la cantidad que desea convertir: 100
Para hoy 2024-11-25 12:00:00 100 USD equivalen a 92.50 EUR.
```

---

## Próximos pasos

- 🚀 Integrar una API para obtener tasas de cambio en tiempo real.
- 💡 Crear el diseño de la interfaz gráfica para una experiencia más intuitiva.
- 🌍 Añadir soporte para diferentes idiomas.

---

## Contribuciones

¡Las contribuciones son bienvenidas! Si deseas agregar nuevas funciones o reportar problemas, no dudes en crear un [issue](https://github.com/tuusuario/ChangeMon/issues) o enviar un Pull Request.

---

## Licencia

Este proyecto está bajo la [Licencia MIT](LICENSE).

---

## Contacto

Desarrollador: **Miguel Velasco**  
Correo electrónico: [velasco882@gmail.com](mailto:velasco882@gmail.com)  
Repositorio: [https://github.com/MiguelOn889/ChangeMon](https://github.com/MiguelOn889/ChangeMon)
