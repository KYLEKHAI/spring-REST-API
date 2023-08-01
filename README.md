# spring-REST-API

# SpringAPI - Simple REST API using Spring Boot and Java

## Functionality

This project aims to create a simple REST API using Spring Boot and Java. The API allows clients to perform GET requests to retrieve user information based on the provided user ID.

## Frameworks/Languages Used

- Spring Boot
- Java

## Code Overview

- The API exposes a single endpoint to retrieve user information:

- This endpoint allows clients to fetch user details by providing the user ID as a query parameter. The API will search for the user with the specified ID and return the user's information in the response.

### `User.java`

The `User` class represents the user entity with properties such as ID, name, age, and email. It is a simple POJO (Plain Old Java Object) with getters and setters to access and modify the user's attributes.

### `SpringApiApplication.java`

The main class that serves as the entry point of the application. It utilizes Spring Boot's `SpringApplication.run` to start the application.

### `UserController.java`

The controller class responsible for handling HTTP requests. It has an endpoint mapped to the URL path `/user`. Clients can make a GET request to this endpoint, passing the user ID as a query parameter, and the controller will use the `UserService` to fetch and return the user information.

### `UserService.java`

The service class that manages user-related operations. It holds a list of `User` objects and provides a method `getUser(Integer id)` to find a user by their ID. If a matching user is found, the method returns an `Optional` containing the user; otherwise, it returns an empty `Optional`.

## Usage

Clients can make GET requests to the API endpoint `/user?id=<user_id>` using REST clients such as "REST Client" extension in Visual Studio Code or tools like Postman or cURL.

For example, making a GET request to `http://localhost:8080/user?id=3` will retrieve the user information for user with ID 3.
