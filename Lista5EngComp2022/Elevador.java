package lista_05;

public class Elevador {
	private int andarAtual = 0;
	private int numeroDeAndares;
	private int capacidade;
	private int quantidadeDePessoasPresentes;

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getNumeroDeAndares() {
		return numeroDeAndares;
	}

	public void setNumeroDeAndares(int numeroDeAndares) {
		this.numeroDeAndares = numeroDeAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getQuantidadeDePessoasPresentes() {
		return quantidadeDePessoasPresentes;
	}

	public void setQuantidadeDePessoasPresentes(int quantidadeDePessoasPresentes) {
		this.quantidadeDePessoasPresentes = quantidadeDePessoasPresentes;
	}

	public void inicializa(int capacidade, int numeroDeAndares) {
		this.capacidade = capacidade;
		this.numeroDeAndares = numeroDeAndares;
	}

	public void entra() {
		if (quantidadeDePessoasPresentes < capacidade)
			quantidadeDePessoasPresentes++;
	}

	public void sai() {
		if (quantidadeDePessoasPresentes > 0)
			quantidadeDePessoasPresentes--;
	}

	public void sobe() {
		if (andarAtual < numeroDeAndares)
			andarAtual++;
	}

	public void desce() {
		if (andarAtual > 0)
			andarAtual--;
	}

}
