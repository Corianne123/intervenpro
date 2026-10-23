
# IntervenPro

IntervenPro is a multi-tenant SaaS platform for HVAC/R field service management.

## Tech stack

- React, TypeScript, Vite
- Java 21, Spring Boot
- Spring Cloud Gateway
- PostgreSQL
- Keycloak
- RabbitMQ
- Docker
- GitHub Actions

## Architecture

- apps/web: Frontend application
- services: Backend microservices
- infrastructure: Local and cloud configuration
- docs: Architecture and API documentation

## Project status

Sprint 1 - Initial setup
Sprint 2 - Initialization tenant service

## Getting started

# Backend Tenant-service

Port : 8081
To Launch tenant-service, in powershell execute this commands:
- cd .\services\tenant-service   ---- this is to enter the tenant service folder
- .\mvnw.cmd spring-boot:run     ---- to start the service

Endpoints available :
- /api/v1/tenants/demo   --- will return you a fictive tenant (get request)

To test the endpoint you can either:
* use powershell and enter:  Invoke-RestMethod `
  -Uri "http://localhost:8081/api/v1/tenants/demo" `
  -Method Get

* or use this command in powershell : curl.exe -i http://localhost:8081/api/v1/tenants/demo

If you want to execute the tests, if neccesary stop the service and go to the folder tenant-service using powershell. When you are in the folder , you enter the command : .\mvnw.cmd clean verify


