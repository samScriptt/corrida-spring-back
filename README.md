# 🏎️ Backend - API de Corridas de Rua

API RESTful desenvolvida em **Spring Boot** para gerenciamento de corridas, equipes e pilotos.
Utiliza banco de dados H2 (em memória) para facilitar testes rápidos.

## 🛠️ Tecnologias
* **Java 17**
* **Spring Boot 3** (Web, Data JPA)
* **H2 Database**
* **Lombok**

## 🚀 Como Rodar

### Pré-requisitos
* Java 17 (JDK)
* Maven

### Passo a Passo

1. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

2. A API estará disponível em:
   👉 **http://localhost:8080**

3. Console do Banco de Dados (H2):
   * URL: `http://localhost:8080/h2-console`
   * JDBC URL: `jdbc:h2:mem:corridaruadb`
   * User: `sa`
   * Password: `password`

## 🔌 Endpoints da API

A API segue o padrão REST. Aqui estão as rotas principais:

| Recurso     | GET (Listar)       | POST (Criar)       |
|-------------|--------------------|--------------------|
| **Equipes** | `/api/equipes`     | `/api/equipes`     |
| **Pistas** | `/api/pistas`      | `/api/pistas`      |
| **Carros** | `/api/carros`      | `/api/carros`      |
| **Pilotos** | `/api/pilotos`     | `/api/pilotos`     |
| **Corridas**| `/api/corridas`    | `/api/corridas`    |
| **Inscrições**| `/api/inscricaos`| `/api/inscricaos`|

> **Nota:** Para requisições POST, envie o JSON com o cabeçalho `Content-Type: application/json`.

