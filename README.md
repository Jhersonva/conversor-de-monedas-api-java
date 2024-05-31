# Conversor de Monedas

Bienvenido al proyecto **Conversor de Monedas**. Este proyecto permite convertir entre diferentes tipos de monedas utilizando datos en tiempo real obtenidos de una API de tasas de cambio. A continuación, se detallan las funcionalidades y características principales del proyecto.

## Descripción del Proyecto

El Conversor de Monedas es una aplicación de consola desarrollada en Java que permite a los usuarios convertir cantidades entre diferentes monedas. La aplicación obtiene las tasas de cambio actuales a través de la API [ExchangeRate-API](https://www.exchangerate-api.com/) y realiza las conversiones basadas en las tasas obtenidas.

## Tecnologías Utilizadas

- **Java JDK 17**: Lenguaje de programación utilizado para desarrollar la aplicación.
- **IntelliJ IDEA**: Entorno de desarrollo integrado (IDE) utilizado para escribir y depurar el código.
- **Postman**: Herramienta utilizada para probar y verificar las solicitudes a la API.
- **ExchangeRate-API**: API utilizada para obtener las tasas de cambio actualizadas.

<img src="https://www.vectorlogo.zone/logos/java/java-ar21.svg" alt="Java" width="120"/>
<img src="https://upload.vectorlogo.zone/logos/jetbrains_idea/images/d4398a36-c378-4511-a508-106ded6cd69a.svg" alt="Postman" width="80"/>
<img src="https://www.vectorlogo.zone/logos/getpostman/getpostman-ar21.svg" alt="IntelliJ IDEA" width="200"/>

## Estructura del Proyecto

El proyecto consta de dos clases principales:

1. **ConvertirMoneda**: Contiene la lógica de conversión y el consumo de la API para obtener las tasas de cambio.
2. **Principal**: Implementa la interfaz de usuario mediante un menú de opciones para seleccionar el tipo de conversión deseada.

## Funcionamiento

### Clase ConvertirMoneda

La clase `ConvertirMoneda` es responsable de:
- Realizar una solicitud a la API para obtener las tasas de cambio.
- Parsear la respuesta JSON de la API.
- Realizar la conversión de moneda basada en las tasas obtenidas.

#### Métodos Principales

- **convertirMoneda(double cantidad, String opcion)**: Realiza la conversión de moneda basada en la opción seleccionada por el usuario.
- **obtenerTasasDeCambio()**: Obtiene las tasas de cambio actuales desde la API.

### Clase Principal

La clase `Principal` maneja la interacción con el usuario mediante un menú de opciones. Permite seleccionar el tipo de conversión y la cantidad a convertir. La aplicación se ejecuta en un bucle hasta que el usuario elige salir.

#### Menú de Opciones

El menú ofrece las siguientes opciones de conversión:
1. Dólar (USD) => Peso Argentino (ARS)
2. Peso Argentino (ARS) => Dólar (USD)
3. Dólar (USD) => Real Brasileño (BRL)
4. Real Brasileño (BRL) => Dólar (USD)
5. Dólar (USD) => Peso Colombiano (COP)
6. Peso Colombiano (COP) => Dólar (USD)
7. Soles (PEN) => Dólar (USD)
8. Dólar (USD) => Soles (PEN)
9. Salir

## Ejemplo de Uso

### Ejecución del Programa

Al ejecutar el programa, se presenta el siguiente menú al usuario:

**************************************

<img src="https://scontent.flim19-1.fna.fbcdn.net/v/t39.30808-6/447199668_2139269746444376_7798462998533259863_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeGuUlzTVtlRdDm2ieVWQLppac4yGqA69KNpzjIaoDr0owayMTZPeRMvKLTkTbT-Ng_bAJ9sYwFzt8o_H75bZvRq&_nc_ohc=ju3FEbCYU8wQ7kNvgEr-qP-&_nc_ht=scontent.flim19-1.fna&oh=00_AYDKEIOvO1Thz-P5ZASbFHWrTgx65Ctkjjmq-Cz54BYaGA&oe=665FCEAD" alt="Ejecucion del Programa" width="350"/>

**************************************

### Conversión de Moneda
A continuación, se muestra un ejemplo de conversión de 2500 Soles Peruanos (PEN) a Dólares (USD):

<img src="https://scontent.flim19-1.fna.fbcdn.net/v/t39.30808-6/436315644_2139269796444371_8954343594973448795_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeFmScN4KYEZXm70F0GvCrP0bjjSr0OPVnhuONKvQ49WeEgglZ5dfKs7q2HKiR9k1FclA7oWYa4NPsWKlj57vy2L&_nc_ohc=9xtOR4IvngoQ7kNvgH1yYyh&_nc_ht=scontent.flim19-1.fna&oh=00_AYCR1tJy4bX399Ysf4kzl-pTlH2u8_DxjDSs5c5opCCdRg&oe=665FAF6C" alt="Conversion de Moneda" width="550"/>

**************************************

### Salida del Programa
Para salir del programa, el usuario debe seleccionar la opción 9:

<img src="https://scontent.flim19-1.fna.fbcdn.net/v/t39.30808-6/447206368_2139269756444375_7201505256282617120_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeF4feN1PZoriXHIuinR0dnbWwzug94naA5bDO6D3idoDoVQiafb6D2c_t-mU6NNbX8c-pLy4XUNa8gXzYFcQXcj&_nc_ohc=xC1KGM0Qi3cQ7kNvgG1JLz2&_nc_ht=scontent.flim19-1.fna&oh=00_AYA7e2UQre0m8JcClAYj2147aBPfcIgiAdGhyCL2Z5DjiQ&oe=665FBFC1" alt="Salida del Programa" width="300"/>

**************************
### Requisitos
- Java JDK 17 o superior.
- Conexión a Internet para acceder a la API de tasas de cambio.

**************************

### Instalación y Ejecución
1. **Clonar el repositorio:**
   
`git clone https://github.com/usuario/conversor-de-monedas.git`

2. **Navegar al directorio del proyecto:**
   
`cd conversor-de-monedas`

3. **Compilar las clases Java:**
   
`javac src/*.java -d out`

4. **Ejecutar el programa:**
   
`java -cp out Principal`

**************************
### Contribuciones
Las contribuciones son bienvenidas. Por favor, abre un issue para discutir cualquier cambio importante antes de realizarlo.

************************** 

### Equipo de Trabajo
Nombre del Desarrollador: Jherson Villa

Contacto: jherson2408va@gmail.com

Equipo ONE: Oracle Next Education

**************************

**Gracias por usar el Conversor de Monedas. ¡Esperamos que te sea útil!**
