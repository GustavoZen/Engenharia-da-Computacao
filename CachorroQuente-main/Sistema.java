package cachorroQuente;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	static Scanner input = new Scanner(System.in);

	static void selecionarProteina(int i, CachorroQuente c) {
		int proteina = 0;
		while (proteina == 0) {
			System.out.println("Qual a proteina do seu " + (i + 1) + "º cachorro quente:");
			System.out.println("1.Salsicha\n2.Linguica\n3.Frango\n4.Bacon");
			proteina = input.nextInt();
			if (proteina == 1) {
				c.proteina = "Salsicha";
			} else if (proteina == 2) {
				c.proteina = "Linguica";
			} else if (proteina == 3) {
				c.proteina = "Frango";
			} else if (proteina == 4) {
				c.proteina = "Bacon";
			} else {
				System.out.println("Numero invalido");
				proteina = 0;
			}
		}
	}

	static void selecionarQueijo(int i, CachorroQuente c) {
		int queijo = 0;
		while (queijo == 0) {
			System.out.println("Qual o queijo do seu " + (i + 1) + "º cachorro quente:");
			System.out.println("1.Mussarela\n2.Prato\n3.Parmesao\n4.Coalho");
			queijo = input.nextInt();
			if (queijo == 1) {
				c.proteina = "Mussarela";
			} else if (queijo == 2) {
				c.proteina = "Prato";
			} else if (queijo == 3) {
				c.proteina = "Parmesao";
			} else if (queijo == 4) {
				c.proteina = "Coalho";
			} else {
				System.out.println("Numero invalido");
				queijo = 0;
			}
		}
	}

	static void selecionarIngredientes(int i, CachorroQuente c) {
		System.out.println("O Aluno quer ketchup?");
		System.out.println("1.Sim\n2.Não");
		int r = input.nextInt();
		if (r == 1)
			c.ingredientes.add("ketchup");
		System.out.println("O Aluno quer maionese?");
		r = input.nextInt();
		if (r == 1)
			c.ingredientes.add("maionese");
		System.out.println("O Aluno quer ovo?");
		r = input.nextInt();
		if (r == 1)
			c.ingredientes.add("ovo");
		System.out.println("O Aluno quer batata palha?");
		r = input.nextInt();
		if (r == 1)
			c.ingredientes.add("batata palha");
	}

	static void selecionarBebida(CachorroQuente c) {
		int bebida = 0;
		while (bebida == 0) {
			System.out.println("Qual a Bebida?");
			System.out.println("1.Coca-Cola\n2.Delrio\n3.Suco do Chaves");
			bebida = input.nextInt();
			if (bebida == 1)
				c.proteina = "Coca-Cola";
			else if (bebida == 2)
				c.proteina = "Delrio";
			else if (bebida == 3)
				c.proteina = "Suco do Chaves";
			else {
				System.out.println("Numero invalido");
				bebida = 0;
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Aluno> vendas = new ArrayList<>();
		int r = 1, cont = 1;

		System.out.println("Começo do dia");
		while (r != 0) {
			Aluno a = new Aluno();
			System.out.println("Insira as informações do aluno\nNome:");
			a.nome = input.next();
			System.out.println("Matricula:");
			a.matricula = input.nextInt();
			System.out.println(cont + "º cliente do dia");
			System.out.println("Quantos cachorros quentes ele deseja? (0 encerrara o codigo)");
			r = input.nextInt();
			for (int i = 0; i < r; i++) {
				CachorroQuente c = new CachorroQuente();
				selecionarProteina(i, c);
				selecionarQueijo(i, c);
				selecionarIngredientes(i, c);
				selecionarBebida(c);
				a.compras.add(c);
			}
			vendas.add(a);
			cont++;
		}
	}
}
