# Video Club System (Spring Boot Exercise)

## Goal
Create a simple REST API for managing movies using Spring Boot concepts:
- Controller
- Service
- DTO
- Constructor Injection
- Beans

---

## Movie DTO

A movie has:
- id
- title
- director
- year

One DTO = one movie object.

---

## Movie Service

Responsible for managing movies.

Functions:
- get all movies
- get movie by id
- add movie
- delete movie

Data is stored in memory:

List<MovieDto>

This acts like a fake database.

---

## Statistics Service

Responsible for simple statistics.

Function:
- count movies

It does NOT store data.

It uses MovieService.

Flow:
StatisticsService → MovieService → List<MovieDto>

---

## Controller

Handles HTTP requests.

Endpoints:

GET /movies → get all movies  --
GET /movies/{id} → get movie by id  --
POST /movies → add movie  --
DELETE /movies/{id} → delete movie  --
GET /movies/count → get number of movies --

---

## Beans

Spring manages these beans:
- MovieController
- MovieService
- StatisticsService

DTO is NOT a bean.

---

## Constructor Injection

All dependencies must be injected via constructors.

Flow:

MovieController → MovieService  
MovieController → StatisticsService  
StatisticsService → MovieService

---

## Architecture

User → MovieController → MovieService → List<MovieDto>
↘ StatisticsService ↗

---

## Key Ideas

- DTO = simple data object
- Service = business logic
- Controller = API layer
- List = in-memory storage
- Spring Beans = objects managed by Spring
- IoC = Spring creates and connects objects