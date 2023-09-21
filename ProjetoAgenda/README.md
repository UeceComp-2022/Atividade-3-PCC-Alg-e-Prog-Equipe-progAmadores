# Projeto de Exemplo - Arquitetura de 3 Camadas

## Arquitetura de 3 Camadas

A Arquitetura de 3 Camadas é um padrão arquitetural que divide uma aplicação em três camadas distintas: Apresentação, Negócio e Persistência. Cada camada tem uma responsabilidade específica na aplicação.

### Modelo Geral das Camadas na Arquitetura de 3 Camadas:

1. **Camada de Apresentação**: Responsável pela interação com o usuário, exibição de informações e coleta de entrada do usuário.

2. **Camada de Negócio**: Contém a lógica de negócios da aplicação, incluindo regras de negócios e manipulação de dados.

3. **Camada de Persistência**: Responsável pelo acesso aos dados e interação com sistemas de armazenamento de dados, como bancos de dados.

## Estrutura de Pacotes e Classes do Projeto:

A estrutura de pacotes e classes do projeto segue os princípios da Arquitetura de 3 Camadas:

- `br.uece.listadetarefas.Main.java`: Classe principal que inicia a aplicação.

- `br.uece.listadetarefas.apresentacao.InterfaceUsuario.java`: Classe responsável pela interação com o usuário (GUI).

- `br.uece.listadetarefas.negocio.ServicoTarefa.java`: Classe que implementa a lógica de negócios para a gestão de contatos.

- `br.uece.listadetarefas.negocio.Tarefa.java`: Classe que representa o modelo de negócios "Contato".

- `br.uece.listadetarefas.persistencia.ConexaoJdbcUtil.java`: Classe que lida com a conexão com o banco de dados.

- `br.uece.listadetarefas.persistencia.RepositorioTarefa.java`: Interface que define operações para o repositório de contatos.

- `br.uece.listadetarefas.persistencia.RepositorioTarefaJdbc.java`: Classe que implementa o repositório de contatos usando JDBC.

## Como Utilizar o Projeto:

1. Clone o repositório para o seu ambiente de desenvolvimento.

2. Importe o projeto em sua IDE de escolha.

3. Execute a classe `Main.java` para iniciar a aplicação.

4. Explore as classes e pacotes para entender a estrutura e os princípios da Arquitetura de 3 Camadas aplicados neste projeto.

5. Personalize o projeto para atender às necessidades específicas da sua aplicação.

## Como Abrir o Projeto no Eclipse:

Para abrir o projeto no Eclipse, siga os passos abaixo:

1. Certifique-se de que você tem o Eclipse instalado em seu sistema. Se você ainda não o tiver, faça o download da versão adequada para o seu sistema operacional no [site oficial do Eclipse](https://www.eclipse.org/downloads/).

2. Abra o Eclipse.

3. No menu "File" (Arquivo), selecione "Import" (Importar).

4. Na janela de diálogo "Import", expanda a pasta "General" e selecione "Existing Projects into Workspace" (Projetos Existente no Espaço de Trabalho).

5. Clique em "Next" (Próximo).

6. Na próxima tela, selecione "Select root directory" (Selecionar diretório raiz).

7. Clique em "Browse" (Procurar) e navegue até a pasta raiz do projeto (onde você clonou ou baixou o repositório).

8. Selecione a pasta do projeto "Exemplo3ArquiteturaTresCamadas" na lista de projetos.

9. Clique em "Finish" (Concluir).

O Eclipse importará o projeto para o seu ambiente de desenvolvimento. Agora você pode explorar e trabalhar no projeto usando o Eclipse.


## Utilizando o SQLlint e DBeaver:

### Passo a Passo para Usar o SQLlint (Armazenamento no arquivo `test.bd`):

**SQLite**: O SQLite no contexto do Java é um sistema de gerenciamento de banco de dados relacional embutido, amplamente utilizado para aplicativos móveis e de desktop. É leve, não requer um servidor dedicado e é incorporado diretamente nas aplicações Java. Usado para armazenar e gerenciar dados de maneira eficiente, é acessado através de bibliotecas JDBC ou APIs específicas do SQLite para Java, tornando-se uma escolha popular para aplicativos que necessitam de um banco de dados local eficaz.

   - Faça o download do jar do SQLite em seu sistema a partir do site oficial ou no repositório central do Maven (dá para baixar o jar via link tb). Link par abaixá-la: [sqlite-jdbc-3.43.0.0.jar](https://repo1.maven.org/maven2/org/xerial/sqlite-jdbc/3.43.0.0/sqlite-jdbc-3.43.0.0.jar)

   - Para adicionar um arquivo JAR ao classpath no Eclipse, acesse as propriedades do projeto, vá para "Java Build Path," na guia "Libraries," adicione o JAR via "Add JARs" ou "Add External JARs."

   - Você pode agora executar consultas SQL no arquivo `test.bd` utilizando o SQLite.

**DBeaver**: O DBeaver é uma IDE de banco de dados universal que permite gerenciar e interagir com diversos sistemas de gerenciamento de banco de dados. LInk: [dbeaver.io/download](https://dbeaver.io/download)

   - Faça o download e a instalação do DBeaver em seu sistema a partir do site oficial.

   - Após a instalação, abra o DBeaver.

   - Crie uma nova conexão ao banco de dados usando as informações do arquivo `test.bd`. Certifique-se de selecionar o driver de banco de dados adequado.

   - Estabeleça a conexão com o banco de dados  e comece a explorar e executar consultas usando o DBeaver.
     

## Executando o Script SQL

Para criar a tabela no banco de dados SQLite `test.db` usando o DBAVER, siga estas etapas:

1. Baixe o arquivo [script.sql](https://github.com/UeceComp-2022/Exemplos_PCC/blob/main/Exemplo3ArquieturaTresCamadas/script.sql) para o seu computador.

2. Abra o DBAVER e conecte-se ao banco de dados `test.db`.

3. Na interface do DBAVER, abra o arquivo `script.sql` que você baixou anteriormente.

4. Execute o script SQL pressionando o botão "Executar" ou equivalente na interface do DBAVER.

A tabela `Contato` será criada no banco de dados `test.db` com as colunas especificadas no script.


## Contribuições:

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) e enviar solicitações de pull (pull requests) para melhorar este projeto.

## Licença:

Este projeto está licenciado sob a [Licença MIT](LICENSE).
