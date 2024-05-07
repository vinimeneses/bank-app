# Projeto de Aplicação Bancária

Este projeto é uma aplicação bancária simples desenvolvida usando Java, Spring Boot, MySQL, JPA, Hibernate e Postman.

## Tecnologias Utilizadas

- Java: Linguagem de programação usada para desenvolver o serviço.
- Spring Boot: Framework usado para criar a aplicação standalone e fácil de executar.
- MySQL: Sistema de gerenciamento de banco de dados usado para armazenar os dados da aplicação.
- JPA (Java Persistence API): Usado para mapear os objetos para os dados armazenados no banco de dados.
- Hibernate: Implementação da JPA usada para persistir os dados no banco de dados.
- Postman: Ferramenta usada para testar as APIs REST.

## Funcionalidades

A aplicação suporta as seguintes operações bancárias:

- Criar uma nova conta
- Obter detalhes de uma conta existente
- Depositar dinheiro em uma conta
- Sacar dinheiro de uma conta
- Obter detalhes de todas as contas
- Excluir uma conta

## Estrutura do Projeto

O projeto segue a estrutura padrão do Maven para um projeto Spring Boot:

- `src/main/java/net/javaguides/bankingapp`: Contém o arquivo principal `BankingAppApplication.java` que inicia a aplicação.
- `src/main/java/net/javaguides/bankingapp/controller`: Contém o `AccountController.java` que expõe as APIs REST.
- `src/main/java/net/javaguides/bankingapp/service`: Contém a interface `AccountService.java` que define os métodos de serviço.
- `src/main/java/net/javaguides/bankingapp/service/impl`: Contém a implementação `AccountServiceImpl.java` dos métodos de serviço.
- `src/main/java/net/javaguides/bankingapp/dto`: Contém o `AccountDto.java` que é um objeto de transferência de dados para a conta.
- `src/main/java/net/javaguides/bankingapp/entity`: Contém a entidade `Account.java` que é mapeada para a tabela de conta no banco de dados.
- `src/main/java/net/javaguides/bankingapp/mapper`: Contém o `AccountMapper.java` que mapeia a entidade da conta para o DTO e vice-versa.
- `src/main/java/net/javaguides/bankingapp/repository`: Contém o `AccountRepository.java` que interage com o banco de dados.

## Como Executar

1. Clone o repositório
2. Configure o `application.properties`
3. Navegue até o diretório do projeto
4. Execute `mvn spring-boot:run` para iniciar a aplicação
5. A aplicação estará rodando em `http://localhost:8080`

## Testando as APIs

Você pode usar o Postman ou qualquer outra ferramenta de teste de API para testar as APIs REST. As APIs disponíveis são:

- POST `/api/accounts`: Cria uma nova conta
- GET `/api/accounts/{id}`: Obtém detalhes de uma conta
- - GET `/api/accounts`: Obtém detalhes de todas as contas
- PUT `/api/accounts/{id}/deposit`: Deposita dinheiro em uma conta
- PUT `/api/accounts/{id}/withdraw`: Sacar dinheiro de uma conta
- DELETE `/api/accounts/{id}`: Exclui uma conta
