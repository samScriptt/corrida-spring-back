# 🏁 Sistema de Gestão de Corridas (Full Stack)

Projeto monorepo contendo Backend (Spring Boot) e Frontend (HTML/JS) para gestão de corridas de rua.

## 🛠️ Tecnologias

* **Backend:** Java 17, Spring Boot 3, H2 Database (Memória).
* **Frontend:** HTML5, Vanilla JS, CSS (Pico.css).

## 🚀 Como Rodar o Projeto

Você precisará de dois terminais abertos.

### 1. Iniciar o Backend (Terminal 1)
Certifique-se de ter o **Java 17** e **Maven** instalados.

```bash
# Na raiz do projeto:
mvn spring-boot:run
```
* O Backend iniciará em: `http://localhost:8080`
* Banco de Dados (H2): `http://localhost:8080/h2-console` (User: `sa`, Pass: `password`)

---

### 2. Iniciar o Frontend (Terminal 2)
O frontend precisa de um servidor simples para funcionar corretamente. Usaremos o Python para isso.

```bash
# Entre na pasta do frontend:
cd corridarua-front

# Inicie o servidor simples (Python 3):
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

