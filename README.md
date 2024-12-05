# Sistema de Cadastro de Séries e Posts

Este é um projeto que implementa uma API RESTful para cadastro de **Séries de TV** e **Posts** relacionados às séries. O projeto é desenvolvido utilizando **Spring Boot** e um banco de dados relacional para armazenar as informações.

## Funcionalidades

- **Cadastro de Séries**: Permite registrar informações sobre as séries de TV, como nome, gênero, ano de lançamento, quantidade de temporadas e classificação indicativa.
- **Posts**: Usuários podem criar posts sobre as séries, e cada post pode ser associado a uma série específica.
- **Comentários**: Usuários podem comentar nos posts criados por outros usuários.
- **Curtidas**: Usuários podem curtir os posts criados por outros usuários.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para criar a API RESTful.
- **JPA (Java Persistence API)**: Para mapeamento objeto-relacional.
- **H2 Database**: Banco de dados em memória para desenvolvimento (pode ser trocado por outro como MySQL ou PostgreSQL).
- **Lombok**: Para redução de código boilerplate (getter, setter, construtores, etc.).
- **Spring Security**: Para autenticação e autorização (opcional, não implementado nesta versão).
- **Spring Boot Validation**: Para validar dados de entrada.

## Endpoints

### Séries

- **GET /series**: Retorna uma lista de todas as séries cadastradas.
- **GET /series/{id}**: Retorna os detalhes de uma série específica.
- **POST /series**: Adiciona uma nova série.
- **PUT /series/{id}**: Atualiza os dados de uma série existente.
- **DELETE /series/{id}**: Remove uma série do cadastro.

### Posts

- **GET /posts**: Retorna todos os posts.
- **GET /posts/{id}**: Retorna um post específico.
- **POST /posts**: Cria um novo post (associado a uma série e a um usuário).
- **DELETE /posts/{id}**: Exclui um post.

### Comentários

- **GET /comments/{postId}**: Retorna todos os comentários de um post.
- **POST /comments**: Adiciona um novo comentário a um post.

### Curtidas

- **POST /likes**: Adiciona uma curtida a um post.
