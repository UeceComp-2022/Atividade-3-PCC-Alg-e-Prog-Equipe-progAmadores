package br.uece.listadetarefas.negocio;

public class Agenda {
    private int id;
    private String nome;
    private String email;

    // Construtor
    public Agenda(int id, String nome, String email, int endereço) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public void Agenda11(int id2, String novoTitulo, String novaDescricao, int id3) {
		// TODO Auto-generated constructor stub
	}

	public void Agenda1(int id2, String titulo, String descricao, int endereço) {
		// TODO Auto-generated constructor stub
	}

	// Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
        return nome;
    }

    public void setTitulo(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return email;
    }

    public void setDescricao(String email) {
        this.email = email;
    }
}
