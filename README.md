# 🏁 Sistema de Gestão de Corridas (Full Stack)

Projeto monorepo contendo Backend (Spring Boot) e Frontend (HTML/JS) para gestão de corridas de rua.

## 🛠️ Tecnologias

* **Backend:** Java 17, Spring Boot 3, H2 Database (Memória).
* **Frontend:** HTML5, Vanilla JS, CSS (Pico.css).

## 📋 Pré-requisitos (Verificação de Ambiente)

Para que o projeto funcione, você **precisa** ter as seguintes tecnologias instaladas.
Rode os comandos abaixo no terminal para verificar se você já as possui:

```bash
# 1. Verificar Java (Deve ser versão 17 ou superior)
java -version

# 2. Verificar Maven (Para construir o backend)
mvn -version

# 3. Verificar Python (Para rodar o frontend simples)
python3 --version
```

> ⚠️ **Atenção:** Se algum comando der "command not found", você precisa instalar a ferramenta antes de continuar.

---

## 🚀 Como Rodar o Projeto

Você precisará de **dois terminais** abertos.

### 1. Iniciar o Backend (Terminal 1)
```bash
# Na raiz do projeto:
mvn spring-boot:run
```
* O Backend iniciará em: `http://localhost:8080`

### 2. Iniciar o Frontend (Terminal 2)
```bash
# Entre na pasta do frontend:
cd corridarua-front

# Inicie o servidor simples:
python3 -m http.server 8000
```

---

### ✅ Acessar o Sistema
Abra seu navegador em:
👉 **http://localhost:8000**

## 📂 Estrutura do Projeto

* `/src`: Código fonte do Backend (Java/Spring).
* `/corridarua-front`: Código fonte do Frontend (HTML/JS).
* `/pom.xml`: Gerenciador de dependências do Backend.
