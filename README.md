# EventORG

EventORG é uma aplicação de gerenciamento de eventos desenvolvida em Java com Spring Boot. Permite criar, listar e buscar eventos por identificador através de uma API REST e um front-end básico.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 4.0.6**
- **Spring Data JPA** para persistência de dados
- **Flyway** para migrações de banco de dados
- **PostgreSQL** como banco de dados
- **Lombok** para redução de boilerplate
- **Maven** para gerenciamento de dependências

## Pré-requisitos

- Java 17 instalado
- PostgreSQL instalado e rodando
- Maven (ou use o wrapper incluído)

## Configuração do Banco de Dados

1. Instale e inicie o PostgreSQL.
2. Crie um banco de dados chamado `eventorg_db`:
   ```sql
   CREATE DATABASE eventorg_db;
   ```
3. Crie um usuário `postgres` com senha `kaka2911` (ou ajuste as configurações em `application.yaml`).

## Como Executar

1. Clone o repositório (se aplicável).
2. Navegue até o diretório do projeto.
3. Execute o comando:
   ```bash
   ./mvnw spring-boot:run
   ```
   Ou no Windows:
   ```cmd
   mvnw.cmd spring-boot:run
   ```

A aplicação estará rodando em `http://localhost:8080`.

## Front-End

Um front-end básico está disponível em `http://localhost:8080/index.html`. Ele permite:
- Criar novos eventos
- Listar todos os eventos
- Buscar eventos por identificador

## API Endpoints

### Criar Evento
- **POST** `/api/v1/criarevento`
- **Body**: JSON com os dados do evento (EventDTO)
- **Exemplo**:
  ```json
  {
    "nome": "Nome do Evento",
    "descricao": "Descrição",
    "dataInicio": "2023-12-01T10:00:00",
    "datafim": "2023-12-01T12:00:00",
    "localEvento": "Local",
    "capacidade": 100,
    "organizador": "Organizador",
    "tipo": "SEMINARIO"
  }
  ```

### Listar Eventos
- **GET** `/api/v1/buscareventos`
- Retorna uma lista de EventDTO

### Buscar por Identificador
- **GET** `/api/v1/filtrareventos/{identificador}`
- Retorna o evento correspondente

## Estrutura do Projeto

- `src/main/java/kkfujita/dev/eventORG/`
  - `core/`: Lógica de negócio (entidades, casos de uso, enums)
  - `infra/`: Infraestrutura (controllers, repositories, mappers, etc.)
- `src/main/resources/`
  - `application.yaml`: Configurações
  - `db/migration/`: Scripts de migração Flyway
  - `static/`: Arquivos estáticos (front-end)

## Testes

Para executar os testes:
```bash
./mvnw test
```

## Contribuição

Contribuições são bem-vindas. Siga as melhores práticas de desenvolvimento Java e Spring Boot.

## Licença

Este projeto está sob a licença [inserir licença, se aplicável].</content>
<parameter name="filePath">C:\Users\User\projetos\eventORG\README.md
