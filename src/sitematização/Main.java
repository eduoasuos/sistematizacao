package sitematização;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorFuncionario gerenciador = new GerenciadorFuncionario();

        
        System.out.println("### Sistema de Gerenciamento de Funcionários ###");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nOpções:");
            System.out.println("1. Adicionar novo funcionário");
            System.out.println("2. Buscar funcionário por nome");
            System.out.println("3. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\n### Adicionar novo funcionário ###");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Alergias: ");
                    String alergias = scanner.nextLine();
                    System.out.print("Condições Médicas: ");
                    String condicoesMedicas = scanner.nextLine();

                    Funcionario novoFuncionario = new Funcionario(nome, email, telefone, alergias, condicoesMedicas);
                    gerenciador.adicionarFuncionario(novoFuncionario);
                    System.out.println("Funcionário adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n### Buscar funcionário por nome ###");
                    System.out.print("Nome do funcionário: ");
                    String nomeBusca = scanner.nextLine();

                    Funcionario funcionarioEncontrado = gerenciador.buscarFuncionarioPorNome(nomeBusca);
                    if (funcionarioEncontrado != null) {
                        System.out.println("Funcionário encontrado:");
                        System.out.println("Nome: " + funcionarioEncontrado.getNome());
                        System.out.println("Email: " + funcionarioEncontrado.getEmail());
                        System.out.println("Telefone: " + funcionarioEncontrado.getTelefone());
                        System.out.println("Alergias: " + funcionarioEncontrado.getAlergias());
                        System.out.println("Condições Médicas: " + funcionarioEncontrado.getCondicoesMedicas());
                    } else {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("\nEncerrando o programa.");
                    continuar = false;
                    break;

                default:
                    System.out.println("\nOpção inválida. Escolha uma opção válida.");
                    break;
            }
        }

        scanner.close();
    }
}
