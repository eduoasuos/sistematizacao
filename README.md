#Sistematização

Projeto de Gerenciamento de Funcionários
Este é um projeto simples em Java que permite o gerenciamento das informações dos funcionários da empresa MGS (Max Global Sports). O sistema foi desenvolvido para ser utilizado pelo terminal, permitindo a inserção de dados de funcionários e busca por funcionários pelo nome.

Funcionalidades
Adicionar Novo Funcionário

Permite inserir informações de um novo funcionário, incluindo nome, email, telefone, alergias e condições médicas.
Buscar Funcionário por Nome

Permite buscar um funcionário existente pelo nome e exibir suas informações detalhadas.
Encerrar o Programa

Finaliza a execução do programa.
Estrutura do Projeto
O projeto é dividido em três classes principais:

Employee.java: Define a classe Employee, que representa um funcionário com atributos como nome, email, telefone, alergias e condições médicas.

EmployeeManager.java: Implementa a classe EmployeeManager, responsável por armazenar os funcionários e prover métodos para adicionar um novo funcionário e buscar um funcionário pelo nome.

Main.java: Classe principal que contém a lógica para interação com o usuário através do terminal. Aqui são apresentadas opções para adicionar funcionários, buscar funcionários e encerrar o programa.

Como Executar
Para executar o projeto:

Jdk 22 ou superior.
IDE Eclipse.

1. Importar o projeto:
No Eclipse, vá para o menu File (Arquivo) > Open Projects from File System... (Abrir Projetos do Sistema de Arquivos).

Na janela que se abre, clique em Directory... (Diretório) e selecione a pasta que contém seu projeto Java. Certifique-se de selecionar a pasta raiz do projeto, onde estão os arquivos Employee.java, EmployeeManager.java e Main.java.

Após selecionar a pasta correta, clique em Finish (Concluir).

3. Verificar e configurar o projeto:
O Eclipse deve agora ter importado o projeto para a sua workspace.

Certifique-se de que o projeto está configurado corretamente com o JDK apropriado:

Clique com o botão direito no nome do projeto na aba Project Explorer (Explorador de Projetos) à esquerda.
Vá para Build Path (Caminho de Compilação) > Configure Build Path... (Configurar Caminho de Compilação).
Na aba Libraries (Bibliotecas), verifique se o JRE System Library está configurado corretamente para o JDK que você deseja usar. Se necessário, ajuste a configuração para o JDK desejado.
4. Executar o projeto:
Agora que o projeto está aberto no Eclipse e configurado corretamente, você pode executar a classe Main.java para testar o sistema:

Clique com o botão direito no arquivo Main.java na aba Project Explorer.
Escolha Run As (Executar Como) > Java Application (Aplicação Java).
O console do Eclipse exibirá a saída do programa e você poderá interagir com ele através das opções fornecidas.
