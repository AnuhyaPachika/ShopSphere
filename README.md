# 🛍️ ShopSphere — Full-Stack E-Commerce Platform

A **production-grade full-stack Java project** I built to showcase **enterprise-level engineering skills**.  
The platform delivers a complete e-commerce experience with **Spring Boot 3**, **Angular**, **PostgreSQL**, **JWT authentication**, fully containerized with **Docker Compose**, and automated via **GitHub Actions CI/CD**.

---

## ✨ Key Features

### 👤 User-facing
- 🛒 Product catalog (list, detail, search, pagination)  
- 🛍️ Cart & checkout (mock payment gateway)  
- 📦 Order history  

### 🔐 Authentication & Authorization
- Register/Login with **JWT tokens**  
- Role-based access (**User/Admin**)  

### 🛠️ Admin-facing
- Product CRUD management dashboard  

### 📑 Documentation
- Interactive API docs with **Swagger UI**  

### 🧪 Testing
- **JUnit 5 + Testcontainers** with PostgreSQL  

### ⚙️ DevOps
- **Docker Compose** for orchestration  
- **GitHub Actions** for CI/CD pipeline  

---

## 🧰 Tech Stack

- **Backend**: Java 17, Spring Boot 3 (Web, Security, JPA, Validation)  
- **Frontend**: Angular, TypeScript, Bootstrap  
- **Database**: PostgreSQL (Dockerized)  
- **Authentication**: JWT (Access + Refresh Tokens)  
- **API Docs**: Swagger UI / OpenAPI 3  
- **Testing**: JUnit 5, Testcontainers  
- **DevOps**: Docker, Docker Compose, GitHub Actions CI/CD  

---

## 🏗️ System Architecture

```text
[ Angular SPA ]  <---->  [ Spring Boot REST API ]  <---->  [ PostgreSQL DB ]
      |                          |                            |
   (UI/UX)                (Business Logic)             (Persistent Store)
      |                          |                            |
 [ JWT Auth ]       [ Swagger + Validation ]        [ Testcontainers ]
                      [ CI/CD with GitHub Actions + Docker Compose ]
```

---

## 🔌 API Endpoint Summary

| Method | Path                        | Description             |
|--------|-----------------------------|-------------------------|
| GET    | `/api/products`             | List products (search, page) |
| GET    | `/api/products/{id}`        | Product detail          |
| POST   | `/api/cart`                 | Add item to cart        |
| POST   | `/api/checkout`             | Place order (mock payment) |
| GET    | `/api/orders`               | Order history           |
| POST   | `/api/auth/register`        | Register new user       |
| POST   | `/api/auth/login`           | User login (JWT token)  |
| GET    | `/api/admin/products`       | Admin: list products    |
| POST   | `/api/admin/products`       | Admin: add product      |
| PUT    | `/api/admin/products/{id}`  | Admin: update product   |
| DELETE | `/api/admin/products/{id}`  | Admin: delete product   |
| GET    | `/api/health`               | Health check            |

✔ All endpoints are **secured with JWT auth** (role-based for User/Admin).  
✔ Auto-documented with **Swagger UI** at `/swagger-ui.html`.  

---

## ⚡ Quick Start (Local Development)

### ✅ Requirements
- JDK **17+**  
- Node.js **18+** & npm  
- Docker & Docker Compose  

---

### 🔹 Backend (Spring Boot)

```bash
cd backend
./mvnw clean install
./mvnw spring-boot:run
```

---

### 🔹 Frontend (Angular)

```bash
cd frontend
npm install
npm start
```

---

### 🔹 Docker (Full Stack Orchestration)

```bash
docker-compose up --build
```

🌐 App will be available at:  
- Frontend → http://localhost:4200  
- Backend → http://localhost:8080/api  
- Swagger Docs → http://localhost:8080/swagger-ui.html  

---

## 🧪 Testing

```bash
# Backend tests (JUnit + Testcontainers)
cd backend
./mvnw test
```

✔ Integration tests use **Testcontainers** with a real PostgreSQL DB.  
✔ Ensures **production-like reliability** in CI/CD pipelines.  

---

## 📈 CI/CD Pipeline

**GitHub Actions Workflow** (`.github/workflows/ci.yml`):  

- ✅ Lint + Unit Tests (Frontend & Backend)  
- ✅ Build Docker images  
- ✅ Run integration tests with Testcontainers  
- ✅ Deploy (optional) to staging/production environment  

---

## 🔒 Security

- JWT authentication with **Access + Refresh Tokens**  
- Role-based authorization (**User vs Admin**)  
- CORS handling for SPA + API separation  
- Input validation & exception handling  

---

## 🧭 Roadmap

- ✅ Core e-commerce flows (**MVP complete**)  
- 🚀 Add **payment gateway** integration (Stripe/PayPal)  
- 📦 Add **ElasticSearch** for product search  
- 📊 Add **Grafana/Prometheus monitoring**  
- ☁️ Deploy to **AWS (ECS + RDS + CloudFront)**  

---

## 📄 License

📜 MIT License — free to use, modify, and distribute.  

---
