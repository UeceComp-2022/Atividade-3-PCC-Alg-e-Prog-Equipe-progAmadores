package br.uece.listadetarefas.negocio;

import java.util.List;
import java.util.Scanner;

import br.uece.listadetarefas.persistencia.RepositorAgenda;

public class ServicoAgenda {

	private RepositorAgenda repositorioTarefa;

	public ServicoAgenda(RepositorAgenda servicoTarefa) {
		this.repositorioTarefa = servicoTarefa;
	}

	public void listarcontatos() {
		List<Agenda> tarefas = repositorioTarefa.listarcontatos();
		if (tarefas.isEmpty()) {
			System.out.println("Nenhum contato encontrado.");
		} else {
			System.out.println("==== contatos ====");
			for (Agenda tarefa : tarefas) {
				System.out.println("ID: " + tarefa.getId());
				System.out.println("nome: " + tarefa.getTitulo());
				System.out.println("email: " + tarefa.getDescricao());
				System.out.println("-----------------");
			}
		}
	}

	public void criarContato(Scanner scanner) {
		System.out.print("Digite o nome do contato: ");
		String titulo = scanner.nextLine();
		System.out.print("Digite o email do contato: ");
		String descricao = scanner.nextLine();

		Agenda novaTarefa = new Agenda(0, titulo, descricao, 0);
		repositorioTarefa.salvarcontato(novaTarefa);
		System.out.println("contato criado com sucesso!");
	}

	public void atualizarcontato(Scanner scanner) {
		System.out.print("Digite o ID do contato que deseja atualizar: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume the newline

		Agenda tarefaExistente = repositorioTarefa.buscarcontatoporid(id);

		if (tarefaExistente == null) {
			System.out.println("contato não encontrado.");
			return;
		}

		System.out.print("Digite o novo contato: ");
		String novoTitulo = scanner.nextLine();
		System.out.print("Digite a novo email do contato: ");
		String novaDescricao = scanner.nextLine();

		Agenda tarefaAtualizada = new Agenda(id, novoTitulo, novaDescricao, id);
		repositorioTarefa.atualizarcontato(tarefaAtualizada);
		System.out.println("contato atualizado com sucesso!");
	}

	public void removercontato(Scanner scanner) {
		System.out.print("Digite o ID do contato que deseja remover: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume the newline

		Agenda tarefaExistente = repositorioTarefa.buscarcontatoporid(id);

		if (tarefaExistente == null) {
			System.out.println("contato não encontrado.");
			return;
		}

		repositorioTarefa.excluircontato(id);
		System.out.println("contato removido com sucesso!");
	}
}
