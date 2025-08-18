\# Local Setup

\## Backend

cd backend

mvn spring-boot:run   # http://localhost:8080/api/products

\## Frontend

cd frontend

npm ci

npm start             # http://127.0.0.1:4200

\## Docker (optional)

docker compose -f deploy/docker-compose.local.yml up --build

\# Open http://localhost:4300



