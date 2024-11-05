# ToDo App

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview
The ToDo App is a web-based application developed using Spring Boot, designed to help users manage their daily tasks effectively. Users can create, read, update, and delete tasks, making it a simple yet powerful tool for task management.

## Features
- User authentication and authorization
- Create, read, update, and delete tasks
- Mark tasks as completed
- Filter tasks by status (all, completed, pending)
- Responsive user interface

## Technologies Used
- **Backend**: Spring Boot
- **Database**: MySQL
- **Build Tool**: Maven
- **Dependencies**: 
  - `spring-boot-starter-data-jpa`: For JPA and Hibernate support
  - `spring-boot-starter-web`: For building web applications, including RESTful services
  - `javax.servlet-api` (v4.0.1): For Servlet API support
  - `jakarta.servlet.jsp.jstl-api` (v2.0.0) & `jakarta.servlet.jsp.jstl` (v2.0.0): For JSP tag library support
  - `taglibs-standard-impl` (v1.2.5): Provides JSTL standard tags implementation
  - `spring-boot-devtools`: For development-time features like auto-reload (runtime scope)
  - `mysql-connector-j`: JDBC driver for MySQL (runtime scope)
  - `tomcat-embed-jasper`: For running JSP on an embedded Tomcat server
  - `bootstrap` (v4.6.0): Web front-end framework for styling
  - `jquery` (v1.9.1): JavaScript library for client-side scripting
  - `spring-boot-starter-test`: For testing support

## Getting Started

### Prerequisites
Before you begin, ensure you have the following installed:
- Java Development Kit (JDK) 11 or higher
- MySQL Server
- Maven

### Installation
1. Clone the repository:
```bash
git clone https://github.com/sprashantofficial/ToDo-App.git
```
2.Navigate to the project directory:
```bash
cd ToDo-App
```
3.Configure the application.properties file with your MySQL database credentials. Set up your database and update the connection properties:
```application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_app
spring.datasource.username=your_username
spring.datasource.password=your_password
```


## Running the Application
1.Navigate to the project directory (if not already there).

2.Build the project using Maven:
```bash
mvn clean install
```
3.Run the application:
```bash
mvn spring-boot:run
```

## Usage
Open your web browser and navigate to ```http://localhost:8080.```
You will see the ToDo App interface where you can start managing your tasks.


## Contributing
Contributions are welcome! If you have suggestions or improvements, feel free to create a pull request or submit an issue.
