# Video Club System

A simple REST API built with Spring Boot to demonstrate core backend development concepts such as Controllers, Services, DTOs, Dependency Injection, and Spring Beans.

## Overview

The application manages a collection of movies and exposes REST endpoints for common CRUD operations. Data is stored in memory using a Java List, making the project lightweight and focused on Spring fundamentals rather than database integration.

## Technologies Used

* Java
* Spring Boot
* Maven
* REST API

## Project Structure

The application follows a layered architecture:

```text
Controller → Service → Data
```

### Components

#### MovieController

Handles incoming HTTP requests and returns appropriate responses.

#### MovieService

Contains the business logic for managing movies.

Responsibilities:

* Retrieve all movies
* Retrieve a movie by ID
* Add a new movie
* Delete an existing movie

Movie data is stored in an in-memory collection:

```java
List<MovieDto>
```

#### StatisticsService

Provides basic statistics related to the movie collection.

Responsibilities:

* Count the total number of movies

This service does not maintain its own data and relies on `MovieService`.

## Data Model

### MovieDto

Represents a movie object.

Fields:

* id
* title
* director
* year

The DTO is used to transfer movie data between application layers.

## API Endpoints

| Method | Endpoint        | Description                |
| ------ | --------------- | -------------------------- |
| GET    | `/movies`       | Retrieve all movies        |
| GET    | `/movies/{id}`  | Retrieve a movie by ID     |
| POST   | `/movies`       | Add a new movie            |
| DELETE | `/movies/{id}`  | Delete a movie             |
| GET    | `/movies/count` | Get total number of movies |

## Dependency Injection

All dependencies are injected using constructor injection.

Relationships:

```text
MovieController
 ├── MovieService
 └── StatisticsService

StatisticsService
 └── MovieService
```

## Spring Beans

The following classes are managed by the Spring container:

* MovieController
* MovieService
* StatisticsService

`MovieDto` is a simple data object and is not managed as a Spring Bean.

## Architecture

```text
User
  │
  ▼
MovieController
  │
  ├──► MovieService ───► List<MovieDto>
  │
  └──► StatisticsService
            │
            ▼
      MovieService
```

## Learning Objectives

This project was created to practice and demonstrate:

* REST API development with Spring Boot
* Layered application architecture
* DTO usage
* Service-based business logic
* Constructor-based Dependency Injection
* Spring Bean management
* Inversion of Control (IoC)
* Separation of concerns

## Possible extensions include:

* PostgreSQL integration
* Spring Data JPA
* Validation annotations
* Global exception handling
* Unit and integration testing
* Authentication and authorization
