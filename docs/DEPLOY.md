\# Deploy

\## Build with Docker locally

docker compose -f deploy/docker-compose.local.yml up --build

\## CI/CD

\- GitHub Actions builds on push (see .github/workflows/ci.yml).

\- Optional: add a release workflow to push images to GHCR.



