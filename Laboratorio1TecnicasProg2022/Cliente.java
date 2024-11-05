public class Cliente {
	private int id;
	private String nome;
	private int cpf;
	
	public Cliente(int cpf) {
		this.cpf=cpf;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length()>=3)
			this.nome = nome;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		if(id>0)
		this.id = id;
	}
}
