
# 🎯 Desafio QE API

Este é um projeto de automação de testes para a API, desenvolvido como parte do desafio proposto. As tecnologias e frameworks utilizados incluem o Selenium para automação de testes, a linguagem de programação Java para desenvolvimento dos casos de teste, o Gradle para gerenciamento de dependências e execução de testes, o Faker para geração de dados de teste aleatórios, o Rest Assured para realização de requisições HTTP e asserções de resposta, e o Allure Reports para geração de relatórios detalhados de execução dos testes.

## 🛠️ Ferramentas

- [Java 8 ou superior](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
- [Gradle 8.6](https://gradle.org/install/)
- [Git](https://git-scm.com/downloads)
- [Allure Reports](https://docs.qameta.io/allure/#_installing_a_commandline)

# 📋 Plano de Teste e Estratégia de Testes

## Escopo

Este plano de teste cobre os testes automatizados desenvolvidos usando RestAssured e Gradle para a API de Autenticação e Produtos. Os testes visam garantir o comportamento correto da API em várias operações, incluindo autenticação, criação de um produto, busca de produtos por id, listagem de produtos por autenticação e listagem de usuários.

## Testes Automatizados

### ✔️ Testes de Sucesso:

1. **Teste para obter o Token de Autenticação - "POST /auth/login"**
   - **Objetivo:** Verificar se o token de autenticação é obtido corretamente após fornecer credenciais válidas.
   
2. **Teste para buscar Produtos com Token gerado - "GET /auth/products"**
   - **Objetivo:** Verificar se é possível buscar produtos após autenticar com sucesso usando o token obtido no primeiro teste.

3. **Teste para obter detalhes do Produto por ID - "GET /products/{id}"**
   - **Objetivo:** Verificar se é possível obter os detalhes de um produto específico fornecendo seu ID.
   
4. **Teste para obter uma Lista de Produtos - "GET /products"**
   - **Objetivo:** Verificar se é possível obter uma lista de produtos com seus detalhes.

5. **Teste para requisição de GET de forma Genérica - "GET /test"**
   - **Objetivo:** Verificar se uma requisição GET genérica retorna os dados esperados.
  
6. **Teste para obter uma Lista de Usuários - "GET /users"**
   - **Objetivo:** Verificar se é possível obter uma lista de usuários com seus detalhes.
   
7. **Teste para Adicionar um Produto - "POST /products/add"**
   - **Objetivo:** Verificar se é possível adicionar um novo produto à API.


### ❌ Testes de Erro:

1. **Teste para Status 403 Forbidden ao Não Passar o Header 'Authorization'**
   - **Objetivo:** Verificar se a API retorna o status HTTP 403 Forbidden quando o campo 'Authorization' não é passado na solicitação.
   
2. **Teste para Status 401 Unauthorized ao Passar um Token Expirado**
   - **Objetivo:** Verificar se a API retorna o status HTTP 401 Unauthorized quando é passado um token expirado na solicitação.
   
3. **Teste para Status 404 Not Found de um Produto Não Encontrado**
   - **Objetivo:** Verificar se a API retorna o status HTTP 404 Not Found ao buscar um produto que não existe.
   

## Estratégia de Testes

A estratégia de testes aplicadas no projeto inclui:

- **Teste de Unidade**: Verificar unidades individuais do código, como métodos e classes, usando testes unitários.

- **Teste de Integração**: Testar a integração entre diferentes componentes do sistema.

- **Teste Funcional**: Testar o comportamento funcional da API em diferentes cenários de uso, garantindo que ela funcione conforme o esperado.

## 🎲 Instruções de Configuração

1. **Instalar um Ambiente de Desenvolvimento Integrado (IDE)**:
   - Baixe e instale o [IntelliJ IDEA](https://www.jetbrains.com/idea/) no site oficial ou qualquer outra IDE de sua preferência, como o Visual Studio Code, disponível [aqui](https://code.visualstudio.com/).

2. **Extensões**:
   - Adicione a extensão do Gradle para Java no IntelliJ IDEA e no Visual Studio Code.

3. **Instalar o Git**:
   - Se o Git ainda não estiver instalado em sua máquina, siga estas instruções de acordo com o seu sistema operacional:
     - **Windows**: Faça o download e instale a partir [deste link](https://git-scm.com/download/win).
     - **Linux**: Execute `sudo apt-get install git-all` no terminal.
     - **Mac**: Instale via Homebrew executando `brew install git` no terminal.

4. **Instalar o JDK Java 8**:
   - Crie uma conta na [Oracle](https://www.oracle.com/).
   - Faça o download do JDK Java 8 no [site da Oracle](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) após autenticação.
   - Escolha o instalador apropriado para o seu sistema operacional.

5. **Configurar Variáveis de Ambiente do Java 8**:
   - **Windows**:
     - Copie o diretório do JDK Java instalado (exemplo: C:\Program Files\Java\jdk1.8.0_202\bin).
     - Vá para "Variáveis de ambiente" nas Propriedades do Sistema.
     - Crie uma nova Variável de Sistema:
       - Nome da variável: `JAVA_HOME`
       - Valor da variável: Caminho para o diretório do JDK Java.
     - Faça o mesmo para a variável de ambiente do usuário:
       - `Path` > Editar > Novo > Cole o caminho do JDK Java.
     - Certifique-se de que a configuração foi bem-sucedida digitando `java -version` no terminal.
   - **Linux** e **Mac**:
     - Configure as variáveis de ambiente conforme as instruções do seu sistema operacional [link de ajuda](https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26).

6. **Clonar o Projeto**:
   - Clone o projeto usando o seguinte comando no terminal:

   ```bash
   git clone https://github.com/lucasskora/sicredi-desafio-qe.git

# 🎲 Instalação do Gradle

## Por que o uso do Gradle no projeto?

O Gradle, é uma ferramenta de automação de compilação, amplamente reconhecida por sua integração com frameworks de teste populares, como o JUnit. Sua capacidade de gerenciar dependências de forma eficiente, combinada com uma sintaxe declarativa baseada em Groovy ou Kotlin, torna-o uma escolha excelente para projetos que requerem testes robustos e escaláveis.
Sua flexibilidade e extensibilidade permitem uma configuração altamente personalizada, facilitando a integração contínua e a entrega contínua de software de alta qualidade.

**Para instalar o Gradle na sua máquina, siga as instruções abaixo:**

1. Baixe o Gradle manualmente [aqui](link_para_baixar_o_gradle).
2. Extraia a pasta.
3. Copie o diretório onde você extraiu o Gradle (por exemplo: `C:\Users\Lucas\Downloads\gradle-8.6-bin\gradle-8.6`).
4. Vá para "Variáveis de ambiente" nas Propriedades do Sistema.
5. Crie uma nova Variável de Usuário:
    - Nome da variável: `GRADLE_HOME`
    - Valor da variável: `C:\Users\Lucas\Downloads\gradle-8.6-bin\gradle-8.6`
6. Em seguida, adicione ao Path:
    - `Path > Editar > Novo >` cole o caminho do Gradle.
7. Certifique-se de que a configuração foi bem-sucedida digitando `gradle -v` no terminal.


**Para instalar o Gradle em seu projeto, siga as seguintes etapas:**

**Obs**: O projeto aqui configurado já vem montado, mas caso queira construir um do início, siga os seguintes passos:

1. Abra um terminal.

2. Navegue até o diretório raiz do seu projeto "sicredi-desafio-qe".

3. Execute o comando `gradle init` para iniciar a inicialização do projeto Gradle.

4. Selecione o tipo de projeto a ser gerado. Por exemplo, para uma aplicação, selecione a opção `**application**`.

5. Escolha a linguagem de implementação. Por exemplo, para Java, selecione a opção `**Java**`.

6. Se necessário, você pode optar por gerar múltiplos subprojetos para a aplicação.

7. Escolha o tipo de script de construção (build script DSL). Por padrão, o **Groovy** é selecionado.

8. Escolha o framework de teste desejado. Por exemplo, para JUnit 4, selecione a opção `**JUnit 4**`.

Após seguir essas etapas, o Gradle estará configurado em seu projeto.

![image](https://github.com/lucasskora/sicredi-desafio-qe/assets/38669101/6ae9d73a-8756-41b1-8916-37c4e77627b0)

## Principais Comandos do Gradle:

- `gradle init`: cria o projeto Gradle.
- `gradle wrapper`: necessário para criar o wrapper do Gradle para executar o `gradlew`.
- `./gradlew tasks`: mostra todas as tarefas disponíveis.
- `./gradlew test`: executa todos os testes no pacote `src/test`.

### Dica: Caso tenha problema com as dependências, siga este caminho no IntelliJ:

![image](https://github.com/lucasskora/sicredi-desafio-qe/assets/38669101/31745ef2-cd81-4522-8a4f-3a41790b7363)


## ✔️ Como Executar os Testes

### Via IDE do IntelliJ e VSCode

1. Abra o projeto no IntelliJ IDEA ou no Visual Studio Code.
2. Navegue até a classe de teste que deseja executar, por exemplo, `AuthProductsTest`.
3. Para executar todos os testes na classe, clique com o botão direito do mouse na classe de teste "qe.sicredi.api" ou no runners "AllTestsRunner" e selecione a opção "Run" (IntelliJ) ou "Run Test" (VSCode).
4. Para executar um teste único, clique com o botão direito do mouse no método de teste desejado dentro da classe de teste e selecione "Run" (IntelliJ) ou "Run Test" (VSCode).

   ![image](https://github.com/lucasskora/sicredi-desafio-qe/assets/38669101/25b24feb-9233-42e5-9b32-f678a0c5a451)


### Via Terminal com o Comando Gradle

1. Abra o terminal.
2. Navegue até o diretório raiz do projeto clonado.
3. Para executar todos os testes, use o seguinte comando:

   ```bash
   ./gradlew test

![image](https://github.com/lucasskora/sicredi-desafio-qe/assets/38669101/3421cdec-ece1-4e57-b9f9-ff730085e1ab)


### Via Terminal com o Allure Reports

1. Abra o terminal.
2. Navegue até o diretório raiz do projeto clonado.
3. Execute `./gradlew allureServe` para gerar e exibir o relatório Allure após a execução dos testes.

![image](https://github.com/lucasskora/sicredi-desafio-qe/assets/38669101/3750a377-898d-4b4a-9298-a0853f2373dc)

![image](https://github.com/lucasskora/sicredi-desafio-qe/assets/38669101/28151e38-de69-4318-b618-c7bf5c3ac60f)

### 🔗 Pipeline CircleCI

O CircleCI é uma plataforma de integração contínua que automatiza o processo de construção, teste e implantação de software. Ele se integra ao GitHub permitindo que seja configurado pipelines de CI/CD diretamente em seus repositórios do GitHub.

A integração do CircleCI com o GitHub funciona da seguinte maneira:

- **Configuração do Pipeline:** Os desenvolvedores criam um arquivo de configuração YAML chamado .circleci/config.yml em seus repositórios do GitHub. Este arquivo descreve os passos a serem executados no pipeline de CI/CD, incluindo a instalação de dependências, execução de testes, construção de artefatos e implantação de código.

- **Disparo Automático de Pipelines**: Sempre que ocorre uma alteração no repositório do GitHub (push, pull request etc.), o CircleCI é acionado automaticamente para executar o pipeline configurado. Isso garante que todas as alterações de código sejam testadas e validadas rapidamente.

- **Execução do Pipeline:** O CircleCI executa os passos definidos no arquivo config.yml, como a instalação de dependências, execução de testes e criação de artefatos. Ele fornece feedback em tempo real sobre o status da execução do pipeline e notifica os desenvolvedores sobre quaisquer problemas encontrados.

![image](https://github.com/lucasskora/sicredi-desafio-qe/assets/38669101/8df287f4-5696-4bf6-8dec-d43fb122d44a)

![image](https://github.com/lucasskora/sicredi-desafio-qe/assets/38669101/f0e9f071-3168-4904-b823-c75451257b47)

![image](https://github.com/lucasskora/sicredi-desafio-qe/assets/38669101/bf0ca738-7657-43b1-ab85-02fbc577b381)


## 📝 Anotações

### 🚀 Melhorias nas API's

#### GET list /users
1. Adicionar filtros nos parâmetros, para que se possa listar dados de acordo consultar dados conforme usuário deseje.
   - Exemplo: quero que liste idades entre 30 anos e 50 anos
     - Parâmetros:
       - age_initial = 30
       - age_final = 50
     - Exemplo de consulta: `dummyjson.com/users?age_initial=30&age_final=50`
2. Adicionar informação de paginação (page) e total de páginas (total_page)
   - No response apresenta informação de Skip, então como ponto de melhoria, alterar para “page” e “total_page”
   - Acima de 150 itens deve ter uma nova página, e criar um parâmetro para filtrar por página também
     ```
     "total_items": 150,
     "page": 0,
     "limit": 30
     ```

#### POST /auth/login
- Status retornando 200 Ok, o correto seria 201 Created, conforme documentação.
- Criar validações de status 400 Bad Request para o campo username e password:
  - `INVALID_DATA_TYPE` (passando um valor diferente, um boolean por exemplo)
  - `INVALID_VALUE` (um dado diferente do esperado, ex:  “username”: “teste”)
  - `REQUIRED_ATTRIBUTE_MISSING`: Quando um campo do contrato não é passado na request, por exemplo: processar a request sem o campo password.
 
    ex:
```
    {
    "error": {
        "id": "83c447a7-a0c1-4f9f-a62e-3f321c7ac389",
        "description": "Bad request",
        "code": "400",
        "error_details": [
            {
                "attribute": "password",
                "messages": [
                    "REQUIRED_ATTRIBUTE_MISSING"
                ]
            }
        ]
    }
}
 ```
#### POST /auth/products
- Status retornando 200 Ok, o correto seria 201 Created, conforme documentação.

#### POST /products/add
- Criar validações de status 400 Bad Request para todos os campos do contrato:
  - `INVALID_DATA_TYPE`: (passando um valor diferente, um boolean por exemplo)
  - `INVALID_VALUE`: (um dado diferente do esperado)
  - `REQUIRED_ATTRIBUTE_MISSING`: Processar a request sem um campo definido no contrato.
  - `INVALID_LENGHT`: Validar comprimento de dados, mínimo e máximo permitido em um campo.
 
#### GET /products/:id
- É interessante que o ID seja passado como parâmetro na URL para uma consulta específica.
  - Exemplo de consulta: curl --location 'dummyjson.com/products/?id=1'
 
* Internal server erro (500) apresentar apenas quando houver um problema no servidor e banco de dados.

### 🚀 Melhorias no projeto

- Analisando que tem dados sensíveis como a request de POST /auth/login de username e password, o correto seria colocar em um arquivo .yml ou .env. e depois no .gitignore.
No projeto já criei o arquivo chamado application.yml em "resources", com visão de não disponibilizar no GitHub dados sensíveis em uma situação real.

- Melhorar a esteira de testes no CircleCI, para apresentar detalhadamente os testes executados, atualmente está rodando o Runner e apresentando sucesso sem detalhes, realizei integrando com o GitHub, pois não tem integração com o GitLab.

- Utilização de JSON Schema.

- Isolar a chamada de URL, com encapsulamento, evitando repetição de código nos testes.

### ❌ Bugs

#### POST /auth/login

- Status retornando 200 Ok, o correto seria 201 Created, conforme documentação.

![image](https://github.com/lucasskora/sicredi-desafio-qe/assets/38669101/0be10bc5-8da7-4132-9fe8-9b4e7fa26b41)

![image](https://github.com/lucasskora/sicredi-desafio-qe/assets/38669101/2080e1a8-ab47-463b-b193-a67f1b0bc08a)

- Ao passar um valor diferente de uma string, o serviço retorna um status 500 internal server error, o correto seria retornar um 400 “INVALID_DATA_TYPE"

#### POST /products/add

- Status retornando 200 Ok, o correto seria 201 Created, conforme documentação.

![image](https://github.com/lucasskora/sicredi-desafio-qe/assets/38669101/963bb0e3-17ae-4c70-bd94-76047f6b945b)

![image](https://github.com/lucasskora/sicredi-desafio-qe/assets/38669101/f980d052-5061-412a-9491-98c189197ea9)


- É possível executar request usando outros formatos nos campos, não está respeitando os formatos.
  - Exemplo: campo “price” que seria um tipo number, é possível criar como uma string, boolean e int.

