# Plataforma para venda online

## Recursos
- REST API
- Docker
- Docker Compose
- JWT authentication
- Carrinho de compras de visitantes com base em cookies
- Carrinho de compras de clientes persistentes
- Gerenciamento de compras e pedidos
- Verificação de saída
- Catálogo
- Gestão de pedidos
- Paginação
## Tecnologia Stacks
**Backend**
  - Java 11
  - Spring Boot 2.2
  - Spring Security
  - JWT Authentication
  - Spring Data JPA
  - Hibernate
  - PostgreSQL
  - Maven

**Frontend**
  - Angular 7
  - Angular CLI
  - Bootstrap

## Como Para Executar

Inicie o servidor back-end antes do cliente frontend.  

**Backend**

  1. Instalar [PostgreSQL](https://www.postgresql.org/download/) 
  2. Configurar datasource Em `application.yml`.
  3. `cd backend`.
  4. Executar `mvn install`.
  5. Executar `mvn spring-boot:run`.
  6. Spring Boot irá importar dados fictícios para o banco de dados executando `import.sql` automaticamente.
  7. O servidor de backend está sendo executado em [localhost:8080]().

**Frontend**
  1. Instalar [Node.js and npm](https://www.npmjs.com/get-npm)
  2. `cd frontend`.
  3. Executar `npm install`.
  4. Executar `ng serve`
  5. O cliente front-end está em execução [localhost:4200]().
  
Observação: o URL da API de back-end é configurado em `src/environments/environment.ts` do projeto de front-end. Isto é `localhost:8080/api` por padrão.
  
#### Executar no Docker
Você pode construir a imagem e executar o contêiner com Docker. 
1. Construir projeto de back-end
```bash
cd backend
mvn package
```
2. Construir projeto fontend
```bash
cd frontend
npm install
ng build --prod
```
3. Crie imagens e execute contêineres
```bash
docker-compose up --build
```

