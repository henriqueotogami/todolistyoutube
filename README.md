<div align="center">

## Projeto To Do List by [@Kamila Code](https://github.com/Kamilahsantos/)

#### Início: 07-09-2021 — Em andamento

#### [Repositório do projeto original](https://github.com/Kamilahsantos/serie-todo-list-youtube)

</div>
<br>
<div align="center">
<img width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/JAVA-Cover.png?raw=true">
</div>
<br>
<div align="center">
<img src="https://img.shields.io/github/issues/HenriqueMAP/todolistyoutube">
<img src="https://img.shields.io/github/forks/HenriqueMAP/todolistyoutube">
<img src="https://img.shields.io/github/stars/HenriqueMAP/todolistyoutube">
<img src="https://img.shields.io/github/license/HenriqueMAP/todolistyoutube">
</div>
<br>

### Descrição

> Esse projeto consiste em desenvolver uma aplicação semelhante a uma To-Do List (lista de tarefas).
> Nela será possível cadastrar tarefas, listar tarefas, buscar tarefas pelo ID, além de editar e excluir tarefas (CRUD).

> CRUD (Create, Read, Update, Delete) é um acrônimo para as maneiras de se operar em informação armazenada. 
> É um mnemônico para as quatro operações básicas de armazenamento persistente.

### Sumário

- [x] Vídeo-aula 01: [Introdução do projeto;](https://youtu.be/un7EgWqgNMs)
- [x] Vídeo-aula 02: [Inicialização do projeto com Spring Initializr e tabela H2 Database;](https://youtu.be/x0QtRR0Gp40)
- [x] Vídeo-aula 03: [Criando e listando as tarefas (POST e GET);](https://youtu.be/fR1O_U7Wd-c)
- [x] Vídeo-aula 04: [Editando/atualizando e excluindo as tarefas (PUT e DELETE);](https://youtu.be/jX6LAQQGunY)
- [x] Vídeo-aula 05: [Documentando a aplicação com o Swagger;](https://youtu.be/WMvaVwgrIFE)
- [x] Vídeo-aula 06: [Migrando o banco para o PostgreSQL e realizando Deploy no Heroku;](https://youtu.be/HIQtj5alGnE)
<hr>

### Resumos

<details>
    <summary> Resumo da vídeo-aula 01</summary>
<br>

> Apresentação do projeto através de uma visão panorâmica, mostrando as etapas e tecnologias utilizadas.

<hr>
</details>
<details>
    <summary> Resumo da vídeo-aula 02</summary>
<br>

> ### Aula 2
>
> Após executar a aplicação, o console será aberto, informando que o Spring está funcionando, 
> qual porta está utilizando, e qual é a URL de acesso.

> Console: Parte 1

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-2-Imagem-1.png?raw=true">

<br>

> Console: Parte 2

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-2-Imagem-2.png?raw=true">

<br>

> Console: Parte 3

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-2-Imagem-3.png?raw=true">

<hr>

> ### URL de acesso ao H2 Database
> 
> Com a aplicação executando, após clicar no botão de `Run` na classe `TodolistyoutubeApplication`, 
> copiar o endereço `URL` informado no console `jdbc:h2:mem:todolistyoutube`, conforme imagem do Console: Parte 2, mostrada acima.
> 
> Abrir o endereço `http://localhost:8080/h2-console` no navegador, e inserir o endereço copiado (mencionado acima) no campo `JDBC URL`, 
> conforme imagem abaixo.

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-2-localhost-8080-h2-console.png?raw=true">
<hr>

</details>
<details>
    <summary> Resumo da vídeo-aula 03</summary>
<br>

> ### Aula 3
> 
> Neste projeto, será utilizado o `Postman` como plataforma de desenvolvimento de `API`, através da URL `http://localhost:8080/api/v1/tasks`.

> ### Método POST
> 
> Para criar a primeira tarefa, utilize o método `POST`. 
> 
> Após isso, selecione `Body` -> `raw` -> `JSON`, digite o código abaixo e clique no botão `SEND`:
>
> ### JSON:

```json
{
    "title": "Gravando o terceiro vídeo",
    "description":"Vídeo sobre criação e listagem de tarefas.",
    "deadLine": "2021-09-30"
}
```

<hr>

> ### Método GET
> 
> O valor retornado no console do `Postman`, através do método `GET`, é mostrado abaixo:
>
> ### JSON:
```json
{
    "id": 1,
    "title": "Gravando o terceiro vídeo",
    "description": "Vídeo sobre criação e listagem de tarefas.",
    "deadLine": "2021-09-30T00:00:00.000+00:00",
    "createdAt": "2021-09-21T22:34:04.228+00:00",
    "updatedAt": "2021-09-21T22:34:04.228+00:00"
}
```

<img alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-3-Post-Task-Postman-localhost.png?raw=true">

<hr>

> ### Simulação de erro
> 
> Simulando erro, omitindo a informação de data no campo `deadLine`:

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-3-Simulando-Erro-500.png?raw=true">
<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-3-Simulando-Erro-500-IntelliJ.png?raw=true">

<hr>

> ### Método GET
> 
> Obtendo todas as tarefas criadas:

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-3-getAllTasks.png?raw=true">

> Obtendo tarefa por ID:

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-3-getTaskById.png?raw=true">

<hr>

> ### H2 Database: Utilizando SQL
> 
> Buscando todas as tarefas utilizando o `SELECT` na `H2 Database`:

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-3-SELECT-H2-Database-AllTasks.png?raw=true">

> Buscando somente as tarefas por `ID` utilizando o `SELECT` na `H2 Database`:

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-3-SELECT-H2-Database-TaskById.png?raw=true">

<hr>

</details>
<details>
    <summary> Resumo da vídeo-aula 04</summary>

<br>

> ### Aula 4
> 
> Realizando a atualização (PUT) e exclusão  (DELETE) de tarefas da nossa aplicação.
> 
> Lembrando que é necessário incluir a tarefa no banco de dados a cada atualização do código.
> 
> Isso é necessário porque o banco de dados atual não mantém o armazenamento das tarefas após ser desligado.
> 
> ### TODO:
> 
> **Isso será corrigido nas próximas aulas.**

> ### Método DELETE
>
> Excluindo a tarefa do banco de dados.
> 
> 1ª Etapa: Método POST - Inserindo a tarefa.
> 
> ### JSON:

```json
{
    "id": 1,
    "title": "Gravando o quarto vídeo (04 de 06)",
    "description": "Vídeo sobre update e delete das tarefas.",
    "deadLine": "2021-09-27T19:00:00.000+03:00"
}
```

> 2ª Etapa: DELETE
> 
> Para esse método, o comando é vazio e, consequentemente, o retorno também.

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-4-PUT-updateTaskById.png?raw=true">

<hr>

> ### Método PUT
> 
> Atualizando o título, a descrição e a data máxima da tarefa no banco de dados.
> 
> 1ª Estapa: POST - Inserindo a tarefa.
> 
> ### JSON:

```json
{
    "id": 1,
    "title": "Gravando o quarto vídeo",
    "description": "Vídeo sobre editar/atualizar e excluir as tarefas.",
    "deadLine": "2021-10-05T00:00:00.000+00:00"
}
```

> 2ª Etapa PUT
> 
> Atualizando a tarefa.
> 
> ### JSON:

```json
{
    "id": 1,
    "title": "Gravando o quarto vídeo (04 de 06)",
    "description": "Vídeo sobre update e delete das tarefas.",
    "deadLine": "2021-09-27T19:00:00.000+03:00"
}
```

> ### Resultado
> 
> Retorno do método PUT.
> 
> ### JSON:

```json
{
    "id": 1,
    "title": "Gravando o quarto vídeo (04 de 06)",
    "description": "Vídeo sobre update e delete das tarefas.",
    "deadLine": "2021-09-27T19:00:00.000+03:00",
    "createdAt": "2021-09-28T21:38:44.329+00:00",
    "updatedAt": "2021-09-28T21:45:01.896+00:00"
}
```

> Veja que após a atualização da tarefa através do método PUT,
> as datas de criação e atualização possuem horários diferentes.

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-4-DELETE-deleteTaskById.png?raw=true">

<hr>

</details>
<details>
    <summary> Resumo da vídeo-aula 05</summary>

<br>

> ### Refatorando o código
>
> Refatoração: Ao passar uma tarefa utilizando o método POST, é necessário informar o horário.
> A partir disso, o banco de dados armazena considerando o fuso horário local.

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-5-POST-Task.png?raw=true">

> ### JSON
> 
> Envio do método POST

```JSON

{
    "title": "Gravando o quinto vídeo (05 de 06)",
    "description": "Vídeo sobre documentação e refatoração do código.",
    "deadLine": "2021-10-05T19:00:00"
}

```

> Tarefa armazenada no banco de dados

```JSON

{
    "id": 1,
    "title": "Gravando o quinto vídeo (05 de 06)",
    "description": "Vídeo sobre documentação e refatoração do código.",
    "deadLine": "2021-10-05T19:00:00",
    "createdAt": "2021-10-05T19:21:20.731054",
    "updatedAt": "2021-10-05T19:21:20.73111"
}

```

> Informações no console

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-5-POST-Informacoes-Console.png?raw=true">

> 2021-10-05 19:21:20.686  INFO 967 --- [nio-8080-exec-4] c.k.t.controller.TaskController          : Criando uma nova tarefa com as informações 
> [Task(id=null, title=Gravando o quinto vídeo (05 de 06), description=Vídeo sobre documentação e refatoração do código., deadLine=2021-10-05T19:00, createdAt=null, updatedAt=null)]

> Atualizando a tarefa no banco de dados

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-5-POST-Atualizando-Tarefa.png?raw=true">

> Enviando pelo método PUT

```JSON

{
    "title": "Atualização: Gravando o quinto vídeo (05 de 06)",
    "description": "Vídeo sobre documentação e refatoração do código.",
    "deadLine": "2021-10-05T19:00:00"
}

```

> Atualização no Banco de dados

```JSON

{
    "id": 1,
    "title": "Atualização: Gravando o quinto vídeo (05 de 06)",
    "description": "Vídeo sobre documentação e refatoração do código.",
    "deadLine": "2021-10-05T19:00:00",
    "createdAt": "2021-10-07T18:15:47.463402",
    "updatedAt": "2021-10-07T18:18:34.990389"
}

```

<hr>

> ### Adicionando dependências
>
> Adicionando as dependências do `Springfox Swagger2` e `Springfox Swagger UI` no arquivo `pom.xml`:

```XML
    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger-ui</artifactId>
        <version>2.9.2</version>
    </dependency>
    
    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger2</artifactId>
        <version>2.9.2</version>
    </dependency>
```

<hr>

> ### Documentação
>
> Criar o diretório `docs` no endereço `src/main/java/com/kamilacode/todolistyoutube/`
> 
> Criar a classe `SwaggerConfiguration.java` no diretório `docs`.
>
> Depois de implementar a classe `src/main/java/com/kamilacode/todolistyoutube/docs/SwaggerConfiguration.java`
> 
> Executar a aplicação, e abrir a URL da Documentação no Swagger `http://localhost:8080/swagger-ui.html#/`

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-5-Documentacao-Swagger-UI.png?raw=true">

> Gerenciador de Tarefas
>
> Task-Controller
> 
> Adicionando mensagens para os erros retornados


<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-5-Documentacao-Tratamento-Mensagem-Erro.png?raw=true">

> Método: GET | Endereço: /api/v1/tasks | Listando todas as tarefas.

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-5-Documentacao-Tratam-GET-Listando-Tarefas.png?raw=true">

> Método: POST | Endereço: /api/v1/tasks | Criando uma nova tarefa.

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-5-Documentacao-Tratam-POST-Criando-Tarefas.png?raw=true">

> Método: GET | Endereço: /api/v1/tasks/{id} | Buscando uma tarefa pelo identificador único(ID).

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-5-Documentacao-Tratam-GET-Buscando-Tarefa.png?raw=true">

> Método: PUT | Endereço: /api/v1/tasks/{id} | Atualizando uma nova tarefa existente.

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-5-Documentacao-Tratam-PUT-Atualizando-Tarefa.png?raw=true">

> Método: DELETE | Endereço: /api/v1/tasks/{id} | Excluindo uma tarefa existente.

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/src/main/resources/img/Aula-5-Documentacao-Tratam-DELETE-Excluindo-Tarefa.png?raw=true">

<hr>
</details>
<details>
    <summary> Resumo da vídeo-aula 06</summary>

> ### Aula 06
> 
> #### Alternando do H2 Database para o PostgreSQL
> 
> Adicionando a dependência no arquivo pom.xml
> 
> todolistyoutube/pom.xml
> 
> #### XML:

```XML

<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
</dependency>

```

> Substituindo as configurações de banco de dados
> 
> `src/main/resources/application.properties`

```PROPERTIES

spring.datasource.url=${JDBC_DATASOURCE_URL}
spring.jpa.show-sql=true
spring.jpa.generate-ddl=true
server.port=${PORT:8080}

spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.maxActive=10
spring.datasource.maxIdle=5
spring.datasource.minIdle=2
spring.datasource.initialSize=5
spring.datasource.removeAbandoned=true

```

> Criar o arquivo que informe ao Heroku que esse projeto utiliza a versão 11 do Java.
> 
> `todolistyoutube/system.properties`
> 
> #### PROPERTIES:

```PROPERTIES

java.runtime.version=11

```

> ### Deploy no Heroku
> 
> Para instalar o Heroku: [https://devcenter.heroku.com/articles/heroku-cli](https://devcenter.heroku.com/articles/heroku-cli])
>
> 1 - Esteja na branch master, para criar o app no Heroku. Comando no console: `$ heroku create`
>
> 2 - Após criar o app, renomeie. Comando no console: `$ heroku apps:rename todolist-kamilacode-hmap`
>
> 3 - Link com o nome do app renomeado: [https://todolist-kamilacode-hmap.herokuapp.com/](https://todolist-kamilacode-hmap.herokuapp.com/)
> 
> 4 - Enviar a branch master para o Heroku: `$ git push heroku master`
</details>

<hr>

### Tecnologias

- [x] [Maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html);
- [x] [Java 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html);
- [x] [Spring Boot 2.5.4](https://spring.io/projects/spring-boot);
- [x] [H2 Database](https://www.h2database.com/html/main.html);
- [x] [Swagger](https://swagger.io) | [SpringFox](https://springfox.github.io/springfox/);
- [x] [Heroku](https://devcenter.heroku.com/categories/java-support);
- [x] [PostgreSQL](https://www.postgresql.org);

<hr>

### Ferramentas

- [x] [Git Bash](https://git-scm.com/downloads);
- [x] [Postman Desktop](https://www.postman.com);

<hr>

### IDE: IntelliJ IDEA Community Edition

#### Sistema: MacOS Big Sur - Versão 11.6

#### Plugins da IDE

- [Atom Material Icons](https://plugins.jetbrains.com/plugin/10044-atom-material-icons);
- [Codota AI Autocomplete for Java](https://plugins.jetbrains.com/plugin/7638-codota-ai-autocomplete-for-java-and-javascript);
- [GitToolBox](https://plugins.jetbrains.com/plugin/7499-gittoolbox);
- [Material Theme UI](https://plugins.jetbrains.com/plugin/8006-material-theme-ui);
- [Nyan Progress Bar](https://plugins.jetbrains.com/plugin/8575-nyan-progress-bar);
- [One Dark Theme](https://plugins.jetbrains.com/plugin/11938-one-dark-theme);
- [Rainbow Brackets](https://plugins.jetbrains.com/plugin/10080-rainbow-brackets);
- [Tabnine AI Code Completion](https://plugins.jetbrains.com/plugin/12798-tabnine-ai-code-completion-js-java-python-ts-rust-go-php--more);

<hr>

### Dependências

> As dependências listadas abaixo são obtidas a partir do site [Spring Initializr](https://start.spring.io).

<div align="center">
<img target="_blank" width="auto" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Spring-initializr.png?raw=true">
</div>
<br>

- [x] Spring Web: 
> Crie aplicativos da web, incluindo RESTFul, usando Spring MVC.
> Usa Apache Tomcat como o contêiner integrado padrão.;
- [x] Spring Data JPA:
> Persistir dados em armazenamentos SQL com Java Persistence API usando Spring Data e Hibernate.;
- [x] H2 Database:
> Fornece um banco de dados na memória rápido que suporta acesso JDBC API e R2DBC, com uma pegada pequena (2 MB).
> Suporta modos integrados e de servidor, bem como um aplicativo de console baseado em navegador.;
- [x] Lombok:
> Biblioteca de anotação Java que ajuda a reduzir o código clichê.

<hr>

### Créditos

- [x] [Foto de capa by Clay Banks | Unsplash - Photos for everyone;](https://unsplash.com/photos/oO6Gm16Cqcg)
- [x] [Shields.io | Badges Info from Github](https://img.shields.io)
- [x] [Alexandre Sanlim | Badges Tech](https://github.com/alexandresanlim/Badges4-README.md-Profile)

<hr>

> ### Caso você queira ajudar a melhorar este repositório, qualquer ajuda é bem vinda.

- [x] Faça um **fork** deste repositório (https://github.com/HenriqueMAP/todolistyoutube/fork);
- [x] Crie um **branch** com as suas modificações ` git checkout -b meu-novo-recurso `;
- [x] Faça um **commit** ` git commit -am 'Adicionando um novo recurso ...'`;
- [x] Faça um **push** ` git push origin meu-novo-recurso ` ;
- [x] Crie uma nova **pull request** neste repositório.

**Depois que sua solicitação (pull request) for aceita e adicionada (merged) ao ramo principal (branch main), você pode excluir sua branch tranquilamente.**

<div align="center">

<br>

> ### **Muito obrigado, e que a força esteja com você.**
>
> ### Desenvolvido por **HMAP | Henrique Matheus Alves Pereira** 🦁

</div>
