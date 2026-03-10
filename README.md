# Web Services with Spring Boot, JPA and Hibernate

## Overview

Este projeto apresenta uma implementação prática de um sistema de Web Services utilizando o ecossistema **Spring Boot**. O foco principal é demonstrar a construção de uma API RESTful robusta, integrando o mapeamento objeto-relacional (ORM) com **JPA** e **Hibernate** para persistência de dados em bancos de dados relacionais.

O projeto percorre desde a estruturação de camadas lógicas até o deploy em ambiente de produção, cobrindo todo o ciclo de vida de desenvolvimento de um back-end moderno em Java.

## Objective

O objetivo deste projeto é:


* **Criar um projeto Spring Boot** utilizando Maven como gerenciador de dependências.



* **Implementar um modelo de domínio** complexo com associações (um-para-um, um-para-muitos e muitos-para-muitos).



* **Estruturar camadas lógicas** seguindo o padrão de mercado: Resource, Service e Repository.



* **Configurar perfis de banco de dados** distintos para testes (H2) e produção (PostgreSQL).


* **Realizar operações CRUD** (Create, Retrieve, Update, Delete) completas.


* **Implementar tratamento de exceções** personalizado para respostas HTTP adequadas.



## Database Model

O modelo de domínio é baseado em um sistema de e-commerce simplificado, contendo as seguintes entidades:


* **User**: Representa o cliente do sistema.



* **Order**: Representa os pedidos realizados pelos usuários.



* **Category**: Categorias dos produtos.



* **Product**: Itens disponíveis para venda.



* **OrderItem**: Entidade de associação entre Pedido e Produto, contendo atributos extras como quantidade e preço no momento da venda.



* **Payment**: Informações de pagamento de um pedido.



* **OrderStatus (Enum)**: Estados do pedido (Aguardando Pagamento, Pago, Enviado, Entregue, Cancelado).



## Technologies and Libraries


* **Java 17/25**



* **Spring Boot** (Starter Web, Data JPA)



* **Maven**



* **Hibernate** (Implementação do JPA)



* **H2 Database** (Banco de dados em memória para testes)



* **PostgreSQL** (Banco de dados relacional para produção)



* **Postman** (Para testes de requisições API)



## Project Structure

O projeto é organizado nas seguintes camadas:

1. **Entities**: Modelagem das classes de domínio com anotações JPA.


2. **Repositories**: Interfaces que herdam de `JpaRepository` para acesso aos dados.


3. **Services**: Camada de regras de negócio e registro de componentes.


4. **Resources (Rest Controllers)**: Controladores que expõem os endpoints da API.


5. **Exceptions**: Classes para tratamento de erros como `ResourceNotFoundException` e `DatabaseException`.



## Training Configuration & Seeding

Para garantir que o sistema inicie com dados funcionais para teste, foi implementado um **Database Seeding**:

* **Profile "test"**: Ativa o banco H2 e popula tabelas automaticamente ao iniciar a aplicação.


* **Dados de exemplo**: Instanciação de usuários como "Maria Brown" e "Alex Green", além de produtos e pedidos associados.



## How to Run

### Local (Desenvolvimento)

1. Clone o repositório do projeto.


2. Certifique-se de ter o Maven e o Java instalados.


3. Configure o arquivo `application.properties` para usar o perfil `test`.


4. Execute o comando:
```bash
mvn spring-boot:run

```


5. Acesse o console do H2 em `http://localhost:8080/h2-console` para visualizar os dados.
