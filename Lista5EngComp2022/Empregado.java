package lista_05;

public class Empregado {
	private int id;
	private String nome;
	private String sobrenome;
	private float salarioMensal = 1000;
	private boolean[] diasTrabalados = new boolean[30];

	private int intdiasTrabalhados() {
		int cont = 0;
		for (int i = 0; i < diasTrabalados.length; i++) {
			if (diasTrabalados[i])
				cont++;
		}
		return cont;
	}

	public Empregado(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Empregado(String nome, String sobrenome, int id) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.id = id;
	}

	public boolean[] getDiasTrabalhados() {
		return this.diasTrabalados;
	}

	public void setDiasTrabalhados(boolean[] a) {
		this.diasTrabalados = a;
	}

	public float calcularSalario() {
		float salario = salarioMensal;
		if (intdiasTrabalhados() == 30)
			System.out.println(salario = (salarioMensal + (salarioMensal) / 100));
		else if (intdiasTrabalhados() >= 25 && intdiasTrabalhados() <= 27)
			System.out.println(salario = salarioMensal * 98 / 100);
		else if (intdiasTrabalhados() <= 24 && intdiasTrabalhados() >= 20)
			System.out.println(salario = salarioMensal * 97 / 100);
		else if (intdiasTrabalhados() < 20)
			System.out.println(salario = salarioMensal * 20 / 100);

		return salario;
	}
}
