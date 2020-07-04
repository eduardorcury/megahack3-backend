# Backend da aplicação *Alaobá*

> Web App desenvolvido pelo Time 43 durante a [3ª edição da MegaHack](https://www.megahack.com.br/), como solução para o [Desafio Ambev](https://www.c4publicidade.com.br/megahack/wp-content/uploads/2020/06/Desafio-Ambev.pdf).

## :wrench: &nbsp;&nbsp; Ferramentas utilizadas

- Java 8
- [Spring Boot](https://github.com/spring-projects/spring-boot)
- [MongoDB](https://github.com/mongodb/mongo)
- [Spring Data MongoDB](https://github.com/spring-projects/spring-data-mongodb)
- [Spring Security](https://github.com/spring-projects/spring-security)
- [JWT](https://jwt.io/)
- [Heroku](https://www.heroku.com/)
- [Swagger](https://swagger.io/)

## :bulb: &nbsp;&nbsp; Funcionalidades

- Cadastro de clientes e bares e armazenamento no banco de dados MongoDB.
- Login de clientes com autenticação e autorização pelo Spring Security e token JWT. 
- Retorno de clientes e bares armazenados.
- Endpoint para pesquisa de bares por nome e produtos oferecidos.

A documentação gerada pelo Swagger pode ser consultada [aqui](https://megahack3-time43-backend.herokuapp.com/swagger-ui.html).

## :mag: &nbsp;&nbsp; Como testar a aplicação

O Backend foi hospedado com o heroku e pode ser acessado [aqui](https://megahack3-time43-backend.herokuapp.com/).
Caso se queira fazer modificações no código, faça a clonagem do projeto. Na pasta do projeto, abra um terminal e instale as dependências do projeto digitando:
```
mvn clean install
```
Em seguida, execute a aplicação digitando:
```
mvn spring-boot:run
```
*Nota: é preciso ter instalado o Java 8 e Maven na máquina.*

