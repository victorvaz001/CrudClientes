## Projeto Spring Boot - Clients

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/victorvaz001/workshop-springboot3-jpa/edit/main/LICENSE) 

## Sobre o Projeto
O Project Clients foi desenvolvido durante o curso Java Spring Professional da escola devsuperior, ministrado no site devsuperior.club

Project Client e uma aplicação back-end, contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas.

• Busca paginada de recursos
• Busca de recurso por id
• Inserir novo recurso
• Atualizar recurso
• Deletar recurso

## Configuração
O Projeto já está configurado para ambinte de teste, seed de cliente, Banco de dados H2, JPA e WEB

## Competencias 
•  Implementação de operações de CRUD
•  Tratamento de exceções
•  Customização de respostas HTTP
•  Validação de dados com Bean Validation


## Tratamento de codigos de erro
- Busca por id retorna cliente existente
- Busca por id retorna 404 para cliente inexistente
- Busca paginada retorna listagem paginada 
- Inserção de cliente insere cliente com dados válidos
- Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos
- Atualização de cliente atualiza cliente com dados válidos
- Atualização de cliente retorna 404 para cliente inexistente
- Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos
- Deleção de cliente deleta cliente existente
- Deleção de cliente retorna 404 para cliente inexistente

## Tecnologias
  - Java 17
  - Spring Boot 3
  - Maven
  - Base de dados (H2)

## Modelo de dominio
![image](https://github.com/victorvaz001/CrudClientes/assets/42657636/e952249c-6a66-429a-91ea-6c611417e699)

  ## Teste Endpoint com o Postman

  - Recuperando client por id

![image](https://github.com/victorvaz001/CrudClientes/assets/42657636/5370b1be-66c2-4bed-8b6b-44f08266260f)

  - Recuperando clientes com busca paginada

![image](https://github.com/victorvaz001/CrudClientes/assets/42657636/36c52b97-5541-4d1b-921b-d1d68f8891e8)

  - Cadastro de cliente
  - Status: 201 Created
![image](https://github.com/victorvaz001/CrudClientes/assets/42657636/b9b58151-61af-4ef8-91c5-c57b0d1db18c)

  - Atualizando cliente
![image](https://github.com/victorvaz001/CrudClientes/assets/42657636/5eb44018-3ac7-4f33-8f06-537a57bc2ecc)

  - Deletando cliente
  - Status: 204 No Content

![image](https://github.com/victorvaz001/CrudClientes/assets/42657636/5f18e69e-4794-466d-890f-5bdb003d12bf)


## Como executar o projeto - Windows
-  Copiar a URL do projeto na aba SSH
-  Executar o comando git clone com a url do projeto
-  Importar o projeto para alguma IDE

## Tabela
 - TB_CLIENT


## Autor

- Victor Gonçalves Vaz

https://www.linkedin.com/in/victor-goncalves-vaz-/
    
