# **Select Language:** 🌍
- [Español (Spanish)](README-es.md)
- [English](README-es.md)

# Proyecto Spring Boot: Appd

Este es un proyecto de Spring Boot que incluye varios controladores, servicios y repositorios para manejar operaciones de una calculadora, generar números aleatorios, gestionar pacientes y consumir un servicio REST externo.


## RESULTS
### Swagger Documentation Parte 1
![Alt text](docs/home1.PNG)
### Swagger Documentation Parte 2
![Alt text](docs/home.PNG)


## Estructura del Proyecto

### Paquetes

- `top.anyel.querys.config_appd`: Configuración del entorno de la aplicación.
- `top.anyel.querys.controllers_appd`: Controladores REST para manejar las solicitudes HTTP.
- `top.anyel.querys.repositories_appd`: Repositorios para acceder y manipular los datos.
- `top.anyel.querys.servicies_appd`: Servicios que contienen la lógica de negocio.

### Componentes Principales

#### Configuración

- `AppEnvironment`: Clase que carga variables de entorno utilizando la librería `dotenv`.

#### Controladores

- `CalculadoraAppd`: Proporciona endpoints para operaciones de suma, resta, multiplicación y división.
- `PatientController`: Proporciona endpoints para gestionar pacientes (crear, listar, buscar, contar y eliminar).
- `RestApiAppd`: Proporciona un endpoint para generar un número aleatorio.
- `RestConsumerAppd`: Proporciona un endpoint para consumir un número desde un servicio REST externo.

#### Repositorios

- `CalculadoraRepositoryAppd`: Métodos para realizar operaciones matemáticas.
- `GenerateRepositoryAppd`: Método para generar un número aleatorio.
- `PatientRepositoryAppd`: Métodos para gestionar la lista de pacientes.
- `RestConsumerRepository`: Método para consumir un número desde un servicio REST externo.

### Servicios

- `CalculadoraServiceAppd`: Contiene la lógica de negocio para las operaciones de la calculadora.
- `PatientServiceAppd`: Contiene la lógica de negocio para la gestión de pacientes.
- `GenerateServiceAppd`: Contiene la lógica para generar un número aleatorio.
- `RestConsumerServiceAppd`: Contiene la lógica para consumir un servicio REST externo.

## Requisitos Previos

- Java 11 o superior
- Maven
- Spring Boot 2.5.x o superior

## Configuración del Entorno

Asegúrate de tener un archivo `.env` en la raíz del proyecto con las siguientes variables:

```
BASE_URL=http://example.com/api
```

## Ejecutar la Aplicación

1. Clona el repositorio:
   ```bash
   git clone  https://github.com/Anyel-ec/Spring-Boot-Querys-List-InMemory
   ```

2. Navega al directorio del proyecto:
   ```bash
   cd Spring-Boot-Querys-List-InMemory
   ```

3. Construye el proyecto con Maven:
   ```bash
   mvn clean install
   ```

4. Ejecuta la aplicación:
   ```bash
   mvn spring-boot:run
   ```

## Endpoints

### Calculadora

- `GET /appd/calculator/sumar?a={num1}&b={num2}`: Suma dos números.
- `GET /appd/calculator/restar?a={num1}&b={num2}`: Resta dos números.
- `GET /appd/calculator/multiplicar?a={num1}&b={num2}`: Multiplica dos números.
- `GET /appd/calculator/dividir?a={num1}&b={num2}`: Divide dos números.

### Pacientes

- `POST /appd/patient/save`: Guarda un paciente nuevo.
- `GET /appd/patient/`: Lista todos los pacientes.
- `GET /appd/patient/searchWithNum23`: Busca pacientes cuyo número de identificación contiene "23".
- `GET /appd/patient/city?city_appd={city}`: Lista pacientes en una ciudad específica.
- `GET /appd/patient/more/patients`: Lista pacientes con más visitas.
- `GET /appd/patient/count?city_appd={city}`: Cuenta pacientes en una ciudad específica.
- `DELETE /appd/patient/delete?city_appd={city}`: Elimina pacientes cuya ciudad empieza con un nombre específico.

### Número Aleatorio

- `GET /appd/number/generateNumberRamdon`: Genera un número aleatorio.

### Consumidor REST

- `GET /appd/random/number`: Consume un número desde un servicio REST externo.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Para más detalles, consulta el archivo [LICENSE](LICENSE).

## Contacto

Para más información o consultas, por favor contacta a [appatino@espe.edu.ec](mailto:appatino@espe.edu.ec).
