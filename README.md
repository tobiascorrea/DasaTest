# DasaTest
Automacao Dasa Test

# Sobre o proejto
Projeto desenvolvido na linguagem Java com a IDE intellij, arquitetura padrão PageObject com aplicação dos principios SOLID.

## Setup
Caso seja necessário atualizar o arquivo Pom.xml para baixar as dependências.

**Pastas do projeto**

**core** 
 - Pacote que tem todo os fontes compartilhados na aplicação
 - 
**elemets** 
- Pacote que tem as classes com as strings que fazem referências aos elementos da página como (id, class, name, xpath) etc..

**pages** 
- Pacote que terá as classes que irá representar a página que esta em teste ex: TodoPage, LoginPage etc..

**runner** 
- Pacote que terá a classe que irá rodar a aplicação e gerar um arquivo de reports

**steps** 
- Pacote com a classe que será a execução dos steps definitions , criado em BDD, arquivo se encontra em **test/resources/features/todo.cadastrar.feature**

## Como executar
No projeto src/main/java/runner tem um arquivo chamado **TodoRunner**, nesta classe com botão direito executar o projeto

## Reports
Quando finalizado a execução dos testes ir até a pasta "target", nesta pasta foi criado uma pasta em tempo de execução com o nome
**"reports"**, nela estará o arquivo **todo_report.html** que é o report do teste, abrir em um navegador.


