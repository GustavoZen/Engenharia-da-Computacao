public class Cabelereiro {
	private int cpf;
	private String nome;
	private int id;

	public Cabelereiro(int cpf, String nome) {
		this.cpf = cpf;
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() >= 3)
			this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0)
			this.id = id;
	}

}
