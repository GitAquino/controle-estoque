# Projeto: Spring boot com Hibernate, lombok e JPA
## Descrição
Este projeto é uma aplicação Java que gerencia produtos em um sistema de controle de estoque. 
Ele permite a inclusão, alteração, remoção e listagem de produtos utilizando Spring Boot, Hibernate, Lombok e JPA.
## Estrutura do Projeto
A estrutura do projeto é organizada em pacotes, cada um responsável por uma parte específica da aplicação:

**model**: Contém a classe Produto que representa os produtos no sistema.  
**util**: Contém a classe ExceptionManager para encapsular a conexão com o banco de dados e tratar exceções.  
**testes**: Contém classes para testar as operações de inclusão, alteração, remoção e listagem de produtos.

## Classes Principais
### Model
**InclusaoDeProduto**: Classe para incluir novos produtos no banco de dados.  
**AlteracaoDeProduto**: Classe para alterar os dados de um produto existente.  
**RemocaoDeProduto**: Classe para remover um produto do banco de dados.  
**ListaTodosProdutos**: Classe para listar todos os produtos do banco de dados.  

## Estrutura do Projeto

````
controle-estoque/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── cursopcv/
│   │   │           └── main/
│   │   │               ├── model/
│   │   │               │   ├── AlteracaoDeProduto.java
│   │   │               │   ├── InclusaoDeProduto.java
│   │   │               │   ├── ListaTodosProdutos.java
│   │   │               │   └── RemocaoDeProduto.java
│   │   │               ├── model/
│   │   │               │   └── Produto.java
│   │   │               └── util/
│   │   │                   └── ExceptionManager.java
│   └── resources/
│       ├── META-INF/
│       │ └── persistence.xml
│       └── application.properties
├── .gitignore
├── pom.xml
└── README.md
````
## Como Executar
- Clone o repositório.
- Importe o projeto em sua IDE preferida.
- Compile e execute a aplicação.

## Licença
Este projeto está voltado para fins educacionais e processo seletivo Solutis DevTrail.