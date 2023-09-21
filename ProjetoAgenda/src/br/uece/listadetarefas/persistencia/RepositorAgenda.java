package br.uece.listadetarefas.persistencia;

import java.util.List;

import br.uece.listadetarefas.negocio.Agenda;

public interface RepositorAgenda{//Porta de Saída
    void salvarcontato(Agenda tarefa);
    Agenda buscarcontatoporid(int id);
    List<Agenda> listarcontatos();
    void atualizarcontato(Agenda tarefa);
    void excluircontato(int id);
}
