# Kotlin Service
My boilerplate for Kotlin applications.
I have been using Gradle for dependency management and Spring Boot.

## Purpose
Start server application with Kotlin.

## Roadmap
This project will be spited by chapters:
1. Installation + Configuration **(done)**
2. Project Structure **(done)**
3. PostgreSQL Database **(done)**
4. The User module: (repository, class, entity, controller..) **(in progress)**
5. Validations and Handle Exception
6. Implementing Unit and Integration Tests using JUnit and Spring Test
7. Open API Documentation using Swagger
8. Security Practices
9. Monitoring + Performance
10. Future implementations

# 1 - Installation + Configuration
## Features
- Added Spring Boot
- Added Spring Boot Dev Tools
- Added Gradle
## Dependency installed
| Package                                                                        | Description                                                      |
|--------------------------------------------------------------------------------|------------------------------------------------------------------|
| [Spring Web](https://spring.io/projects/spring-ws)                             |                                                                  |
| [Spring Boot Dev Tools](https://spring.io/projects/spring-boot/)               |                                                                  |
| [Gradle](https://gradle.org/)                                                  |                                                                  |
| [FasterXML Jackson Module](https://github.com/FasterXML/jackson-module-kotlin) | Supports serialization/deserialization classes and data classes. |

# 2 - Project Structure
## Features
- Creating some directories such as model, entity, repository, controller and so on.
## Dependency installed
No necessary

# 3 - PostgreSQL Database
## Features
- Added PostgreSQL dependency.
- Created Docker compose
## Dependency installed
| Package                                                       | Description |
|---------------------------------------------------------------|-------------|
| [Spring Data JPA](https://spring.io/projects/spring-data-jpa) |             |

# 4 - The User module: repository, class, entity, controller
## Features
- TBD
## Dependency installed
No necessary

# 5 - Validation and Handle Exception
## Features
- Implements the @ControllerAdvice. A controller advice allows you to use exactly the same exception handling techniques
  but apply them across the whole application, not just to an individual controller.
  You can think of them as an annotation driven interceptor.

## Dependency installed
| Package                                        | Description        |
|------------------------------------------------|--------------------|
| [Bean Validation](https://beanvalidation.org/) | Request validation |

# 6 - Implementing Unit and Integration Tests using JUnit and Spring Test
## Features
- Coming Soon
## Dependency installed
| Package                            | Description |
|------------------------------------|-------------|
| [JUnit](https://junit.org/junit5/) |             |
| [Spring Test](shorturl.at/dvCDW)   |             |

# 7- Open API Documentation with Swagger
## Features
- Coming Soon
## Dependency installed
| Package               | Description |
|-----------------------|-------------|
| [Link](https://link/) |             |

# 8 - Security Practices
## Features
- Coming Soon
## Dependency installed
| Package               | Description |
|-----------------------|-------------|
| [Link](https://link/) |             |

# 9 - Monitoring + Performance
## Features
- Added new Relic
## Dependency installed
| Package                            | Description |
|------------------------------------|-------------|
| [New Relic](https://newrelic.com/) |             |

# 10 - Future implementations
## Features
- Implementing Job Scheduler with Quartz
- Authorization with JWT token
- Implementing Coroutines
## Dependency installed
| Package                                     | Description |
|---------------------------------------------|-------------|
| Authorization with JWT token                |             |
| [Quartz](http://www.quartz-scheduler.org/)  |             |

# References
- [Error Handling](https://www.baeldung.com/kotlin/spring-rest-error-handling)
- [Tutorial](https://github.com/Baeldung/kotlin-tutorials)
