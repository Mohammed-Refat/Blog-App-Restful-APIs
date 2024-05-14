# Real-Time REST APIs with Spring Boot

Welcome to the Real-Time REST APIs project built with Spring Boot! This project is a comprehensive implementation based on the Udemy course "[Building Real-Time REST APIs with Spring Boot](https://www.udemy.com/course/building-real-time-rest-apis-with-spring-boot/?couponCode=LEADERSALE24A)".

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project demonstrates how to build real-time RESTful APIs using Spring Boot. It covers essential concepts and best practices for developing scalable and maintainable web services.

## Features

- CRUD operations for managing entities
- Exception handling
- Validation
- Pagination and sorting
- Security with JWT
- Real-time updates with WebSockets
- Unit and integration testing

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- JWT (JSON Web Token)
- WebSockets
- MySQL (or any other preferred database)
- Maven

## Prerequisites

Before you begin, ensure you have the following installed:

- JDK 21 or higher
- Maven
- MySQL (or another database)
- An IDE (IntelliJ IDEA, Eclipse, etc.)

## Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/yourusername/real-time-rest-apis.git
    cd real-time-rest-apis
    ```

2. **Configure the database:**

   Update the `application.properties` file with your database configuration:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
    spring.datasource.username=yourusername
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Install dependencies:**

    ```bash
    mvn clean install
    ```

## Running the Application

1. **Start the application:**

    ```bash
    mvn spring-boot:run
    ```

2. The application will be accessible at `http://localhost:8080`.

## Usage

- **API Documentation:** Visit `http://localhost:8080/swagger-ui.html` for the API documentation and testing.
- **Real-Time Updates:** Connect to the WebSocket endpoint at `ws://localhost:8080/your-websocket-endpoint`.

### Example API Endpoints

- **Get all items:** `GET /api/items`
- **Create a new item:** `POST /api/items`
- **Update an item:** `PUT /api/items/{id}`
- **Delete an item:** `DELETE /api/items/{id}`

Refer to the API documentation for a complete list of endpoints and their usage.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes. Make sure to update tests as appropriate.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

