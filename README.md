# Worker Registration

This is a worker registration project developed using Spring Boot, JWT, Eureka Server, and Docker. This project consists of microservices that communicate with each other seamlessly, in a scalable manner, with load balancing. The microservices are registered in a Discovery Server, enabling communication between them using the microservice name, with authentication and authorization using JWT tokens.

## Technologies Used

- Spring Boot: Java framework for web application development.
- JWT: JSON Web Tokens, used for user authentication and authorization.
- Eureka Server: Service discovery and registration server for microservices.
- Docker: Containerization platform used for packaging and deploying the project.

## Overview

This project aims to provide a worker registration system with a microservice architecture. Each microservice handles a specific aspect of the registration process, allowing for scalability and ease of maintenance. The microservices communicate with each other through the Eureka Server, ensuring seamless integration.

## Features

- Worker Registration: Workers can register in the system by providing their details, including name, email, and job position.
- Authentication and Authorization: JWT tokens are used for secure authentication and authorization of workers.
- Scalable Microservice Architecture: The project follows a microservice architecture, enabling individual services to be scaled independently.
- Service Discovery: The Eureka Server allows microservices to discover and communicate with each other using their registered names.

## Installation and Usage

To run the worker registration project, follow these steps:

1. Clone this repository to your local machine.
2. Ensure that Docker is installed and running on your system.
3. Open a terminal or command prompt and navigate to the project directory.
4. Build the Docker images for each microservice using the provided Dockerfiles.
5. Run the Docker containers for each microservice.
6. Access the microservices through their respective endpoints using a tool like Postman or a web browser.

## Contributing

Contributions are welcome! If you have any ideas, suggestions, or improvements, please submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
