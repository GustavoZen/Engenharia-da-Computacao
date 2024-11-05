package lista_05;

public class Main {
	public static void separarQuestão() {
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
	}

	public static void main(String[] args) {
		int i = 0;
		Pessoa n1 = new Pessoa(14, 3, 1879, "Albert Einstein");
		Pessoa n2 = new Pessoa(4, 4, 1643, "Isaac Newton");
		System.out.println("Idade de " + n1.informaNome() + " caso estivesse vivo: " + n1.getIdade());
		System.out.println("Idade de " + n2.informaNome() + " caso estivesse vivo: " + n2.getIdade());

		separarQuestão();

		Círculo c = new Círculo(100);
		c.aumentarCírculo(100);
		c.getArea();
		c.getCircunferência();

		separarQuestão();

		Produto carne = new Produto(10, 15, "Carne");
		System.out.println("Lucro: " + carne.getMDL() + "%");

		separarQuestão();

		Empregado E = new Empregado("José", "Carlos,15");
		for (boolean[] a = new boolean[30]; i < E.getDiasTrabalhados().length; i++) {
			a[i] = true;
			if (i > 25)
				a[i] = false;
			if (i == 29)
				E.setDiasTrabalhados(a);
		}
		E.calcularSalario();
		
		separarQuestão();
		
		Robô Bot = new Robô();
		int[][] matrizRobo = new int [10][10];
	}

}
