# Jetro Project — Ecommerce API

Spring Boot 3 REST API with MySQL, JWT authentication, cart, and orders.

## Requirements

- Java 17+
- Maven
- MySQL

## Local setup

1. Create database `ecommerce_db` (or let the app create it via JDBC URL).
2. Copy `src/main/resources/application-local.properties.example` to `application-local.properties` in the same folder.
3. Set a **unique** `jwt.secret` (at least 32 characters). Do not reuse secrets from tutorials or old commits.
4. Set `spring.datasource.password` if your MySQL user has a password.

Alternatively, set environment variables:

```powershell
$env:JWT_SECRET = "your-long-random-secret-here"
$env:DB_PASSWORD = "your-mysql-password"
mvn spring-boot:run
```

## Run

```bash
mvn spring-boot:run
```

## Security (public repo)

- Secrets are **not** stored in `application.properties`.
- `application-local.properties` is gitignored — use it only on your machine.
- If this repo was ever public with an old JWT key in history, **rotate** `jwt.secret` before deploying anywhere real.
