# 🛍️ ShopSphere — Full-Stack E-Commerce Platform

A **production-grade full-stack Java project** I developed to showcase **enterprise-level engineering skills**.  
The platform delivers a complete e-commerce experience using **Spring Boot 3, Angular, PostgreSQL, JWT authentication**, fully **containerized with Docker Compose**, and **automated via GitHub Actions CI/CD**.  

---

## ✨ Key Features
- **User-facing:** product catalog (list/detail/search/pagination), cart, checkout (mock payment), order history  
- **Authentication & Authorization:** register/login with JWT tokens, role-based access (User/Admin)  
- **Admin-facing:** product CRUD management dashboard  
- **Documentation:** interactive API docs with Swagger UI  
- **Testing:** JUnit 5 + Testcontainers integration testing with PostgreSQL  
- **DevOps:** Docker Compose for local orchestration, GitHub Actions for CI/CD  

---

## 🧰 Tech Stack
- **Backend:** Java 17, Spring Boot 3 (Web, Security, JPA, Validation)  
- **Frontend:** Angular, TypeScript, Bootstrap  
- **Database:** PostgreSQL (Dockerized)  
- **Auth:** JWT (Access + Refresh Tokens)  
- **Docs:** Swagger UI / OpenAPI 3  
- **Testing:** JUnit 5, Testcontainers  
- **DevOps:** Docker, Docker Compose, GitHub Actions CI/CD  

---

## 🏗️ System Architecture
```mermaid
flowchart TD
  User[👩‍💻 User/Admin] --> Frontend[Angular SPA]
  Frontend -->|REST| Backend[Spring Boot 3 API]
  Backend --> DB[(PostgreSQL Database)]
  Backend --> Auth[🔑 JWT Tokens]
  Backend --> Docs[📘 Swagger UI]
  CI[⚙️ GitHub Actions] --> Backend
  CI --> Frontend
