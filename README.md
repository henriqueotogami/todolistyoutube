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
- [x] Vídeo-aula 05: [Documentando a aplicação com o Swagger;]()
- [x] Vídeo-aula 06: [Migrando o banco para o PostgreSQL e realizando Deploy no Heroku;]()
<hr>

### Resumos

<details>
    <summary> Resumo da vídeo-aula 01</summary>
    <hr>
</details>
<details>
    <summary> Resumo da vídeo-aula 02</summary>
<br>
    <div align="center">
      <img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-2-Imagem-1.png?raw=true">
      <img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-2-Imagem-2.png?raw=true">
      <img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-2-Imagem-3.png?raw=true">
    </div>
<br>

> Após clicar no botão de "Run" na classe "TodolistyoutubeApplication", copiar o endereço URL informado no console `jdbc:h2:mem:todolistyoutube`, conforme imagem 2 mostrada acima.
> 
> Abrir o endereço `http://localhost:8080/h2-console` no navegador, e inserir o endereço copiado (mencionado acima) no campo JDBC URL, conforme imagem abaixo.

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-2-localhost-8080-h2-console.png?raw=true">
    <hr>
</details>
<details>
    <summary> Resumo da vídeo-aula 03</summary>
<br>

> Utilizando o Postman como plataforma de desenvolvimento de `API`, através da URL `http://localhost:8080/api/v1/tasks`.
>
> Para criar a primeira tarefa, utilize o método `POST`. Após isso, selecione `Body` -> `raw` -> `JSON`, digite o código abaixo e clique no botão `SEND`:

```json
{
"title": "Gravando o terceiro vídeo",
"description":"Vídeo sobre criação e listagem de tarefas.",
"deadLine": "2021-09-30"
}
```

> O valor retornado no console do Postman, através do método `GET`, é mostrado abaixo:

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

<img alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-3-Post-Task-Postman-localhost.png?raw=true">

> Simulando erro, omitindo a informação de data no campo `deadLine`:

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-3-Simulando-Erro-500.png?raw=true">
<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-3-Simulando-Erro-500-IntelliJ.png?raw=true">

> Obtendo todas as tarefas criadas:

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-3-getAllTasks.png?raw=true">

> Obtendo tarefa por ID:

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-3-getTaskById.png?raw=true">

> Buscando todas as tarefas utilizando o `SELECT` na `H2 Database`:

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-3-SELECT-H2-Database-AllTasks.png?raw=true">

> Buscando somente as tarefas por `ID` utilizando o `SELECT` na `H2 Database`:

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-3-SELECT-H2-Database-TaskById.png?raw=true">

<hr>
</details>
<details>
    <summary> Resumo da vídeo-aula 04</summary>

> Realizando a atualização (PUT) e exclusão  (DELETE) de tarefas da nossa aplicação.
> 
> Lembrando que é necessário incluir a tarefa no banco de dados a cada atualização do código, 
> uma vez que o banco de dados atual não mantém o armazenamento das tarefas após ser desligado.
> 
> Isso será corrigido nas próximas aulas.

> DELETE - Excluindo a tarefa do banco de dados:
> 
> > POST - Inserindo a tarefa:

```json
{
    "id": 1,
    "title": "Gravando o quarto vídeo (04 de 06)",
    "description": "Vídeo sobre update e delete das tarefas.",
    "deadLine": "2021-09-27T19:00:00.000+03:00"
}
```

> > DELETE - Para esse método, o comando é vazio e, consequentemente, o retorno também:

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-4-PUT-updateTaskById.png?raw=true">

> PUT - Atualizando o título, a descrição e a data máxima da tarefa no banco de dados:
> 
> > POST - Inserindo a tarefa:

```json
{
    "id": 1,
    "title": "Gravando o quarto vídeo",
    "description": "Vídeo sobre editar/atualizar e excluir as tarefas.",
    "deadLine": "2021-10-05T00:00:00.000+00:00"
}
```

> > PUT - Atualizando a tarefa:

```json
{
    "id": 1,
    "title": "Gravando o quarto vídeo (04 de 06)",
    "description": "Vídeo sobre update e delete das tarefas.",
    "deadLine": "2021-09-27T19:00:00.000+03:00"
}
```

> > Retorno do método PUT:

```json
{
    "id": 1,
    "title": "Gravando o quarto vídeo (04 de 06)",
    "description": "Vídeo sobre update e delete das tarefas.",
    "deadLine": "2021-09-27T19:00:00.000+03:00"
    "createdAt": "2021-09-28T21:38:44.329+00:00",
    "updatedAt": "2021-09-28T21:45:01.896+00:00"
}
```

> > Veja que após a atualização da tarefa através do método PUT,
> > as datas de criação e atualização possuem horários diferentes.

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-4-DELETE-deleteTaskById.png?raw=true">
    <hr>
</details>
<details>
    <summary> Resumo da vídeo-aula 05</summary>

> Refatoração: Ao passar uma tarefa utilizando o método POST, é necessário informar o horário.
> A partir disso, o banco de dados armazena considerando o fuso horário local.

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-5-POST-Task.png?raw=true">

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

<img target="_blank" alt="" width="500" src="https://github.com/HenriqueMAP/todolistyoutube/blob/master/Aula-5-POST-Informacoes-Console.png?raw=true">

> 2021-10-05 19:21:20.686  INFO 967 --- [nio-8080-exec-4] c.k.t.controller.TaskController          : Criando uma nova tarefa com as informações 
> [Task(id=null, title=Gravando o quinto vídeo (05 de 06), description=Vídeo sobre documentação e refatoração do código., deadLine=2021-10-05T19:00, createdAt=null, updatedAt=null)]


<hr>
</details>
<details>
    <summary> Resumo da vídeo-aula 06</summary>
</details>

<hr>

### Tecnologias

- [x] [Maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html);
- [x] [Java 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html);
- [x] [Spring Boot 2.5.4](https://spring.io/projects/spring-boot);
- [x] [H2 Database](https://www.h2database.com/html/main.html);
- [x] Swagger | [SpringFox](https://springfox.github.io/springfox/);
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
> Build web, including RESTFul, applications using Spring MVC. 
> Uses Apache Tomcat as the default embedded container;
- [x] Spring Data JPA:
> Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate;
- [x] H2 Database:
> Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb)
> footprint. Supports embedded and server modes as well as a browser based console  application;
- [x] Lombok:
> Java annotation library which helps to reduce bollerplate code.

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
