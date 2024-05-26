# E-Commerce Microservices App

## Overview
This project is a comprehensive e-commerce platform built using Spring Boot microservices and a React frontend. The architecture includes several key modules that integrate seamlessly to provide a robust and scalable solution.

## Features
- **Spring Boot Microservices**: Modular architecture with each service encapsulated in its own Spring Boot application.
- **API Gateway**: Centralized microservice access through a Spring Cloud Gateway.
- **Centralized Configuration**: Managed using Spring Cloud Config with secret management via Vault.
- **Inter-microservice Communication**: Enhanced using RESTful APIs, Feign Clients, and GraphQL.
- **Service Discovery**: Implemented using Eureka and Consul.
- **Dockerized Environment**: All services are containerized and managed using Docker Compose.
- **AWS Deployment**: Application deployed on AWS EC2 container.

## Repository Structure
 **account-service**: Gère les informations de compte des utilisateurs.
- **billing-service**: Responsable de la gestion des facturations.
- **config-repo**: Dépôt de configurations centralisé pour les services.
- **config-service**: Fournit des configurations pour tous les microservices.
- **customer-service**: Gère les informations des clients.
- **e-com-react-front**: Interface utilisateur construite avec React.
- **eureka-discovery-service**: Service de découverte pour enregistrer et localiser les microservices.
- **inventory-service**: Gère les informations de stock.
- **notification-service**: Gère l'envoi des notifications.
- **spring-cloud-gateway**: Passerelle d'API pour la gestion des demandes aux microservices.
- **docker-compose.yml**
