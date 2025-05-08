# Cadastro de Pessoa CRUD

Este é um projeto Java simples que implementa as operações básicas de CRUD (Create, Read, Update, Delete) para o cadastro de pessoas. O objetivo principal é demonstrar como realizar essas operações utilizando Java, potencialmente com algum tipo de persistência de dados (a ser especificado).

## Funcionalidades

* **Cadastrar Pessoa:** Permite adicionar novas pessoas ao sistema, incluindo informações como nome, idade, etc.
* **Listar Pessoas:** Exibe todas as pessoas cadastradas no sistema.
* **Atualizar Pessoa:** Permite modificar os dados de uma pessoa existente, identificada por um ID ou outro identificador único.
* **Excluir Pessoa:** Permite remover uma pessoa do sistema, também identificada por um ID ou outro identificador único.

## Como Executar o Projeto

Para executar este projeto Java, você precisará ter o seguinte instalado em sua máquina:

* **Java Development Kit (JDK):** Certifique-se de ter uma versão compatível do JDK instalada. Você pode baixá-la no site da Oracle ou utilizar distribuições OpenJDK.
* **Ambiente de Desenvolvimento Integrado (IDE) ou Editor de Texto com Compilador:** Recomenda-se o uso de uma IDE como IntelliJ IDEA, Eclipse ou NetBeans para facilitar o desenvolvimento e a execução. Alternativamente, você pode usar um editor de texto e compilar o código via linha de comando.

### Passos para Execução

1.  **Clonar o Repositório:**
    ```bash
    git clone [https://github.com/Guilherme-Dev-Java/CadastroPessoaCRUD.git](https://github.com/Guilherme-Dev-Java/CadastroPessoaCRUD.git)
    cd CadastroPessoaCRUD
    ```

2.  **Abrir o Projeto na IDE (Opcional):**
    Se você estiver usando uma IDE, abra o diretório do projeto (`CadastroPessoaCRUD`). A IDE deverá reconhecer o projeto Java.

3.  **Compilar o Código:**
    * **Usando a IDE:** A IDE geralmente compila o código automaticamente ou oferece uma opção para construir o projeto.
    * **Usando a Linha de Comando:** Navegue até o diretório raiz do projeto (onde os arquivos `.java` estão localizados) e execute o seguinte comando:
        ```bash
        javac src/*.java # Se os arquivos estiverem diretamente em src
        # ou
        javac src/seu/pacote/*.java # Se estiverem em um pacote
        ```
        Certifique-se de ajustar o comando com a estrutura de pacotes do seu projeto.

4.  **Executar o Programa:**
    * **Usando a IDE:** A IDE geralmente oferece um botão "Run" ou uma opção para executar a classe principal do seu projeto.
    * **Usando a Linha de Comando:** Navegue até o diretório onde as classes compiladas estão (geralmente um diretório `bin` ou diretamente no diretório raiz após a compilação, dependendo da estrutura) e execute o seguinte comando:
        ```bash
        java seu.pacote.NomeDaClassePrincipal # Substitua pelo caminho correto da sua classe principal
        ```

### Configuração (Se Aplicável)

Se o seu projeto utiliza algum tipo de banco de dados ou arquivo para persistência, você pode precisar realizar alguma configuração adicional. Detalhes sobre essa configuração devem ser adicionados aqui. Por exemplo:

* **Banco de Dados:** Informações sobre o banco de dados utilizado (ex: MySQL, PostgreSQL, H2), as configurações de conexão (host, porta, usuário, senha) e como configurar o schema (se necessário).
* **Arquivos de Configuração:** Se houver arquivos de configuração (ex: `config.properties`), explique o propósito de cada propriedade e como modificá-las.

## Contribuições

Contribuições são sempre bem-vindas! Se você tiver alguma sugestão de melhoria, correção de bugs ou novas funcionalidades, sinta-se à vontade para:

1.  Fazer um fork do repositório.
2.  Criar uma branch com sua modificação (`git checkout -b feature/sua-melhoria`).
3.  Fazer o commit de suas alterações (`git commit -am 'Adiciona nova funcionalidade'`).
4.  Fazer o push para a branch (`git push origin feature/sua-melhoria`).
5.  Abrir um pull request.
