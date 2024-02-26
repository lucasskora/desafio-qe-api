# Sicredi Desafio QE

Este é um projeto de automação de testes para a API como parte do desafio do Sicredi.

# Plano de Teste e Estratégia de Testes

## Escopo

Este plano de teste cobre os testes automatizados desenvolvidos usando RestAssured e Gradle para a API de Autenticação e Produtos. Os testes visam garantir o comportamento correto da API em várias operações, incluindo autenticação, criação de um produto e busca de produtos.

## Testes Automatizados

Os testes automatizados consistem em:

1. **Teste para Obter Token de Autenticação**: Verifica se o token de autenticação é obtido corretamente após fornecer credenciais válidas.

2. **Teste para Buscar Produtos com Token de Autenticação**: Verifica se é possível buscar produtos após autenticar com sucesso usando o token obtido no primeiro teste.

3. **Teste para Status 403 Forbidden ao Não Passar o Header 'Authorization'**: Verifica se a API retorna o status HTTP 403 Forbidden quando o cabeçalho 'Authorization' não é passado na solicitação.

4. **Teste para Status 401 Unauthorized ao Passar um Token Expirado**: Verifica se a API retorna o status HTTP 401 Unauthorized quando é passado um token expirado na solicitação.

5. **Teste para Obter Detalhes do Produto por ID**: Verifica se é possível obter os detalhes de um produto específico fornecendo seu ID.

6. **Teste para Produto Não Encontrado**: Verifica se a API retorna o status HTTP 404 Not Found ao buscar um produto que não existe.

7. **Teste para Obter Lista de Produtos**: Verifica se é possível obter uma lista de produtos com seus detalhes.

8. **Teste para Requisição GET Genérica**: Verifica se uma requisição GET genérica retorna os dados esperados.

9. **Teste para Obter Lista de Usuários**: Verifica se é possível obter uma lista de usuários com seus detalhes.

10. **Teste para Adicionar Produto**: Verifica se é possível adicionar um novo produto à API.

## Estratégia de Testes

A estratégia de testes aplicadas inclui:

- **Teste de Unidade**: Verificar unidades individuais do código, como métodos e classes, usando testes unitários.

- **Teste de Integração**: Testar a integração entre diferentes componentes do sistema, 

- **Teste Funcional**: Testar o comportamento funcional da API em diferentes cenários de uso, garantindo que ela funcione conforme o esperado.

## Requisitos

- Java 8 ou superior
- Gradle 8.6
- Git
- Allure Reports

## Instruções de Configuração

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

# Instalação do Gradle

**Para instalar o Gradle, siga as instruções abaixo:**

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

1. Abra um terminal.

2. Navegue até o diretório raiz do seu projeto "sicredi-desafio-qe".

3. Execute o comando `gradle init` para iniciar a inicialização do projeto Gradle.

4. Selecione o tipo de projeto a ser gerado. Por exemplo, para uma aplicação, selecione a opção `**application**`.

5. Escolha a linguagem de implementação. Por exemplo, para Java, selecione a opção `**Java**`.

6. Se necessário, você pode optar por gerar múltiplos subprojetos para a aplicação.

7. Escolha o tipo de script de construção (build script DSL). Por padrão, o **Groovy** é selecionado.

8. Escolha o framework de teste desejado. Por exemplo, para JUnit 4, selecione a opção `**JUnit 4**`.

Após seguir essas etapas, o Gradle estará configurado em seu projeto.


## Principais Comandos do Gradle:

- `gradle init`: cria o projeto Gradle.
- `gradle wrapper`: necessário para criar o wrapper do Gradle para executar o `gradlew`.
- `./gradlew tasks`: mostra todas as tarefas disponíveis.
- `./gradlew test`: executa todos os testes no pacote `src/test`.

## Como Executar os Testes

### Via IDE do IntelliJ e VSCode

1. Abra o projeto no IntelliJ IDEA ou no Visual Studio Code.
2. Navegue até a classe de teste que deseja executar, por exemplo, `AuthProductsTestTest`.
3. Para executar todos os testes na classe, clique com o botão direito do mouse na classe de teste "qe.sicredi.api" ou no runners "AllTestsRunner" e selecione a opção "Run" (IntelliJ) ou "Run Test" (VSCode).
4. Para executar um teste único, clique com o botão direito do mouse no método de teste desejado dentro da classe de teste e selecione "Run" (IntelliJ) ou "Run Test" (VSCode).

### Via Terminal com o Comando Gradle

1. Abra o terminal.
2. Navegue até o diretório raiz do projeto clonado.
3. Para executar todos os testes, use o seguinte comando:

   ```bash
   ./gradlew test

### Via Terminal com o Allure Reports

1. Abra o terminal.
2. Navegue até o diretório raiz do projeto clonado.
3. Execute `./gradlew allureServe` para gerar e exibir o relatório Allure após a execução dos testes.

## Anotações

### Melhorias

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

### Bugs

#### POST /auth/login
- Ao passar um valor diferente de uma string, o serviço retorna um status 500 internal server error, o correto seria retornar um 400 “INVALID_DATA_TYPE"

#### POST /products/add
- É possível executar request usando outros formatos nos campos, não está respeitando os formatos.
  - Exemplo: campo “price” que seria um tipo number, é possível criar como uma string, boolean e int.

