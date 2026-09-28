# Inventory API / API de Almoxarifado

Educational REST API for product management, built during **Incode Module 2**. This project demonstrates a layered Java backend with a controller, service, repository, and JPA entity.

## Stack

Java 21 · Spring Boot 3.4.0 · Spring Web · Spring Data JPA · MySQL · Maven

## Features

- Create, list, retrieve, update, and delete products.
- Store product name, quantity, and price in MySQL.
- Separate HTTP handling, application logic, and data access.

## Run locally

Requirements: JDK 21 and a local MySQL server. The Maven wrapper is included.

1. Create the MySQL database `almoxarifado`.
2. Set local database credentials through environment variables (do not commit credentials):

```sh
export SPRING_DATASOURCE_URL='jdbc:mysql://localhost:3306/almoxarifado'
export SPRING_DATASOURCE_USERNAME='your_local_user'
export SPRING_DATASOURCE_PASSWORD='your_local_password'
```

3. From the repository root:

```sh
cd almoxarifado-api
sh mvnw spring-boot:run
```

On Windows, use the equivalent environment variables and `mvnw.cmd spring-boot:run`.

The configured context path is `/almo-sys`; with the default Spring Boot port, the product endpoint is `http://localhost:8080/almo-sys/produtos`. Hibernate uses `ddl-auto=update` for this learning setup.

## API

| Method | Path | Operation |
| --- | --- | --- |
| POST | /almo-sys/produtos | Create a product |
| GET | /almo-sys/produtos | List products |
| GET | /almo-sys/produtos/{id} | Retrieve a product; returns 404 if absent |
| PUT | /almo-sys/produtos/{id} | Update a product |
| DELETE | /almo-sys/produtos/{id} | Delete a product |

Example request body for create/update:

```json
{
  "nome": "Caderno",
  "quantidade": 10,
  "preco": 12.50
}
```

## Structure

```text
almoxarifado-api/src/main/
├── java/com/example/almoxarifado_api/
│   ├── Produto.java
│   ├── ProdutoController.java
│   ├── ProdutoService.java
│   └── ProdutoRepository.java
└── resources/application.properties
```

## Scope and next steps

This is a learning project. It currently has no authentication, request validation, or consistent error handling across all operations. These, automated endpoint tests, and a decimal money type are possible future improvements. Setup instructions were checked against the repository configuration; a full application run was not performed as part of this documentation update.

## Em português

API REST desenvolvida no Módulo 2 da Incode para praticar cadastro, consulta, atualização e exclusão de produtos. Usa Java 21, Spring Boot, Spring Data JPA e MySQL, com separação entre controller, service e repository.

Para executar, crie o banco `almoxarifado`, configure as credenciais locais pelas variáveis de ambiente acima e rode `sh mvnw spring-boot:run` dentro de `almoxarifado-api`. O endpoint base é `/almo-sys/produtos`.

O projeto registra uma etapa de aprendizado em backend. Validação, autenticação, tratamento uniforme de erros e testes de endpoints são oportunidades de evolução.
