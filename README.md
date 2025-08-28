# Spring Boot CRUD User Management

## 📌 Overview
This is a **Spring Boot CRUD application** that provides RESTful APIs to manage users.  
It demonstrates the use of **Spring Boot**, **Spring Data JPA**, and **DTO** structures for clean code and separation of concerns.

---

## 🚀 Features
- Create a new user
- Get all users
- Get user by ID
- Update user by ID
- Delete user by ID

---

## 🛠️ Technologies Used
- **Java 17+**
- **Spring Boot**
- **Spring Data JPA (Hibernate)**
- **Lombok**
- **H2 Database** (can be replaced with MySQL/PostgreSQL)

---

## 📂 Project Structure
src/main/java/com/example/user_crud_management/

├── controller
│ └── UserController.java

├── dto
│ ├── UserDto.java
│ └── UserDtoIU.java

├── entities
│ └── User.java

├── repository
│ └── UserRepository.java

└── services
│└── UserService.java




- **User** → Entity mapped to `users` table.  
- **UserDto** → Data Transfer Object for API responses.  
- **UserDtoIU** → DTO for insert/update operations.  
- **UserRepository** → JPA repository for persistence layer.  
- **UserService** → Business logic layer.  
- **UserController** → REST controller exposing endpoints.

---

## 🔗 API Endpoints

| Method | Endpoint             | Description            |
|--------|----------------------|------------------------|
| POST   | `/api/user/save`     | Create new user        |
| GET    | `/api/user/list`     | Get all users          |
| GET    | `/api/user/list/{id}`| Get user by ID         |
| PUT    | `/api/user/update/{id}` | Update user by ID  |
| DELETE | `/api/user/delete/{id}` | Delete user by ID  |

---

## ▶️ Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/isikhekan/Spring-boot-user-CRUD.git
   cd Spring-boot-user-CRUD
2.Build and run:
  mvn spring-boot:run
3.Access the API via:
  http://localhost:8080/api/user



