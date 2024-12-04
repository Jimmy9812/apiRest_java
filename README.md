# API REST in Java
## Description
This project implements a simple REST API using Spring Boot. The API provides a basic service that responds with a "Hello World" message when a GET request is made.

## Technologies Used
- Java 17
- Spring Boot
- Maven
## Requirements
- Java 17 or higher.
- Maven for dependency management and project building.
- An IDE like IntelliJ IDEA, Visual Studio Code, or Eclipse with Java support.

Installation
1. Clone the repository
To start, first clone the repository to your local machine:
```bash
   git clone https://github.com/Jimmy9812/apiRest_java.git
 ```
2. Navigate to the project directory
Once the repository is cloned, navigate to the project directory:
```bash
   cd apiRest_java
 ```
3. Install dependencies and build the project
Using Maven, install the dependencies and build the project:
```bash
   mvn clean install
 ```
## Running the Application
1. Run the application
To run the application, you can use Maven directly from the terminal:
```bash
   mvn spring-boot:run
 ```
2. Access the REST API
Once the application is running, open your browser or use a tool like Postman or cURL to make a GET request to:
```bash
  http://localhost:8080/hello
 ```
You should receive the following response:
```bash
  "message": "Hello World with API REST in Java"
 ```
