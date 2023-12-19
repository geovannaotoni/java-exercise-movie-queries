# 🎥 🔍 Consultas de Filmes
Este projeto visa exercitar a manipulação de coleções em Java, realizando consultas sobre filmes utilizando as interfaces List, Set, Map e a API Stream do Java. A aplicação possui classes que representam filmes (`Movie.java`), a classe Movies (`Movies.java`) que contém a coleção de filmes, bem como uma classe principal (`Main.java`) para executar consultas.

### 💡 Detalhes da Classe Movie
A classe `Movie.java` representa um filme com os seguintes campos:
- **categories**, **directors**, **actors** e **characters**: são conjuntos de Strings, permitindo múltiplos valores.
- **actorsByCharacters**: é um Map que associa o nome de um personagem (*String*) a um conjunto de artistas (*Set<String>*), permitindo a representação de diferentes interpretações para um mesmo personagem em um filme.

## ⚙️ Instalação das dependências
Para instalar as dependências do projeto, execute o comando `mvn install`. Isso fará o download das dependências configuradas no `pom.xml`, além de baixar as dependências indiretas.

## :white_check_mark: Funcionalidades Implementadas
Foi implementada a classe `Queries.java`, que realiza consultas sobre a coleção de filmes disponibilizada, sendo elas:
1) Listar os filmes lançados em um ano específico.
2) Retornar uma lista ordenada com os nomes de todos os atores e atrizes.
3) Retornar um Map que mapeia os atores/atrizes aos filmes que eles interpretaram.
4) Listar em um Set os artistas que interpretaram a si próprios.
5) Listar os artistas que atuaram em filmes de uma determinada pessoa diretora, ordenados alfabeticamente.
6) Listar os filmes em que a pessoa diretora atuou (ou pelo menos um deles), ordenados por lançamento (mais recentes primeiro).
7) Listar os filmes lançados num determinado ano, agrupados por categoria.

## 🧹 Linter (Checkstyle)
O Checkstyle é usado para fazer a análise estática do código. Este projeto já vem com as dependências relacionadas ao linter configuradas no arquivo `pom.xml`. Caso deseje rodar o Checkstyle manualmente, basta executar o comando `mvn checkstyle:check`.

## ℹ️ Considerações finais
Este projeto é apenas para fins educacionais. Qualquer dúvida ou sugestão, sinta-se à vontade para entrar em contato.
