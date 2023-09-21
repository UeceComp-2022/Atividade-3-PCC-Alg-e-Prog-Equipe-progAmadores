package br.uece.listadetarefas.apresentacao;

import java.util.List;
import java.util.Scanner;

import br.uece.listadetarefas.negocio.Agenda;
import br.uece.listadetarefas.negocio.ServicoAgenda;
import br.uece.listadetarefas.persistencia.RepositorAgenda;

public class InterfaceUsuario {
	
    private ServicoAgenda incluircontato;

    public InterfaceUsuario(ServicoAgenda servicoTarefa) {
        this.incluircontato = servicoTarefa;
    }

    public void iniciar() {
    	
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirOpcoesMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (opcao) {
                case 1:
                	incluircontato.listarcontatos();
                    break;
                case 2:
                	incluircontato.criarContato(scanner);
                    break;
                case 3:
                	incluircontato.atualizarcontato(scanner);
                    break;
                case 4:
                	incluircontato.removercontato(scanner);
                    break;
                case 5:
                    System.out.println("Saindo da aplicação.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void exibirOpcoesMenu() {
        System.out.println("==== Menu ====");
        System.out.println("1. consultar contatos");
        System.out.println("2. incluir um novo contato");
        System.out.println("3. modificar as informações do contato");
        System.out.println("4. deletar contatos");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

}
