package br.uece.listadetarefas;

import br.uece.listadetarefas.apresentacao.InterfaceUsuario;
import br.uece.listadetarefas.negocio.ServicoAgenda;
import br.uece.listadetarefas.persistencia.RepositorAgenda;
import br.uece.listadetarefas.persistencia.RepositorAgendajdbc;

public class Main {
	
	public static void main(String[] args) {

		try {
			
			// Acesso  a camada de Persitência
			RepositorAgenda repositoragenda = new RepositorAgendajdbc();

			// Acesso a camada de serviços/Negócio
			ServicoAgenda servicoagenda = new ServicoAgenda(repositoragenda);

			// Acesso a interface de usuário (console, linha de comando, etc.)
			InterfaceUsuario interfaceUsuario = new InterfaceUsuario(servicoagenda);

			interfaceUsuario.iniciar();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
